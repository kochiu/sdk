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
 * Time : 14:34
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCRefund {
    @XmlElement(name="order_id")
    private String orderId;
    @XmlElement(name="refund_id")
    private String refundId;
    @XmlElement(name="refund_ts")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date refundTs;
    @XmlElement(name="refund_status")
    private String refundStatus;
    @XmlElement(name="refund_total_amount")
    private String refundTotalAmount;
    @XmlElement(name="refund_freight")
    private String refundFreight;
    @XmlElement(name="refund_cash")
    private String refundCash;
    @XmlElement(name="refund_score")
    private String refundScore;
    @XmlElement(name="refund_coupon")
    private String refundCoupon;
    @XmlElement(name="refund_confirm_ts")
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private Date refundConfirmTs;
    @XmlElement(name="refund_prod_flag")
    private String refundProdFlag;
    @XmlElement(name="re_detail_address")
    private String reDetailAddress;
    @XmlElement(name="re_zip")
    private String reZip;
    @XmlElement(name="re_person")
    private String rePerson;
    @XmlElement(name="re_tel")
    private String reTel;
    @XmlElementWrapper(name="products")
    @XmlElement(name = "product")
    private List<ICBCRefundProduct> refundProductList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Date getRefundTs() {
        return refundTs;
    }

    public void setRefundTs(Date refundTs) {
        this.refundTs = refundTs;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundTotalAmount() {
        return refundTotalAmount;
    }

    public void setRefundTotalAmount(String refundTotalAmount) {
        this.refundTotalAmount = refundTotalAmount;
    }

    public String getRefundFreight() {
        return refundFreight;
    }

    public void setRefundFreight(String refundFreight) {
        this.refundFreight = refundFreight;
    }

    public String getRefundCash() {
        return refundCash;
    }

    public void setRefundCash(String refundCash) {
        this.refundCash = refundCash;
    }

    public String getRefundScore() {
        return refundScore;
    }

    public void setRefundScore(String refundScore) {
        this.refundScore = refundScore;
    }

    public String getRefundCoupon() {
        return refundCoupon;
    }

    public void setRefundCoupon(String refundCoupon) {
        this.refundCoupon = refundCoupon;
    }

    public Date getRefundConfirmTs() {
        return refundConfirmTs;
    }

    public void setRefundConfirmTs(Date refundConfirmTs) {
        this.refundConfirmTs = refundConfirmTs;
    }

    public String getRefundProdFlag() {
        return refundProdFlag;
    }

    public void setRefundProdFlag(String refundProdFlag) {
        this.refundProdFlag = refundProdFlag;
    }

    public String getReDetailAddress() {
        return reDetailAddress;
    }

    public void setReDetailAddress(String reDetailAddress) {
        this.reDetailAddress = reDetailAddress;
    }

    public String getReZip() {
        return reZip;
    }

    public void setReZip(String reZip) {
        this.reZip = reZip;
    }

    public String getRePerson() {
        return rePerson;
    }

    public void setRePerson(String rePerson) {
        this.rePerson = rePerson;
    }

    public String getReTel() {
        return reTel;
    }

    public void setReTel(String reTel) {
        this.reTel = reTel;
    }

    public List<ICBCRefundProduct> getRefundProductList() {
        return refundProductList;
    }

    public void setRefundProductList(List<ICBCRefundProduct> refundProductList) {
        this.refundProductList = refundProductList;
    }
}
