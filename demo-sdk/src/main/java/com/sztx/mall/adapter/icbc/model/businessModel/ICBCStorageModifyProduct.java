package com.sztx.mall.adapter.icbc.model.businessModel;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 19:09
 */

public class ICBCStorageModifyProduct {


    private String productId;
    private String productSkuId;
    private String productCode;
    private String logstorId;
    private String logstorMerId;
    private String storage;

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

    public String getLogstorId() {
        return logstorId;
    }

    public void setLogstorId(String logstorId) {
        this.logstorId = logstorId;
    }

    public String getLogstorMerId() {
        return logstorMerId;
    }

    public void setLogstorMerId(String logstorMerId) {
        this.logstorMerId = logstorMerId;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
