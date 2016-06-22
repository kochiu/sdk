package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 17:10
 */
public class ICBCOrderDetailQueryRequest extends ICBCRequest {

    private List<String> orderIdList ;

    public List<String> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<String> orderIdList) {
        this.orderIdList = orderIdList;
    }
}
