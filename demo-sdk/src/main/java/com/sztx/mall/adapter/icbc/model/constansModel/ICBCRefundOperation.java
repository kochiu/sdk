package com.sztx.mall.adapter.icbc.model.constansModel;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 18:51
 */
public class ICBCRefundOperation {

    public static final String AGREE = "01" ;   //同意退款（所有类型的退款单，首次审核退款单时，同意退款操作）
    public static final String AGREE_AGAIN = "02" ;   //卖家再次同意退款（只针对担保期内，退款失败的退款单）
    public static final String REFUSE = "03" ;   //拒绝退款
    public static final String CONFIRM_RECEIPT = "04" ;   //确认收货
    public static final String NO_GET_PRODUCT = "05" ;   //未收到货
    public static final String PRODUCT_BROKEN = "06" ;   //商品有损
    public static final String NO_EMS_REFUND_ = "07" ;   //无物流退货
}
