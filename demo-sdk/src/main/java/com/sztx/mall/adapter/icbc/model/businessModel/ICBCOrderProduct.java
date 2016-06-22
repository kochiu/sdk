package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 10:11
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCOrderProduct {

    @XmlElement(name = "product_id")
    private String productId;
    @XmlElement(name = "product_sku_id")
    private String productSkuId;
    @XmlElement(name = "product_code")
    private String productCode;
    @XmlElement(name = "product_name")
    private String productName;
    @XmlElement(name = "product_number")
    private String productNumber;
    @XmlElement(name = "product_price")
    private String productPrice;
    @XmlElement(name = "product_discount")
    private String productDiscount;
    @XmlElement(name = "refund_process")
    private String refundProcess;
    @XmlElement(name = "refund_num")
    private String refundNum;
    @XmlElementWrapper(name="activities")
    @XmlElement(name = "activity")
    private List<ICBCActivity> activityList;
    @XmlElementWrapper(name="tringproducts")
    @XmlElement(name = "tringproduct")
    private List<ICBCTringProduct> tringProductList;
    @XmlElementWrapper(name="giftproducts")
    @XmlElement(name = "giftproduct")
    private List<ICBCGiftProduct> giftProductList;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(String productDiscount) {
        this.productDiscount = productDiscount;
    }

    public String getRefundProcess() {
        return refundProcess;
    }

    public void setRefundProcess(String refundProcess) {
        this.refundProcess = refundProcess;
    }

    public String getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(String refundNum) {
        this.refundNum = refundNum;
    }

    public List<ICBCActivity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<ICBCActivity> activityList) {
        this.activityList = activityList;
    }

    public List<ICBCTringProduct> getTringProductList() {
        return tringProductList;
    }

    public void setTringProductList(List<ICBCTringProduct> tringProductList) {
        this.tringProductList = tringProductList;
    }

    public List<ICBCGiftProduct> getGiftProductList() {
        return giftProductList;
    }

    public void setGiftProductList(List<ICBCGiftProduct> giftProductList) {
        this.giftProductList = giftProductList;
    }
}
