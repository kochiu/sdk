package com.sztx.mall.adapter.icbc.service;

import com.sztx.mall.adapter.icbc.model.httpModel.*;

/**
 * User : LiuKe
 * Date : 2016/4/18
 * Time : 16:27
 */
public interface SubmitICBCService {

    /**
     * 接口名称：工商银行服务器时间同步接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXml----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * -----------------BodyXml-----------------
     * serverTime            非空，服务器当前时间
     * ****************************************************************
     */
    public ICBCTimeQueryResponse ICBCTimeQuery(ICBCTimeQueryRequest request) throws Exception;


    /**
     * 接口名称：工商银行订单列表查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     * createStartTime       可空，下单时间的起始值，查找间隔起始时间，按下单时间计算。
     * createEndTime	     可空，下单时间的结束值，与下单起始值配对使用，两者必须成对出现。查找间隔结束时间，按下单时间计算。
     * modifyTimeFrom	     可空，订单更新时间的起始值，下单时间与最后更新时间二者必送其一。如果两者均送，订单更新时间优先。查找间隔起始时间，按订单修改时间计算。
     * modifyTimeTo	         可空，订单更新时间的结束值，与更新起始值配对使用，两者必须成对出现。查找间隔结束时间，按订单修改时间计算。
     * orderStatus	         可空，订单状态，请参见ICBCOrderStatus类提供的状态
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------BodyXml.List<ICBCOrder>------------------------
     * orderId               非空，订单ID，string/18
     * orderCreateTime	     非空，下单时间
     * orderModifyTime	     非空，最后更新时间
     * orderStatus	         非空，订单状态，参见ICBCOrderStatus
     * ****************************************************************
     */
    public ICBCOrderListQueryResponse ICBCOrderListQuery(ICBCOrderListQueryRequest request) throws Exception;

