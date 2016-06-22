package com.sztx.mall.adapter.icbc.model.httpModel;

import java.util.Date;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 18:58
 */
public class ICBCRefundApplyStatusRequest extends ICBCRequest{

    private String orderId;
    private String refundId;
    private String refundAmount;
    private Date refundTime;
    private String refundStatus;
    private String refundFeedback;
    private String refundOperation;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundFeedback() {
        return refundFeedback;
    }

    public void setRefundFeedback(String refundFeedback) {
        this.refundFeedback = refundFeedback;
    }

    public String getRefundOperation() {
        return refundOperation;
    }

    public void setRefundOperation(String refundOperation) {
        this.refundOperation = refundOperation;
    }
}
