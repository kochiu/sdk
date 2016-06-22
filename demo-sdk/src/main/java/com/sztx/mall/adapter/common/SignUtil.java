package com.sztx.mall.adapter.common;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

/**
 * User : LiuKe
 * Date : 2016/5/18
 * Time : 11:30
 */
public class SignUtil {

    private static String MDK_KEY = "S7Eqgt15QOc3vOS7CwOAeaGTQULriSLr";

    private static Logger logger = LoggerFactory.getLogger(SignUtil.class);

    public static boolean checkSign(Map<String, String> map) {
        boolean flag = false;
        String sign = map.get("sign");
        String encryptSign = sign(map);
        if (encryptSign.equals(sign)) {
            flag = true;
        }
        return flag;
    }

    public static String sign(Map<String, String> map) {
        StringBuffer signStr = new StringBuffer();
        String sign = "";
        Map<String, String> sortMap = new TreeMap();
        for (String key : map.keySet()) {
            if (!"sign".equals(key)) {
                String value = map.get(key);
                sortMap.put(key, value);
            }
        }
        for (String key : sortMap.keySet()) {
            Object value = map.get(key);
            if (signStr.length() == 0) {
                signStr.append(key + "=" + value);
            } else if (value != null) {
                signStr.append("&" + key + "=" + value);
            }
        }
        signStr.append("&key=" + MDK_KEY);
        logger.info("sdk signStr :" + signStr);
        sign = DigestUtils.md5Hex(getContentBytes(signStr.toString(), "utf-8"));
        return sign;
    }

    /**
     * @param content
     * @param charset
     * @return
     * @throws java.security.SignatureException
     * @throws java.io.UnsupportedEncodingException
     */
    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset)) {
            return content.getBytes();
        }
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
        }
    }
}
