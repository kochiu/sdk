package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:56
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetailTring {
    @XmlElement(name = "product_sku_id")
    private String productSkuId;
    @XmlElement(name = "product_name")
    private String productName;
    @XmlElement(name = "product_merchant_id")
    private String productMerchantId;
    @XmlElement(name = "product_emall_price")
    private String productEmallPrice;
    @XmlElement(name = "product_emall_discount_price")
    private String productEmallDiscountPrice;

    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMerchantId() {
        return productMerchantId;
    }

    public void setProductMerchantId(String productMerchantId) {
        this.productMerchantId = productMerchantId;
    }

    public String getProductEmallPrice() {
        return productEmallPrice;
    }

    public void setProductEmallPrice(String productEmallPrice) {
        this.productEmallPrice = productEmallPrice;
    }

    public String getProductEmallDiscountPrice() {
        return productEmallDiscountPrice;
    }

    public void setProductEmallDiscountPrice(String productEmallDiscountPrice) {
        this.productEmallDiscountPrice = productEmallDiscountPrice;
    }
}