    /**
     * 接口名称：工商银行订单详情查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * orderIdList           非空，订单Id集合
     *
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     *
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     *
     * -----------------BodyXml.List<ICBCOrderDetail>订单列表----------------------
     *
     * orderId	             非空，订单ID，string/18
     * orderModifyTime       非空，订单的最后修改时间
     * orderStatus           非空，订单当前状态，参考ICBCOrderStatus
     * orderBuyerRemark      可空，买方订单备注，string/100
     * orderSellerRemark     可空，卖方订单备注，string/100
     * orderBuyerId          非空，买方ID，string/20
     * orderBuyerUsername    可空，买方登录名，string/60
     * orderBuyerName        可空，买方名称，string/60，目前传空
     * orderCreateTime       非空，下单时间
     * orderAmount           非空，订单总金额，Decimal(15,2)
     * orderCreditAmount     可空，积分抵扣金额，Decimal(15,2)
     * creditLiquidAmount    可空，积分清算金额，Decimal(15,2)，指的是银行支付给商家的金额,目前是等于积分抵扣金额
     * orderChannel          可空，下单渠道，参考ICBCOrderChannel
     * orderCouponAmount     可空，电子券抵扣金额，Decimal(15,2)，使用的电子券金额
     * orderInsNum           可空，优惠分期，string/2，返回0表示无优惠分期，否则返回对应期数；如03，表示3个月，单位（月）
     * insFeeMer             可空，优惠分期商户手续费，Decimal(15,2)，优惠分期商户承担的手续费
     * orderFlagColor        可空，订单旗标，参考ICBCOrderFlagColor
     *
     * ---------------------ICBCOrderDetail.List<ICBCDiscount>优惠信息列表-------------------------------------
     *
     * discountType          非空，优惠类型，优惠类型可能随时修改和增加，建议商户将优惠金额累加算出总优惠，不要针对某一项优惠做任何特殊处理；每一种类型的优惠只会出现一次，类型参考ICBCDiscountType
     * discountAmount        非空，优惠金额，Decimal(15,2)
     *
     * ---------------------ICBCOrderDetail.List<ICBCProduct>商品列表-------------------------------------
     *
     * productId             非空，商品ID，string/10
     * productSkuId          非空，商品SKU ID，string/20
     * productCode           可空，商品商户编码，string/50
     * productName           非空，商品名称，string/100
     * productNumber         非空，商品购买数量，Tinyint/3
     * productPrice          非空，商品价格，Decimal(15,2)
     * productDiscount       可空，商品优惠金额，Decimal(15,2)，暂时无用
     * refundProcess         非空，商品退款进度，参考ICBCRefundProcess
     * refundNum             非空，商品申请退货数量，Tinyint/3，如未申请退款并退货类型的退款单，则该字段为0；否则，展现为申请退货数量
     *
     * ----------------------------ICBCProduct.List<ICBCActivity>活动列表----------------------------------------------------------------
     *
     * activityId            非空，活动ID，string/18
     * activityType          非空，活动类型，参考ICBCActivityType
     * activityName          非空，活动名称，string/60
     *
     * ----------------------------ICBCProduct.List<ICBCTringProduct>搭售商品列表----------------------------------------------------------------
     *
     * productId             非空，商品ID，string/10
     * productSkuId          非空，商品SKU ID，string/20
     * productCode           可空，商品商户编码,string/50
     * productName           非空，商品名称，string/100
     * productNumber         非空，购买商品数量，Tinyint/3
     * productPrice          非空，商品价格，Decimal(15,2)
     * refundProcess         非空，搭售商品退款进度，string/20
     * refundNum             非空，搭售商品申请退货数量，Tinyint/3
     *
     * ----------------------------ICBCProduct.List<ICBCGiftProduct>赠品列表----------------------------------------------------------------
     * productId             非空，商品ID，string/10
     * productSkuId          非空，商品SKU ID，string/20，(暂时为空)
     * productCode           可空，商品商户编码，string/50
     * productName           非空，商品名称，string/100
     * productNumber         非空，商品数量，Tinyint/3
     *
     * ----------------------------ICBCOrderDetail.ICBCInvoice发票信息----------------------------------------------------------------
     *
     * invoiceType           非空，发票类型票，参考ICBCInvoiceType
     * invoiceTitle          非空，发票抬头，string/500
     * invoiceContent        非空，发票内容，string/500
     * registerAddress       可空，注册地址，string/100，增值税发票返回
     * registerTel           可空，注册电话，string/13，增值税发票返回
     * depositBank           可空，开户银行，string/50，增值税发票返回
     * bankAccount           可空，银行账户，string/20，增值税发票返回
     * taxpayerId            可空，纳税人识别号，string/20，增值税发票返回
     *
     * ----------------------------ICBCOrderDetail.ICBCPayment支付信息----------------------------------------------------------------
     *
     * orderPayTime          非空，支付时间，付款时间
     * orderPayAmount        非空，支付金额，Decimal(15,2)，实际支付的总金额
     * orderPaySys           非空，支付系统号，string/16，B2C支付
     * orderDiscountAmount   可空，优惠金额，Decimal(15,2)，支付优惠金额，目前没有用到
     * orderFreight          非空，运费，Decimal(15,2)
     * paySerial             非空，流水号，string/100，改为和网银流水号一致
     *
     * ----------------------------ICBCPayment.List<ICBCCoupon>电子券列表节点----------------------------------------------------------------
     *
     * couponId              电子券编号，string/30
     * couponPromoId         电子券活动编号，string/18
     * couponOrgAmount       电子券初始面额，Decimal(15,2)
     * couponUseAmount       电子券支付使用金额，Decimal(15,2)
     * couponType            电子券类型，参考ICBCCouponType
     *
     * ----------------------------ICBCOrderDetail.ICBCConsignee收货信息----------------------------------------------------------------
     *
     * consigneeName         非空，收货人姓名，string/60
     * consigneeProvince     非空，收货地址省份名，string/50，示例值：山东省
     * consigneeProvinceId   非空，收货地址省份编码，string/20，示例值：100000
     * consigneeCity         非空，收货地址城市名，string/50，示例值：青岛市
     * consigneeCityId       非空，收货地址城市编码，string/20，示例值：100100
     * consigneeDistrict     非空，收货地址区县名，string/50，示例值：崂山区
     * consigneeDistrictId   非空，收货地址区县编码，string/20，示例值：100199
     * consigneeAddress      非空，详细地址，string/100，示例值：海尔路19号北村小区32号网点中国邮政速递物流有限公司
     * consigneeZipCode      非空，收货地址邮编，string/6，200324
     * consigneeTotalAddress 非空，收货完整地址，String/200，示例值：山东省青岛市崂山区海尔路19号北村小区32号网点中国邮政速递物流有限公司(200324)，说明：括号内为邮政编码，括号为半角
     * consigneeMobile       收货人手机，string/11
     * consigneePhone        收货人固定电话，string/20
     * consigneeTime         配送时间要求，string/1，参考ICBCConsigneeTime
     * consigneeIdcardNum    收货人身份证号，string/30
     * consigneeEmail        收货人邮箱，string/60
     * merDefined1           商户自定义1，string/100，如 商户定义为 游戏账号则保存为QQ号:XXXXXXX
     * merDefined2           商户自定义2，string/100
     * merDefined3           商户自定义3，string/100
     *
     * ****************************************************************
     */
    public ICBCOrderDetailQueryResponse ICBCOrderDetailQuery(ICBCOrderDetailQueryRequest request) throws Exception;



