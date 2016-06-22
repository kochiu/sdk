package com.sztx.mall.adapter.icbc.util;

import com.sztx.mall.adapter.icbc.model.constansModel.ICBCOrderStatus;
import com.sztx.mall.adapter.icbc.model.httpModel.ICBCOrderListQueryResponse;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/28
 * Time : 16:46
 */
public class Mock {
    public static void mockICBCOrderListResponse(ICBCOrderListQueryResponse response)
    {
        ICBCOrder order = new ICBCOrder();
        order.setOrderCreateTime(new Date());
        order.setOrderId("00000001");
        order.setOrderModifyTime(new Date());
        order.setOrderStatus(ICBCOrderStatus.FINISH);
        List<ICBCOrder> orderList = new ArrayList<>();
        orderList.add(order);
        response.getBody().setOrderList(orderList);
    }

}
