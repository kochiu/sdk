package com.sztx.mall.adapter.berbon.model.httpModel;

import com.sztx.mall.adapter.berbon.model.businessParm.BerbonOrderCreateBusinessParm;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 15:53
 */
public class BerbonOrderCreateRequest {

    private String partnerId;
    private BerbonOrderCreateBusinessParm data;

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public BerbonOrderCreateBusinessParm getData() {
        return data;
    }

    public void setData(BerbonOrderCreateBusinessParm data) {
        this.data = data;
    }

}