    /**
     * 接口名称：工商银行订单发货通知接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * orderId               非空，订单ID，string/18
     * shippingTime          非空，发货时间，string/19
     * logisticsCompany      可空，物流公司编码，参考附件，后续更新会及时通知，string/10
     * shippingCode          可空，运单号，string/18
     * shippingNum           可空，发货分组编号，string/20
     * notes                 可空，备注，string/200
     *
     * ------------------------productsList---------------------------
     *
     * productId             可空，商品ID，string/20，如果不指定商品，则默认该订单下所有商品均同一批次发货
     * productCode           可空，商品商户编码，string/50
     * productName           可空，商品名称，string/100
     * grossWeight           可空，发货毛重，string/10，跨境直邮订单必输，范围（0.01~999.99）

     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------------------------------
     * ****************************************************************
     */
    public ICBCOrderSendMessResponse ICBCOrderSendMess(ICBCOrderSendMessRequest request) throws Exception;

    /**
     * 接口名称：工商银行退款申请查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * createStartTime       可空，退款申请创建起始时间，查找间隔起始时间，按照退款的申请创建时间计算
     * createEndTime         可空，退款申请创建结束时间，查找间隔结束时间，按照退款的申请创建时间计算
     * refundStatus          可空，退款状态，空默认全部状态
     * orderId               可空，订单编号，string/18
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     *
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     *
     * -----------------BodyXml.List<ICBCRefund>退款订单列表----------------------
     *
     * orderId               订单ID，string/18
     * refundId              退款申请编号，string/18
     * refundTs              退款申请时间
     * refundStatus          退款单状态，参考ICBCRefundStatus
     * refundTotalAmount     非空，退款申请总金额，Decimal(15,2)
     * refundFreight         非空，退款运费金额，Decimal(15,2)
     * refundCash            退款应退现金金额，Decimal(15,2)、
     * refundScore           退款应退积分值，Tinyint/3
     * refundCoupon          退款应退电子券金额，Decimal(15,2)
     * refundConfirmTs       退款审核时间
     * refundProdFlag        是否退货标识，参考ICBCRefundProdFlag
     * reDetailAddress       可空，退货详细地址，string/100
     * reZip                 可空，string/6，退货邮编
     * rePerson              可空，string/50，退货联系人
     * reTel                 可空，string/25，退货联系电话
     *
     * -----------------ICBCRefund.List<ICBCRefundProduct>退款商品列表----------------------
     *
     * productId             非空，商品ID，string/10
     * productSkuId          非空，商品SKU ID，string/20
     * productCode           非空，商品商户编码，string/50
     * productName           非空，商品名称，string/100
     * productNumber         可空，退款商品数量，Tinyint/3
     * productRefundAmount   非空，商品退款金额，Decimal(15,2)
     * refundReason          非空，退款原因，string/100
     * refundDesc            非空，退款说明，string/256
     *
     * ****************************************************************
     */
    public ICBCRefundQueryResponse ICBCRefundQuery(ICBCRefundQueryRequest request) throws Exception;

    /**
     * 接口名称：工商银行退款申请状态通知接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * orderId               非空，订单编号，string/18
     * refundId              非空，退款单编号，string/10
     * refundAmount          非空，退款金额，Decimal(15,2)
     * refundTime            非空，退款状态变更时间
     * refundStatus          可空，退款状态，参考ICBCRefundStatus
     * refundFeedback        可空，退款反馈，string/100
     * refundOperation       可空，退款操作，参考ICBCRefundOperation
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------------------------------
     * ****************************************************************
     */
    public ICBCRefundApplyStatusResponse ICBCRefundApplyStatus(ICBCRefundApplyStatusRequest request) throws Exception;


    /**
     * 接口名称：工商银行商品库存更新接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * -----------------------List<ICBCStorageModifyProduct>---------------------------------
     *
     * productId             可空，商品ID，string/10
     * productSkuId          可空，商品SKU ID，string/20
     * productCode           可空，商户自己的产品代码，string/50
     * logstorId             可空，商品逻辑仓编号，string/20
     * logstorMerId          可空，商品在商户自己逻辑仓的编号，string/30
     * storage               可空，库存当前最新数量，int
     *
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------------------------------
     * ****************************************************************
     */
    public ICBCStorageModifyResponse ICBCStorageModify(ICBCStorageModifyRequest request) throws Exception;

