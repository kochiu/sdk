package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

/**
 * User : LiuKe
 * Date : 2016/5/6
 * Time : 14:28
 */
public class ICBCProductDeleteRequest extends ICBCRequest{

    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
