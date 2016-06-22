package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 15:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCRefundProduct {
    @XmlElement(name="product_id")
    private String productId;
    @XmlElement(name="product_sku_id")
    private String productSkuId;
    @XmlElement(name="product_code")
    private String productCode;
    @XmlElement(name="product_name")
    private String productName;
    @XmlElement(name="product_number")
    private String productNumber;
    @XmlElement(name="product_refund_amount")
    private String productRefundAmount;
    @XmlElement(name="refund_reason")
    private String refundReason;
    @XmlElement(name="refund_desc")
    private String refundDesc;

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

    public String getProductRefundAmount() {
        return productRefundAmount;
    }

    public void setProductRefundAmount(String productRefundAmount) {
        this.productRefundAmount = productRefundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }
}