    /**
     * 接口名称：工商银行图片上传接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * imgFile	             非空，上传图片内容，string/2048*1024，base64编码的字符串
     * imgCategoryId         非空，图片分类，数据字典使用ICBCImgCategory类
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------------------------------
     * ------------------BodyXML----------------------
     * imgId                 非空，图片编号，string/30
     * imgName               非空，图片名称，string/150
     * ****************************************************************
     */
    public ICBCProductImgUploadResponse ICBCProductImgUpload(ICBCProductImgUploadRequest request) throws Exception;

    /**
     * 接口名称：工商银行商品信息创建接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * productName           非空，商品名称，string/80
     * prodSubTitle          可空，商品副标题，string/80
     * prodCatId             非空，商品所属三级分类编号，string/20
     * prodBrandId           非空，商品品牌分类编号，string/8
     * priceMode             非空，定价模式，string/3，预留，本期固定上送001
     * productMarketPrice    非空，市场价格，Decimal(15,2)，市场价格必须大于商城价格
     * productEmallPrice     非空，商城价格，Decimal(15,2)，商城价格必须小于市场价格
     * netWeight             可空，商品净重，Decimal(15,2)，预留，本期送空
     * otherPrice            可空，其他费用，Decimal(15,2)，预留，本期送空
     * productStorage        可空，商品数量，int，当商品不启用SKU时此值必填
     * storageLimitNum       非空，库存预警，int
     * deductMode            非空，库存扣减方式，数据字典请使用ICBCDeductMode
     * productUnit           非空，商品计量单位，string/2
     * productBarCode        可空，商品条形码，string/20
     * productMerchantId     可空，商户商品编号，string/50，商户自身的产品代码
     * imgId1                非空，商品图片1的编号，string/30，至少要上传一张商品图片
     * imgId2                可空，商品图片2的编号，string/30
     * imgId3                可空，商品图片3的编号，string/30
     * imgId4                可空，商品图片4的编号，string/30
     * imgId5                可空，商品图片5的编号，string/30
     * isDelivery            非空，配送方式，参考ICBCDelivery
     * templateId            可空，运费模板编号，string/18，配送方式为100、010时必输
     * templateTypeId        可空，运费模板类型编号，配送方式为100时必输,参考ICBCTemplateType
     * productWeight         可空，商品毛重（包含包装），Decimal(15,2)，当运费模板是以重量计费时，此值必输
     * productBulk           可空，商品包装体积，Decimal(15,2)，当运费模板是以体积计费时，此值必输
     * buyChannel            非空，允许购买渠道，参考ICBCBuyChannel
     * putOnType             非空，上架方式，参考ICBCPutOnType
     * putOnTime             可空，当上架方式为定时上架时，此项必须上送(例如：2014040823)
     * willToAuth            非空，是否提交审核，0-否，1-是，如果选择否，则商品提交后进入草稿箱，需要商户在商户中心草稿箱自行提交审核
     * sevRefundSupported    非空，是否支持7天无理由退货，0-否，1-是，商品所属三级分类编号如果要求必须支持7天无理由退货，则只能上送1
     * mInsNum               可空，商户分期期数，参考ICBCMInsNum，前提商户已经在内管中开通了分期，且输入的期数在内管中登记过
     * taxRate               可空，行邮税率，Decimal(15,4)，开通跨境购的商户必输，单位为%，即输入5，代表5%
     * modifyRemark          非空，审核备注，string/100
     * isGroupBuy            非空，是否集团购买，0-否，1-是
     * skuOpenFlag           非空，是否启用SKU，string/1，0-不启用，系统忽略skuproducts的内容，1-启用
     *
     * -------------------ICBCRequest.List<ICBCProductBasicProperty> 可空，商品属性列表，此处循环上送非销售属性信息------------------------------
     *
     * basicPropId           可空，属性编号，string/10，自定义属性，此值不输入；非自定义属性必输
     * basicPropName         非空，属性名称，string/100
     * basicPropValue        非空，属性值名称，string/100
     * isCustom              非空，是否自定义属性，string/1，0-否，1-是
     *
     * -------------------ICBCRequest.List<ICBCSkuProduct>，SKU商品列表，当不启用SKU时以下循环内部节点均无效------------------------------
     *
     * productMerchantId     可空，商户商品编码，string/50
     * productMarketPrice    非空，SKU市场价格，Decimal(15,2)，SKU市场价格必须大于SKU商城价格
     * productEmallPrice     非空，SKU商城价格，Decimal(15,2)，SKU商城价格必须小于SKU市场价格
     * productStorage        非空，SKU商品数量，int(8)
     * productBarCode        可空，SKU商品条形码，string/20
     *
     * -------------------ICBCSkuProduct.List<ICBCSaleProperties>，SKU商品销售属性列表------------------------------
     *
     * salePropId           非空，属性编号，string/10，所有上送的SKU要含有相同的销售属性编号（每个SKU含多个销售属性时，要确保每个SKU都含有相同数量和相同内容的销售属性编号）
     * salePropValueId      非空，属性值编号/枚举值编号，string/20
     * salePropValue        非空，属性值名称，string/80
     * isColor              非空，是否颜色属性，string/1，0-否，1-是
     * colorImgId           可空，颜色属性图片编码，string/30
     *
     * ----------------------ICBCRequest.List<ICBCProductDetailInfo>商品详情必输，下列循环内值的总和不为空----------------------------------------------------------------------------------
     *
     * detailInfoString     可空，商品详情文字，string/500，单个循环内文字和图片至少必输其一
     * detailInfoImageId    可空，商品详情图片，string/30，单个循环内文字和图片至少必输其一
     *
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method               非空，接口名
     * reqSid               非空，请求流水号
     * version              非空，版本号
     * timestamp            非空，时间戳
     * appKey               非空，接入系统标识
     * authCode             非空，授权码
     * retCode              非空，返回码
     * sign                 非空，签名
     * retMsg               可空，返回消息
     * ----------------------------------------
     * ------------------BodyXML----------------------
     *
     * productId	        非空，商品编码，string/10，此项为融e购平台自动生成的商品编码；
     *
     * ****************************************************************
     */
    public ICBCProductCreateResponse ICBCProductCreate(ICBCProductCreateRequest request) throws Exception;


