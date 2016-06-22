package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:58
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetailLogstor {

    @XmlElement(name = "logstor_id")
    private String logstorId;
    @XmlElement(name = "logstor_mer_id")
    private String logstorMerId;

    public String getLogstorId() {
        return logstorId;
    }

    public void setLogstorId(String logstorId) {
        this.logstorId = logstorId;
    }

    public String getLogstorMerId() {
        return logstorMerId;
    }

    public void setLogstorMerId(String logstorMerId) {
        this.logstorMerId = logstorMerId;
    }
}
