package com.sztx.mall.adapter.ccb.model.httpModel.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 11:17
 */

@XmlRootElement(name="head")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerResponseHead {

    //流水号	char / 20	非空
    @XmlElement(name = "tran_sid")
    private String tranSid;

    //客户编号	char /8	非空
    @XmlElement(name = "cust_id")
    private String custId;

    //返回码	char / 6	非空
    @XmlElement(name = "ret_code")
    private String retCode;

    //返回信息	varchar / 255
    @XmlElement(name = "ret_msg")
    private String retMsg;

    public String getTranSid() {
        return tranSid;
    }

    public void setTranSid(String tranSid) {
        this.tranSid = tranSid;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
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
}