    /**
     * 接口名称：工商银行商品信息修改接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * productId             非空，商品编码，string/10
     * productName           非空，商品名称，string/80
     * prodSubTitle          可空，商品副标题，string/80
     * prodBrandId           非空，商品品牌分类编号，string/8
     * priceMode             非空，定价模式，string/3，预留，本期固定上送001
     * productMarketPrice    非空，市场价格，Decimal(15,2)，市场价格必须大于商城价格
     * productEmallPrice     非空，商城价格，Decimal(15,2)，商城价格必须小于市场价格
     * netWeight             可空，商品净重，Decimal(15,2)，预留，本期送空
     * otherPrice            可空，其他费用，Decimal(15,2)，预留，本期送空
     * productStorage        可空，商品数量，int，当商品不启用SKU时此值必填
     * storageLimitNum       非空，库存预警，int
     * deductMode            非空，库存扣减方式，数据字典请使用ICBCDeductMode
     * productUnit           非空，商品计量单位，string/2
     * productBarCode        可空，商品条形码，string/20
     * productMerchantId     可空，商户商品编号，string/50，商户自身的产品代码
     * imgId1                非空，商品图片1的编号，string/30，至少要上传一张商品图片
     * imgId2                可空，商品图片2的编号，string/30
     * imgId3                可空，商品图片3的编号，string/30
     * imgId4                可空，商品图片4的编号，string/30
     * imgId5                可空，商品图片5的编号，string/30
     * isDelivery            非空，配送方式，参考ICBCDelivery
     * templateId            可空，运费模板编号，string/18，配送方式为100、010时必输
     * templateTypeId        可空，运费模板类型编号，配送方式为100时必输,参考ICBCTemplateType
     * productWeight         可空，商品毛重（包含包装），Decimal(15,2)，当运费模板是以重量计费时，此值必输
     * productBulk           可空，商品包装体积，Decimal(15,2)，当运费模板是以体积计费时，此值必输
     * buyChannel            非空，允许购买渠道，参考ICBCBuyChannel
     * putOnType             非空，上架方式，参考ICBCPutOnType
     * putOnTime             可空，当上架方式为定时上架时，此项必须上送(例如：2014040823)
     * willToAuth            非空，是否提交审核，0-否，1-是，如果选择否，则商品提交后进入草稿箱，需要商户在商户中心草稿箱自行提交审核
     * sevRefundSupported    非空，是否支持7天无理由退货，0-否，1-是，商品所属三级分类编号如果要求必须支持7天无理由退货，则只能上送1
     * mInsNum               可空，商户分期期数，参考ICBCMInsNum，前提商户已经在内管中开通了分期，且输入的期数在内管中登记过
     * taxRate               可空，行邮税率，Decimal(15,4)，开通跨境购的商户必输，单位为%，即输入5，代表5%
     * modifyRemark          非空，审核备注，string/100
     * isGroupBuy            非空，是否集团购买，0-否，1-是
     * skuOpenFlag           非空，是否启用SKU，string/1，0-不启用，系统忽略skuproducts的内容，1-启用
     *
     * -------------------ICBCRequest.List<ICBCProductBasicProperties> 可空，商品属性列表，此处循环上送非销售属性信息------------------------------
     *
     * basicPropId           可空，属性编号，string/10，自定义属性，此值不输入；非自定义属性必输
     * basicPropName         非空，属性名称，string/100
     * basicPropValue        非空，属性值名称，string/100
     * isCustom              非空，是否自定义属性，string/1，0-否，1-是
     *
     * -------------------ICBCRequest.List<ICBCSkuProduct>，SKU商品列表，当不启用SKU时以下循环内部节点均无效------------------------------
     *
     * productSkuId          非空，修改现有的SKU时需要上送已有SKUID（修改的范围为以下5个字段）
     * productMerchantId     可空，商户商品编码，string/50
     * productMarketPrice    非空，SKU市场价格，Decimal(15,2)，SKU市场价格必须大于SKU商城价格
     * productEmallPrice     非空，SKU商城价格，Decimal(15,2)，SKU商城价格必须小于SKU市场价格
     * productStorage        非空，SKU商品数量，int(8)
     * productBarCode        可空，SKU商品条形码，string/20
     *
     * ----------------------ICBCRequest.List<ICBCProductDetailInfo>商品详情必输，下列循环内值的总和不为空----------------------------------------------------------------------------------
     *
     * detailInfoString     可空，商品详情文字，string/500，单个循环内文字和图片至少必输其一
     * detailInfoImageId    可空，商品详情图片，string/30，单个循环内文字和图片至少必输其一
     *
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method               非空，接口名
     * reqSid               非空，请求流水号
     * version              非空，版本号
     * timestamp            非空，时间戳
     * appKey               非空，接入系统标识
     * authCode             非空，授权码
     * retCode              非空，返回码
     * sign                 非空，签名
     * retMsg               可空，返回消息
     * ----------------------------------------
     * ------------------BodyXML----------------------
     *
     * productId	        非空，商品编码，string/10，此项为融e购平台自动生成的商品编码；
     *
     * ****************************************************************
     */
    public ICBCProductModifyResponse ICBCProductModify(ICBCProductModifyRequest request) throws Exception;

