package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 8:47
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCGiftProduct {
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
}
