package com.sztx.mall.adapter.icbc.model.businessModel;

import com.sztx.mall.adapter.common.JaxbTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 8:58
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCPayment {

    @XmlElement(name="order_pay_time")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date orderPayTime;
    @XmlElement(name="order_pay_amount")
    private String orderPayAmount;
    @XmlElement(name="order_pay_sys")
    private String orderPaySys;
    @XmlElement(name="order_discount_amount")
    private String orderDiscountAmount;
    @XmlElement(name="order_freight")
    private String orderFreight;
    @XmlElement(name="pay_serial")
    private String paySerial;
    @XmlElementWrapper(name="coupons")
    @XmlElement(name = "coupon")
    private List<ICBCCoupon> couponList;

    public ICBCPayment() {
    }

    public Date getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public String getOrderPayAmount() {
        return orderPayAmount;
    }

    public void setOrderPayAmount(String orderPayAmount) {
        this.orderPayAmount = orderPayAmount;
    }

    public String getOrderPaySys() {
        return orderPaySys;
    }

    public void setOrderPaySys(String orderPaySys) {
        this.orderPaySys = orderPaySys;
    }

    public String getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(String orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }

    public String getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(String orderFreight) {
        this.orderFreight = orderFreight;
    }

    public String getPaySerial() {
        return paySerial;
    }

    public void setPaySerial(String paySerial) {
        this.paySerial = paySerial;
    }

    public List<ICBCCoupon> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<ICBCCoupon> couponList) {
        this.couponList = couponList;
    }
}