    /**
     * 接口名称：工商银行商品信息删除接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * productId             非空，商品编码，string/10
     * ****************************************************************
     *  @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method               非空，接口名
     * reqSid               非空，请求流水号
     * version              非空，版本号
     * timestamp            非空，时间戳
     * appKey               非空，接入系统标识
     * authCode             非空，授权码
     * retCode              非空，返回码
     * sign                 非空，签名
     * retMsg               可空，返回消息
     * ----------------------------------------
     * ------------------BodyXML----------------------
     *
     * productId	        非空，商品编码，string/10，此项为融e购平台自动生成的商品编码
     */
    public ICBCProductDeleteResponse ICBCProductDelete(ICBCProductDeleteRequest request) throws Exception;

    /**
     * 接口名称：工商银行运费模板查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------------------------------
     * ------------------BodyXML.List<ICBCLogsTemplate> 运费模板集合----------------------
     *
     * templateId            非空，运费模板编号，string/20
     * templateName          非空，运费模板名称，string/100
     * templateDesc          可空，运费模板说明，string/600
     * isDefault             可空，是否默认运费模板，0-否，1-是
     *
     * ------------------ICBCLogsTemplate.List<ICBCLogsRule> 运费规则集合------------------------------
     *
     * ruleMode             非空，物流方式，参考ICBCLogRuleMode
     * ruleType             非空，计费方式，参考ICBCTemplateType
     * basicUnit            非空，基础单位，Decimal(15,2)，根据计费方式决定基础单位，例如前X件、前X千克、前X立方米
     * basicFee             非空，基础单位运费，Decimal(15,2)，对应基础单位的运费
     * addUnit              非空，每增加单位，Decimal(15,2)，根据计费方式决定每增加单位，例如每增加前X件、每增加X千克、每增加X立方米
     * addFee               非空，每增加单位运费，Decimal(15,2)，对应每增加单位的运费
     * isDefault            非空，是否默认规则，0-否，1-是
     *
     * ****************************************************************
     */
    public ICBCProductLogisticsResponse ICBCProductLogistics(ICBCProductLogisticsRequest request) throws Exception;


