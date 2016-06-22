package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.common.JaxbTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 15:42
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCTimeQueryResponseBody {

    @XmlElement(name = "server_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date serverTime;

    public Date getServerTime() {
        return serverTime;
    }

    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }
}
