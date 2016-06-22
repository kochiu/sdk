package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCOrderDetail;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 17:17
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)

public class ICBCOrderDetailQueryResponseBody {
    @XmlElementWrapper(name="order_list")
    @XmlElement(name = "order")
    private List<ICBCOrderDetail> orderList;

    public List<ICBCOrderDetail> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ICBCOrderDetail> orderList) {
        this.orderList = orderList;
    }
}

