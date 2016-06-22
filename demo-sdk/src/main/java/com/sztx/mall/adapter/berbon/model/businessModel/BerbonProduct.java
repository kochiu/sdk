package com.sztx.mall.adapter.berbon.model.businessModel;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 16:01
 */
public class BerbonProduct {

    private Long productId;
    private Integer sellPrice;
    private Integer quantity;
    private String skuCode;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }
}