    /**
     * 接口名称：工商银行商品品牌查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     *
     * ------------------BodyXML.List<ICBCCategory> 分类信息集合----------------------
     *
     * catId                 非空，三级分类编号，string/20
     * catName               非空，三级分类名称，string/60
     * parentCatId           非空，所属二级分类编号，string/20
     * parentCatName         非空，所属二级分类名称，string/60
     * superCatId            非空，所属一级分类编号，string/20
     * superCatName          非空，所属一级分类名称，string/60
     *
     * ------------------ICBCCategory.List<ICBCBrand> 品牌集合----------------------
     *
     * brandId               非空，品牌编号，string/8
     * brandName             非空，品牌名称，string/60
     *
     * ****************************************************************
     */
    public ICBCProductBrandQueryResponse ICBCProductBrandQuery(ICBCProductBrandQueryRequest request) throws Exception;

    /**
     * 接口名称：工商银行商品分类属性查询
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     *
     * ------------------BodyXML.List<ICBCCategory> 分类信息集合----------------------
     *
     * catId                 非空，三级分类编号，string/20
     * catName               非空，三级分类名称，string/60
     * parentCatId           非空，所属二级分类编号，string/20
     * parentCatName         非空，所属二级分类名称，string/60
     * superCatId            非空，所属一级分类编号，string/20
     * superCatName          非空，所属一级分类名称，string/60
     *
     * ------------------ICBCCategory.List<ICBCCategoryProperty> 属性信息集合----------------------
     *
     * propId                属性编号，string/10
     * propName              属性名称，string/100
     * propValueId           属性值编号，string/20
     * propValueName         属性值名称，string/100，当该属性有枚举值信息时，此项为空；以枚举值信息为准
     * isSale                是否销售属性，0-否，1-是
     * isEdit                属性值名称是否可编辑，0-否，1-是
     * isMust                属性值是否必填，0-否，1-是
     * isColor               是否颜色属性，0-否，1-是
     *
     * ------------------ICBCCategoryProperty.List<ICBCPropValueEnum> 属性值枚举值信息----------------------
     *
     * enumId                属性枚举值编号，string/10
     * enumName              属性枚举值名称，string/100
     *
     * ****************************************************************
     */
    public ICBCCategoryAttrQueryResponse ICBCCategoryAttrQuery(ICBCCategoryAttrQueryRequest request) throws Exception;

    /**
     * 接口名称：工商银行商品列表查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * createStartTime       可空，查找间隔起始时间，按商品录入时间计算。
     * createEndTime	     可空，商品录入时间的结束值，与商品录入起始值配对使用，两者必须成对出现。查找间隔结束时间，按商品录入时间计算。
     * modifyTimeFrom	     可空，商品更新时间的起始值，商品录入时间、商品更新时间与商品上架时间三者必送其一。如果三者均送，商品更新时间优先、录入时间次之、上架时间最后。查找间隔起始时间，按商品更新时间计算。
     * modifyTimeTo	         可空，商品更新时间的结束值，与商品更新起始值配对使用，两者必须成对出现。查找间隔结束时间，按商品更新时间计算。
     * putTimeFrom           可空，商品上架时间的起始值，商品录入时间、商品更新时间与商品上架时间三者必送其一。如果三者均送，商品更新时间优先、录入时间次之、上架时间最后。查找间隔起始时间，按商品上架时间计算。
     * putTimeTo             可空，商品上架时间的结束值，与上架起始值配对使用，两者必须成对出现。查找间隔结束时间，按商品上架时间计算。
     * productStatus	     可空，商品状态，请参见ICBCProductStatus类提供的状态，空默认全部状态
     *
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     * ----------------BodyXml.List<ICBCProduct>------------------------
     * productId             非空，商品编码，string/10
     * productName           商品名称，string/100
     * productStatus	     商品状态，请参见ICBCProductStatus类提供的状态
     * productMerchantId	 商户商品编码，string/50
     * ****************************************************************
     */
    public ICBCProductListQueryResponse ICBCProductListQuery(ICBCProductListQueryRequest request) throws Exception;

