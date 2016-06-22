package com.sztx.mall.adapter.icbc.model.businessModel;


import com.sztx.mall.adapter.common.JaxbTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:14
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCOrder {

    @XmlElement(name = "order_id")
    private String orderId;
    @XmlElement(name = "order_create_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date orderCreateTime;
    @XmlElement(name = "order_modify_time")
    private Date orderModifyTime;
    @XmlElement(name = "order_status")
    private String orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderModifyTime() {
        return orderModifyTime;
    }

    public void setOrderModifyTime(Date orderModifyTime) {
        this.orderModifyTime = orderModifyTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
