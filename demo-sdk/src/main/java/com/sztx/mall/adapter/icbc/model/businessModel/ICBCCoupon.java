package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 10:45
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCCoupon {

    @XmlElement(name="coupon_id")
    private String couponId;
    @XmlElement(name="coupon_promo_id")
    private String couponPromoId;
    @XmlElement(name="coupon_org_amount")
    private String couponOrgAmount;
    @XmlElement(name="coupon_use_amount")
    private String couponUseAmount;
    @XmlElement(name="coupon_type")
    private String couponType;

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponPromoId() {
        return couponPromoId;
    }

    public void setCouponPromoId(String couponPromoId) {
        this.couponPromoId = couponPromoId;
    }

    public String getCouponOrgAmount() {
        return couponOrgAmount;
    }

    public void setCouponOrgAmount(String couponOrgAmount) {
        this.couponOrgAmount = couponOrgAmount;
    }

    public String getCouponUseAmount() {
        return couponUseAmount;
    }

    public void setCouponUseAmount(String couponUseAmount) {
        this.couponUseAmount = couponUseAmount;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }
}