    /**
     * 接口名称：工商银行商品详情查询接口
     * ****************************************************************
     * @param request
     * 参数详情：
     * authCode			     非空，授权码，string/64，具有一定的失效时间（默认一年），商户超级管理员需在失效时间之前重新登录工行电商平台完成再次授权，获取更新后的auth_code 并记录。该授权过程是通过https加密传输进行申请的。
     * appKey	             非空，接入系统标识，string/8
     * appSecret	         非空，工行分配给企业对接电商平台的应用密钥
     * reqSid		         非空，请求流水号，string/18
     *
     * productIdList           非空，订单Id集合
     *
     * ****************************************************************
     * @return
     * 返回详情：
     * ------------------HeadXML----------------------
     *
     * method                非空，接口名
     * reqSid                非空，请求流水号
     * version               非空，版本号
     * timestamp             非空，时间戳
     * appKey                非空，接入系统标识
     * authCode              非空，授权码
     * retCode               非空，返回码
     * sign                  非空，签名
     * retMsg                可空，返回消息
     *
     * -----------------BodyXml.List<ICBCProductDetail>商品列表----------------------
     *
     * productId	         非空，商品编码，string/10
     * productName	         非空，商品名称，string/100
     * prodSubTitle	         商品副标题，string/100
     * productStatus	     非空，商品状态，参考ICBCProductStatus
     * productMerchantId	 商户商品编码，string/50
     * productMarketPrice	 非空，商品市场价格，Decimal(15,2)
     * productEmallPrice	 非空，商品商城价格，Decimal(15,2)，如果商品没有SKU属性，则此价格为真实的商城价格，否则需要看SKU对应的商城价格。
     * productStorage	     非空，商品库存，Tinyint/9，返回该商品所有sku的库存之和
     * deductMode	         非空，库存扣减方式，Tinyint/9
     * productBarCode	     商品条形码，string/50，如有sku，以sku为准
     * productUnit	         非空，商品单位，string/10
     * productBrand	         非空，商品品牌名称，string/50
     * productBrandId	     非空，商品品牌编号，string/50
     * buyChannel            非空，商品允许购买渠道，参考ICBCBuyChannel
     * productWeight         商品重量，Decimal(15,2)，单位：千克
     * productBulk           商品体积，Decimal(15,2)，单位：立方米
     * putOnType             上架方式，参考ICBCPutOnType
     * putOnTime             上架时间
     * isSevRefund           是否支持七天无理由退换货，0-不支持，1-支持
     *
     * -----------------ICBCProductDetail.List<ICBCProductBasicProperty>基本属性列表----------------------
     * basicPropName	     非空，基本属性名称，string/100
     * basicPropValue	     非空，基本属性值，string/100
     *
     * -----------------ICBCProductDetail.List<String>商品图片id列表----------------------
     *
     *
     * -----------------ICBCProductDetail.List<ICBCSkuProduct>商品sku编码列表----------------------
     * productSkuId	         非空，商品sku编码，string/20
     * productMerchantId	 商户商品编码，string/50
     * productMarketPrice	 非空，商品SKU市场价格，Decimal(15,2)
     * productEmallPrice	 非空，商品SKU商城价格，Decimal(15,2)
     * productStorage	     非空，商品库存，Tinyint/9，返回该商品该sku在“融e购”所有逻辑仓的库存之和
     * productBarCode	     商品条形码，string/50
     *
     * -----------------ICBCSkuProduct.List<ICBCProductDetailSaleProperty>销售属性列表----------------------
     *
     * salePropNameId	     销售属性编码，string/20
     * salePropName	         非空，销售属性名称，string/100
     * salePropValueId	     销售属性值编码，string/20
     * salePropValue	     非空，销售属性值，string/100
     *
     * -----------------ICBCProductDetail.List<ICBCProductDetailTring>搭售商品列表----------------------
     *
     * productSkuId	         非空，搭售商品sku编码，string/20
     * productName	         非空，搭售商品名称，string/100
     * productMerchantId	 商户商品编码，string/50
     * productEmallPrice	 非空，搭售商品SKU商城价格，Decimal(15,2)
     * productEmallDiscountPrice	非空，搭售商品SKU商城优惠价格，Decimal(15,2)
     *
     * -----------------ICBCProductDetail.List<ICBCProductDetailLogstor>逻辑仓列表----------------------
     *
     * logstorId	         非空，商品逻辑仓编号，string/20
     * logstorMerId	         可空，商品商户逻辑仓编号，string/30
     *
     * -----------------ICBCProductDetail.List<ICBCProductDetailStorage>库存列表----------------------
     *
     * logstorId	         非空，商品逻辑仓编号，string/20
     * productSkuId	         非空，商品sku编码，string/20
     * prodSkuLogSto	     非空，库存，Tinyint/9，返回该商品该sku、该逻辑仓的库存
     *
     * ****************************************************************
     */
    public ICBCProductDetailQueryResponse ICBCProductDetailQuery(ICBCProductDetailQueryRequest request) throws Exception;

}
