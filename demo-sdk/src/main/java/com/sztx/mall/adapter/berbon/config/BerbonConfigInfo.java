package com.sztx.mall.adapter.berbon.config;

import com.sztx.mall.adapter.common.Configuration;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 17:00
 */
public class BerbonConfigInfo {
    public static final String GATEWAY_ICBCB2C = Configuration.getInstance().getValue("gateway_berbon");
    public static final String BERBON_PARTNER_ID = Configuration.getInstance().getValue("berbon_partner_id");
    public static final String BERBON_PARTNER_KEY = Configuration.getInstance().getValue("berbon_partner_key");
    public static final String METHOD_BERBON_ORDER_CREATE = Configuration.getInstance().getValue("method_berbon_order_create");
    public static final String ENCODE_BERBON = Configuration.getInstance().getValue("encode_berbon");
    public static final String FORMAT_BERBON = Configuration.getInstance().getValue("format_berbon");
}
