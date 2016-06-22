package com.sztx.mall.adapter.ccb.model.httpModel.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 10:36
 */

@XmlRootElement(name="head")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerRequestHead {

    //交易编码	char / 5	非空
    @XmlElement(name = "tran_code")
    private String tranCode;
    //客户编号	char /8	非空
    @XmlElement(name = "cust_id")
    private String custId;
    //流水号	char / 20	非空
    @XmlElement(name = "tran_sid")
    private String tranSid;

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTranSid() {
        return tranSid;
    }

    public void setTranSid(String tranSid) {
        this.tranSid = tranSid;
    }
}
