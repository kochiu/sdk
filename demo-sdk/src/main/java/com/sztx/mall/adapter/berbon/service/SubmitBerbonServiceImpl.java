package com.sztx.mall.adapter.berbon.service;

import com.alibaba.fastjson.JSON;
import com.sztx.mall.adapter.berbon.config.BerbonConfigInfo;
import com.sztx.mall.adapter.berbon.model.httpModel.BerbonOrderCreateRequest;
import com.sztx.mall.adapter.berbon.model.httpModel.BerbonOrderCreateResponse;
import com.sztx.mall.adapter.berbon.util.Converter;
import com.sztx.mall.adapter.berbon.util.SignUtil;
import com.sztx.se.common.util.http.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * User : LiuKe
 * Date : 2016/5/17
 * Time : 17:02
 */
public class SubmitBerbonServiceImpl implements SubmitBerbonService{

    private static Logger logger = LoggerFactory.getLogger(SubmitBerbonService.class);
    @Override
    public BerbonOrderCreateResponse berbonOrderCreate(BerbonOrderCreateRequest request) throws Exception {
        Map<String, String> requestMap = Converter.convert(request);
        SignUtil.sign(requestMap);
        logger.info("berbonOrderCreate request : "+ JSON.toJSONString(requestMap));
        String url = BerbonConfigInfo.GATEWAY_ICBCB2C+BerbonConfigInfo.METHOD_BERBON_ORDER_CREATE;
        String returnString = HttpClientUtil.post(url, requestMap, BerbonConfigInfo.ENCODE_BERBON);
        logger.info("berbonOrderCreate returnString : "+ returnString);
        BerbonOrderCreateResponse response = Converter.convert(returnString);
        logger.info("berbonOrderCreate response : "+JSON.toJSONString(response));
        return response;
    }
}
