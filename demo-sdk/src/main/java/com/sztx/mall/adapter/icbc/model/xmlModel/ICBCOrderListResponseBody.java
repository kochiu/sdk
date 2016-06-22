package com.sztx.mall.adapter.icbc.model.xmlModel;


import com.sztx.mall.adapter.icbc.model.businessModel.ICBCOrder;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 16:13
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCOrderListResponseBody {

    @XmlElementWrapper(name="order_list")
    @XmlElement(name = "order")
    private List<ICBCOrder> orderList;

    public List<ICBCOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ICBCOrder> orderList) {
        this.orderList = orderList;
    }
}

