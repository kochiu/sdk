package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCStorageModifyProduct;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 19:08
 */
public class ICBCStorageModifyRequest extends ICBCRequest{

    private List<ICBCStorageModifyProduct> storageModifyProducts ;

    public List<ICBCStorageModifyProduct> getStorageModifyProducts() {
        return storageModifyProducts;
    }

    public void setStorageModifyProducts(List<ICBCStorageModifyProduct> storageModifyProducts) {
        this.storageModifyProducts = storageModifyProducts;
    }
}
