package com.sztx.mall.adapter.icbc.model.constansModel;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 18:26
 */
public class ICBCRefundStatus {


    public static final String WAIT_BUYER_AGREE = "1" ;   //待卖家同意退款
    public static final String WAIT_SALLER_AGREE = "2" ;   //待卖家退款
    public static final String WAIT_BUYER_BACK_PRODUCT = "3" ;   //待买家退还商品
    public static final String WAIT_BUYER_CONFIRM_RECEIPT = "4" ;   //待卖家确认收货
    public static final String WAIT_BUYER_MODYFY_REFUND_INFO = "6" ;   //待买家修改退款信息
    public static final String WAIT_BUYER_CONFIRM_REFUND = "7" ;   //待买家确认退款
    public static final String DONE = "8" ;   //退款完成
    public static final String REFUSE = "9" ;   //拒绝退款
    public static final String CLOSED = "10" ;   //退款关闭
    public static final String WAIT_OPERATION_DISPUTE = "11" ;   //待运营处理争议（仅担保支付时有意义）
    public static final String WAIT_BUYER_ADD = "12" ;   //待买家补充材料（仅担保支付时有意义）
    public static final String WAIT_SELLER_ADD = "13" ;   //待卖家补充材料（仅担保支付时有意义）
    public static final String REFUSE_DISPUTE = "14" ;   //争议驳回（仅担保支付时有意义：等同于退款拒绝，但不允许再次发起争议处理）
    public static final String REFUNDING = "15" ;   //退款处理中(仅担保支付时有意义：中间状态，银行校验中，无需商户操作)
    public static final String WAIT_SELLER_AGREE_AGAIN = "16" ;   //待卖家再次同意退款（仅担保支付时有意义：商户同意退款后银行从中间账户退款失败，需要商户再次同意）

}
