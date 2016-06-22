package com.sztx.mall.adapter.berbon.util;

import com.sztx.mall.adapter.berbon.config.BerbonConfigInfo;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 17:05
 */
public class SignUtil {
    public static void sign(Map<String,String> map)
    {
        map.put("sign",sign(map.get("data")));
    }
    public static boolean verifySign(Map<String, String> map) {
        boolean flag = false;
        String sign = map.get("sign");
        String encryptSign = sign(map.get("data"));
        if (encryptSign.equals(sign)) {
            flag = true;
        }
        return flag;
    }
    private static String sign(String arg)
    {
        return DigestUtils.md5Hex(getContentBytes(getMd5String(arg), "utf-8"));
    }
    private static String getMd5String(String arg)
    {
        return BerbonConfigInfo.BERBON_PARTNER_ID+arg+BerbonConfigInfo.BERBON_PARTNER_KEY;
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
