package com.sztx.mall.adapter.icbc.model.constansModel;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 16:21
 */
public class ICBCOrderStatus {
    public static final String NOPAY = "01" ;   //未付款
    public static final String SHIPPED = "02" ; //待发货
    public static final String RECEIPT = "03" ; //待确认收货
    public static final String FINISH = "04" ; //交易完成
    public static final String CANCEL = "05" ; //交易取消（未付款状态下，用户/商户可以取消）该状态下用户可以删除交易，删除的交易无法用接口获取到
    public static final String CLOSE = "06" ; //交易关闭（未付款超过24小时，交易自动关闭）该状态下用户可以删除交易，删除的交易无法用接口获取到
}
