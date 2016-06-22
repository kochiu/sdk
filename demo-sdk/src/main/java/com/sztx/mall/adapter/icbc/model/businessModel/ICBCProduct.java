package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:33
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProduct {

    @XmlElement(name="product_id")
    private String productId;
    @XmlElement(name="product_name")
    private String productName;
    @XmlElement(name="product_status")
    private String productStatus;
    @XmlElement(name="product_merchant_id")
    private String productMerchantId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductMerchantId() {
        return productMerchantId;
    }

    public void setProductMerchantId(String productMerchantId) {
        this.productMerchantId = productMerchantId;
    }
}
