package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/11
 * Time : 9:07
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetailSkuProduct {
    @XmlElement(name="product_sku_id")
    private String productSkuId;
    @XmlElement(name="product_merchant_id")
    private String productMerchantId;
    @XmlElement(name="product_market_price")
    private String productMarketPrice;
    @XmlElement(name="product_emall_price")
    private String productEmallPrice;
    @XmlElement(name="product_storage")
    private String productStorage;
    @XmlElementWrapper(name="saleproperties")
    @XmlElement(name="saleproperty")
    private List<ICBCProductDetailSaleProperty> salePropertyList;

    public String getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(String productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductMerchantId() {
        return productMerchantId;
    }

    public void setProductMerchantId(String productMerchantId) {
        this.productMerchantId = productMerchantId;
    }

    public String getProductMarketPrice() {
        return productMarketPrice;
    }

    public void setProductMarketPrice(String productMarketPrice) {
        this.productMarketPrice = productMarketPrice;
    }

    public String getProductEmallPrice() {
        return productEmallPrice;
    }

    public void setProductEmallPrice(String productEmallPrice) {
        this.productEmallPrice = productEmallPrice;
    }

    public String getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(String productStorage) {
        this.productStorage = productStorage;
    }

    public List<ICBCProductDetailSaleProperty> getSalePropertyList() {
        return salePropertyList;
    }

    public void setSalePropertyList(List<ICBCProductDetailSaleProperty> salePropertyList) {
        this.salePropertyList = salePropertyList;
    }
}
