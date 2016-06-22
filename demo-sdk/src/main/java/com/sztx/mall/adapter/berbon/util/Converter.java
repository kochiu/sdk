package com.sztx.mall.adapter.berbon.util;

import com.alibaba.fastjson.JSON;
import com.sztx.mall.adapter.berbon.config.BerbonConfigInfo;
import com.sztx.mall.adapter.berbon.model.businessParm.BerbonOrderCreateBusinessParm;
import com.sztx.mall.adapter.berbon.model.httpModel.BerbonOrderCreateRequest;
import com.sztx.mall.adapter.berbon.model.httpModel.BerbonOrderCreateResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 17:03
 */
public class Converter {
    public static Map<String,String> convert(BerbonOrderCreateRequest request)
    {
        Map<String,String> map = new HashMap<String,String>();
        map.put("partner_id",request.getPartnerId());
        request.setPartnerId(null);
        map.put("format", BerbonConfigInfo.FORMAT_BERBON);
        map.put("data", JSON.toJSONString(request.getData()));
        return map;
    }

    public static BerbonOrderCreateResponse convert(String responseString)
    {
        BerbonOrderCreateResponse response = JSON.parseObject(responseString,BerbonOrderCreateResponse.class);
        return response;
    }
}
