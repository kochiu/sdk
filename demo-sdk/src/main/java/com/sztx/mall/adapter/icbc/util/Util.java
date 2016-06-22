package com.sztx.mall.adapter.icbc.util;

import com.sztx.se.common.util.date.DateUtil;
import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.util.*;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:43
 */
public class Util {

    public static String getReqData(Map<String,String> map)
    {
        StringBuffer xml = new StringBuffer();
        String head = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><body>";
        String foot = "</body>";
        StringBuffer content = new StringBuffer();
        if(map!=null&&map.size()>0)
        {
            for(String key : map.keySet())
            {
                String value = map.get(key);
                value = value==null?"":value;
                content.append("<").append(key).append(">").append(value).append("</").append(key).append(">");
            }
        }
        xml.append(head).append(content).append(foot);
        return xml.toString();
    }

    public static String getDateString(Date date)
    {
       if(date==null)
       {
           return "";
       }
        return DateUtil.formatDate(date,"yyyy-MM-dd HH:mm:ss");
    }
    public static String getDateStringHour(Date date)
    {
        if(date==null)
        {
            return "";
        }
        return DateUtil.formatDate(date,"yyyyMMddHH");
    }
    public static String getDateStringMillisecond(Date date)
    {
        if(date==null)
        {
            return "";
        }
        return DateUtil.formatDate(date,"yyyy-MM-dd HH:mm:ss.SSSSS");
    }

    /**
     * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, String> params) throws UnsupportedEncodingException {

        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);

            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }
        return prestr;
    }

    public static String getIdString(List<String> orderIdList)
    {
        if(orderIdList==null||orderIdList.size()==0)
        {
            return  "";
        }
        int size = orderIdList.size();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < size ; i ++)
        {
            if(i!=size-1)
            {
                sb.append(orderIdList.get(i)).append(",");
            }else
            {
                sb.append(orderIdList.get(i));
            }
        }
        return sb.toString();
    }

    public static String getBody(String xml)
    {
        int bodyStart = xml.indexOf("<body>");
        int bodyEnd = xml.indexOf("</body>")+7;
        return xml.substring(bodyStart,bodyEnd);
    }

    /**
     * 将图片转为Base64编码的字符串
     */
    public static String img2String(File imageFile) throws IOException {
        InputStream in = new FileInputStream(imageFile);
        byte[] data =  new byte[in.available()];
        in.read(data);
        in.close();
        Base64 base64= new Base64();
        return new String(base64.encode(data));
    }
    /**
     * 将图片转为Base64编码的字符串
     */
    public static String img2String(byte[] data) throws IOException {
        return new String(new Base64().encode(data));
    }
}
