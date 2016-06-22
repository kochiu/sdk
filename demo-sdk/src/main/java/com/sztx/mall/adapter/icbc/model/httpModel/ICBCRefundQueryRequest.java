package com.sztx.mall.adapter.icbc.model.httpModel;

import java.util.Date;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 18:23
 */
public class ICBCRefundQueryRequest extends ICBCRequest{

    private Date createStartTime;
    private Date createEndTime;
    private String refundStatus;
    private String orderId;

    public Date getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
