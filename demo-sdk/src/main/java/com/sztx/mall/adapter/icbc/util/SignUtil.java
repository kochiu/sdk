package com.sztx.mall.adapter.icbc.util;

import com.sztx.mall.adapter.common.XmlUtil;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponse;
import com.sztx.se.common.exception.BusinessException;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:32
 */
public class SignUtil {


    public static Map<String,String> sign(Map<String,String> publicMap , Map<String,String> privateMap , ICBCRequest request) throws Exception {
        String reqData = Util.getReqData(privateMap);
        String signString = getSignString(request.getAppKey(),request.getAuthCode(),reqData);

        Map<String,String> requestMap = new HashMap<>();
        requestMap.put("sign", encode(signString,request.getAppSecret()));
        requestMap.put("method",publicMap.get("method"));
        requestMap.put("version",publicMap.get("version"));
        requestMap.put("format",publicMap.get("format"));
        requestMap.put("timestamp",publicMap.get("timestamp"));
        requestMap.put("req_sid", publicMap.get("req_sid"));
        requestMap.put("app_key",publicMap.get("app_key"));
        requestMap.put("auth_code",publicMap.get("auth_code"));
        requestMap.put("req_data", reqData);
        return requestMap;
    }

    private static String getSignString(String appKey , String authCode , String reqData)
    {
        return "app_key="+appKey+"&auth_code="+authCode+"&req_data="+reqData;
    }

    public static String base64Decode(String s) throws Exception {
        Base64 base64= new Base64();
        return new String(base64.decode(s.getBytes()));
    }
    public static String SHA256Encode(String s , String appSecret) throws Exception {
        byte[] bytes = encryptHMAC(s.getBytes("UTF-8"), appSecret); //密文编码字符集使用UTF-8
        return new String(bytes,"UTF-8");
    }
    public static String encode(String s , String appSecret) throws Exception {
        byte[] bytes = encryptHMAC(s.getBytes("UTF-8"), appSecret); //密文编码字符集使用UTF-8
        Base64 base64= new Base64();  //使用sun.misc.BASE64Encoder提供的base64（或使用标准base64）编码密文
        return new String(base64.encode(bytes));
    }


    public static byte[] encryptHMAC(byte[] data, String appSecret) throws Exception {
        SecretKey sk = new SecretKeySpec(appSecret.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance(sk.getAlgorithm());
        mac.init(sk);
        return mac.doFinal(data);
    }

    public static void verify(String xml ,String appSecret) throws Exception {
        String bodyXml = Util.getBody(xml);
        ICBCResponse response = XmlUtil.fromXML(xml, ICBCResponse.class);
        String mySign = encode(bodyXml, appSecret);
        String sign  = response.getHead().getSign();
//        if(!mySign.equals(sign))
//        {
//            throw new BusinessException("验签失败");
//        }
    }

    public static void main(String[] args) throws Exception{
        String appSecret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String a_sign = "g3guqbKplPlwg6BmmJmm+U3qdEh9prcgxaUneqO3NCg=";
        String bodyXml="<body><server_time>2016-06-01 15:19:31</server_time></body>";
        String my_sign  = encode(bodyXml,"a_sign");
        System.out.println(my_sign);
        //47D7pH91kwTMmzhA9QoNEH7m3SXt/3F0SjGawk+kKGo=
    }
}
