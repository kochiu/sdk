package com.sztx.mall.adapter.ccb.model.xmlModel;

import com.sztx.mall.adapter.ccb.model.businessModel.CCBServerOrderInfo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/16
 * Time : 11:20
 */
@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerOrderSyncRequestBody {

    //订单编号	char / 20	非空
    @XmlElementWrapper(name="order_items")
    @XmlElement(name = "order_info")
    private List<CCBServerOrderInfo> orderInfoList;

    public List<CCBServerOrderInfo> getOrderInfoList() {
        return orderInfoList;
    }

    public void setOrderInfoList(List<CCBServerOrderInfo> orderInfoList) {
        this.orderInfoList = orderInfoList;
    }
}
