package com.sztx.mall.adapter.icbc.model.xmlModel.base;

import javax.xml.bind.annotation.*;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 17:43
 */

@XmlRootElement(name="head")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCResponseHead {
    private String method;
    @XmlElement(name = "req_sid")
    private String reqSid;
    private String version;
    private String timestamp;
    @XmlElement(name = "app_key")
    private String appKey;
    @XmlElement(name = "auth_code")
    private String authCode;
    @XmlElement(name = "ret_code")
    private String retCode;
    @XmlElement(name = "ret_msg")
    private String retMsg;
    private String sign;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getReqSid() {
        return reqSid;
    }


    public void setReqSid(String reqSid) {
        this.reqSid = reqSid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
