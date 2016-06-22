package com.sztx.mall.adapter.icbc.config;

import com.sztx.mall.adapter.common.Configuration;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 16:47
 */
public class ICBCConfigInfo {
    public static final String GATEWAY_ICBCB2C = Configuration.getInstance().getValue("gateway.icbcb2c");
    public static final String VERSION_ICBCB2C = Configuration.getInstance().getValue("version.icbcb2c");
    public static final String FORMAT_ICBCB2C = Configuration.getInstance().getValue("format.icbcb2c");
    public static final String ENCODE_ICBCB2C = Configuration.getInstance().getValue("encode.icbcb2c");
    public static final String METHOD_ICBC_TOOLS_TIME = Configuration.getInstance().getValue("method.icbc.tools.time");
    public static final String METHOD_ICBCB2C_ORDER_LIST = Configuration.getInstance().getValue("method.icbcb2c.order.list");
    public static final String METHOD_ICBCB2C_ORDER_DETAIL = Configuration.getInstance().getValue("method.icbcb2c.order.detail");
    public static final String METHOD_ICBCB2C_ORDER_SENDMESS = Configuration.getInstance().getValue("method.icbcb2c.order.sendmess");
    public static final String METHOD_ICBCB2C_REFUND_QUERY = Configuration.getInstance().getValue("method.icbcb2c.refund.query");
    public static final String METHOD_ICBCB2C_REFUND_APPLY_STATUS = Configuration.getInstance().getValue("method.icbcb2c.refund.apply.status");
    public static final String METHOD_ICBCB2C_STORAGE_MODIFY = Configuration.getInstance().getValue("method.icbcb2c.storage.modify");
    public static final String METHOD_ICBCB2C_PRODUCT_IMGUPLOAD = Configuration.getInstance().getValue("method.icbcb2c.product.imgupload");
    public static final String METHOD_ICBCB2C_PRODUCT_CMD = Configuration.getInstance().getValue("method.icbcb2c.product.cmd");
    public static final String METHOD_ICBCB2C_PRODUCT_LOGISTICS = Configuration.getInstance().getValue("method.icbcb2c.product.logistics");
    public static final String METHOD_ICBCB2C_PRODUCT_BRAND = Configuration.getInstance().getValue("method.icbcb2c.product.brand");
    public static final String METHOD_ICBCB2C_CAT_QRYATTR = Configuration.getInstance().getValue("method.icbcb2c.cat.qryattr");
    public static final String METHOD_ICBCB2C_PRODUCT_LIST = Configuration.getInstance().getValue("method.icbcb2c.product.list");
    public static final String METHOD_ICBCB2C_PRODUCT_DETAIL = Configuration.getInstance().getValue("method.icbcb2c.product.detail");
}
