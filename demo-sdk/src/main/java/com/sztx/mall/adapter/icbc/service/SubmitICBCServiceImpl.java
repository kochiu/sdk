package com.sztx.mall.adapter.icbc.service;

import com.alibaba.fastjson.JSON;
import com.sztx.mall.adapter.common.XmlUtil;
import com.sztx.mall.adapter.icbc.config.ICBCConfigInfo;
import com.sztx.mall.adapter.icbc.model.httpModel.*;
import com.sztx.mall.adapter.icbc.util.Converter;
import com.sztx.mall.adapter.icbc.util.SignUtil;
//import com.sztx.se.common.util.http.HttpClientUtil;
import com.sztx.commons.httpclient.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:27
 */
public class SubmitICBCServiceImpl implements SubmitICBCService {

    private static Logger logger = LoggerFactory.getLogger(SubmitICBCServiceImpl.class);

    @Override
    public ICBCTimeQueryResponse ICBCTimeQuery(ICBCTimeQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCTimeQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCTimeQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCTimeQueryResponse response = XmlUtil.fromXML(returnString, ICBCTimeQueryResponse.class);
        logger.info("ICBCTimeQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCOrderListQueryResponse ICBCOrderListQuery(ICBCOrderListQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCOrderListQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCOrderListQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCOrderListQueryResponse response = XmlUtil.fromXML(returnString, ICBCOrderListQueryResponse.class);
        logger.info("ICBCOrderListQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCOrderDetailQueryResponse ICBCOrderDetailQuery(ICBCOrderDetailQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCOrderDetailQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCOrderDetailQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCOrderDetailQueryResponse response = XmlUtil.fromXML(returnString, ICBCOrderDetailQueryResponse.class);
        logger.info("ICBCOrderDetailQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCOrderSendMessResponse ICBCOrderSendMess(ICBCOrderSendMessRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCOrderSendMess request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCOrderSendMess returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCOrderSendMessResponse response = XmlUtil.fromXML(returnString, ICBCOrderSendMessResponse.class);
        logger.info("ICBCOrderSendMess response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCRefundQueryResponse ICBCRefundQuery(ICBCRefundQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCRefundQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCRefundQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCRefundQueryResponse response = XmlUtil.fromXML(returnString, ICBCRefundQueryResponse.class);
        logger.info("ICBCRefundQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCRefundApplyStatusResponse ICBCRefundApplyStatus(ICBCRefundApplyStatusRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCRefundApplyStatus request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCRefundApplyStatus returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCRefundApplyStatusResponse response = XmlUtil.fromXML(returnString, ICBCRefundApplyStatusResponse.class);
        logger.info("ICBCRefundApplyStatus response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCStorageModifyResponse ICBCStorageModify(ICBCStorageModifyRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCStorageModify request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCStorageModify returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCStorageModifyResponse response = XmlUtil.fromXML(returnString, ICBCStorageModifyResponse.class);
        logger.info("ICBCStorageModify response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductImgUploadResponse ICBCProductImgUpload(ICBCProductImgUploadRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
//        logger.info("ICBCProductImgUpload request : "+JSON.toJSONString(requestMap));
        logger.info("ICBCProductImgUpload request : ...");
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
//        logger.info("ICBCProductImgUpload returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductImgUploadResponse response = XmlUtil.fromXML(returnString, ICBCProductImgUploadResponse.class);
        logger.info("ICBCProductImgUpload response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductCreateResponse ICBCProductCreate(ICBCProductCreateRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductCreate request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductCreate returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductCreateResponse response = XmlUtil.fromXML(returnString, ICBCProductCreateResponse.class);
        logger.info("ICBCProductCreate response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductModifyResponse ICBCProductModify(ICBCProductModifyRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductModify request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductModify returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductModifyResponse response = XmlUtil.fromXML(returnString, ICBCProductModifyResponse.class);
        logger.info("ICBCProductModify response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductDeleteResponse ICBCProductDelete(ICBCProductDeleteRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductDelete request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductDelete returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductDeleteResponse response = XmlUtil.fromXML(returnString, ICBCProductDeleteResponse.class);
        logger.info("ICBCProductDelete response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductLogisticsResponse ICBCProductLogistics(ICBCProductLogisticsRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductLogistics request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductLogistics returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductLogisticsResponse response = XmlUtil.fromXML(returnString, ICBCProductLogisticsResponse.class);
        logger.info("ICBCProductLogistics response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductBrandQueryResponse ICBCProductBrandQuery(ICBCProductBrandQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductBrandQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductBrandQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductBrandQueryResponse response = XmlUtil.fromXML(returnString, ICBCProductBrandQueryResponse.class);
        logger.info("ICBCProductBrandQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCCategoryAttrQueryResponse ICBCCategoryAttrQuery(ICBCCategoryAttrQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCCategoryAttrQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCCategoryAttrQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCCategoryAttrQueryResponse response = XmlUtil.fromXML(returnString, ICBCCategoryAttrQueryResponse.class);
        logger.info("ICBCCategoryAttrQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductListQueryResponse ICBCProductListQuery(ICBCProductListQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductListQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductListQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductListQueryResponse response = XmlUtil.fromXML(returnString, ICBCProductListQueryResponse.class);
        logger.info("ICBCProductListQuery response : "+JSON.toJSONString(response));
        return response;
    }

    @Override
    public ICBCProductDetailQueryResponse ICBCProductDetailQuery(ICBCProductDetailQueryRequest request) throws Exception {
        Map<String, String> publicMap = Converter.convertPublic(request);
        Map<String, String> privateMap = Converter.convertPrivate(request);
        Map<String, String> requestMap = SignUtil.sign(publicMap,privateMap,request);
        logger.info("ICBCProductDetailQuery request : "+JSON.toJSONString(requestMap));
        String returnString = HttpClientUtil.post(ICBCConfigInfo.GATEWAY_ICBCB2C, requestMap, ICBCConfigInfo.ENCODE_ICBCB2C);
        logger.info("ICBCProductDetailQuery returnString : "+returnString);
        SignUtil.verify(returnString,request.getAppSecret());
        ICBCProductDetailQueryResponse response = XmlUtil.fromXML(returnString, ICBCProductDetailQueryResponse.class);
        logger.info("ICBCProductDetailQuery response : "+JSON.toJSONString(response));
        return response;
    }
}
