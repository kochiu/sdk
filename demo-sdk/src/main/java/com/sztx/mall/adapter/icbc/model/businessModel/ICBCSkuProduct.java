package com.sztx.mall.adapter.icbc.model.businessModel;

import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 17:18
 */
public class ICBCSkuProduct {
    private String productSkuId;
    private String productMerchantId;
    private String productMarketPrice;
    private String productEmallPrice;
    private String productStorage;
    private String productBarCode;
    private List<ICBCSaleProperty> salePropertiesList;

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

    public String getProductBarCode() {
        return productBarCode;
    }

    public void setProductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public List<ICBCSaleProperty> getSalePropertiesList() {
        return salePropertiesList;
    }

    public void setSalePropertiesList(List<ICBCSaleProperty> salePropertiesList) {
        this.salePropertiesList = salePropertiesList;
    }
}
