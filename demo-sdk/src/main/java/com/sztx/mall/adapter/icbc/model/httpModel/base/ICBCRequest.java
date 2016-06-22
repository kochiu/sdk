package com.sztx.mall.adapter.icbc.model.httpModel.base;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 14:17
 */
public class ICBCRequest {
    private String authCode;
    private String appKey;
    private String appSecret;
    private String reqSid;
    private String sign;

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getReqSid() {
        return reqSid;
    }

    public void setReqSid(String reqSid) {
        this.reqSid = reqSid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
