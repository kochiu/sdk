package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 17:50
 */
public class ICBCProductDetailQueryRequest extends ICBCRequest{
    private List<String> productIdList ;

    public List<String> getProductIdList() {
        return productIdList;
    }

    public void setProductIdList(List<String> productIdList) {
        this.productIdList = productIdList;
    }
}
