package com.sztx.mall.adapter.berbon.service;

import com.sztx.mall.adapter.berbon.model.httpModel.BerbonOrderCreateRequest;
import com.sztx.mall.adapter.berbon.model.httpModel.BerbonOrderCreateResponse;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 16:05
 */
public interface SubmitBerbonService {
    /**
     * 接口名称：倍棒订单创建接口
     * ****************************************************************
     * @param request
     * 参数详情：
     *
     * --------------------BerbonOrderCreateRequest-------------------------------------------
     *
     * partnerId	        必填，商户编号
     *
     * ---------------BerbonOrderCreateRequest.BerbonOrderCreateBusinessParm-------------------------
     *
     * channelId            必填，平台id
     * relateOrderId        必填，第三方订单号
     * orderState           必填，订单状态，0-未支付，1-已支付，2-已发货，3-交易关闭，4-交易完成，5-待退款，6-待退货，7,-退货中，10-退款完成
     * callBackUrl	        必填，回调地址
     * srcIp                必填，来源ip
     * srcChannel           必填，来源渠道 1网站，2手机，3微信,4内部
     * goodsName            必填，订单简称
     * goodsDetail          必填，订单描述
     * amount	            必填，订单金额(不包含运费)，单位：分
     * carriage	            必填，运费，单位：分
     * payAmount            必填，应付金额，单位：分
     * discount	            必填，优惠金额，单位：分
     * customer	            必填，客户第三方账号
     * customerRealName	    必填，客户真实姓名
     * customerNickName     必填，客户昵称
     * deliveryType         可空，配送类型，默认1【1快递，2自提】
     * leaveMsg	            可空，客户留言
     * --------------BerbonOrderCreateRequest.BerbonOrderCreateBusinessParm.BerbonAddrInfo收货信息--------
     *
     * id                   可空，地址id，手动输入的地址则id为0
     * consignee            必填，收货人姓名
     * mob                  必填，收货人电话
     * province 	        必填，省
     * city 	            必填，市
     * area                 必填，区县
     * addr	                必填，详细地址
     *
     * --------------BerbonOrderCreateRequest.BerbonOrderCreateBusinessParm.List<BerbonProduct>必填，商品信息列表--------
     *
     * productId	        必填，商品id
     * sellPrice	        必填，商品价格，单位：分
     * quantity	            必填，数量
     * skuCode	            必填，商品编码
     *
     * ****************************************************************
     * @return
     * 返回详情：
     *
     * ---------------------BerbonOrderCreateResponse-----------------
     *
     * code	                必填，结果码
     * description	        必填，响应描述
     * success	            必填，成功标志	true、false
     * iTotalDisplayRecords 可空，总页数，分页查询返回总记录数的描述
     *
     * --------BerbonOrderCreateResponse.BerbonOrderCreateResult 结果集--------
     *
     * orderId	            必填，订单号
     *
     * ****************************************************************
     */
    public BerbonOrderCreateResponse berbonOrderCreate(BerbonOrderCreateRequest request) throws Exception;
}
