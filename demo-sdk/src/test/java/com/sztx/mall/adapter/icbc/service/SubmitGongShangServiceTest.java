package com.sztx.mall.adapter.icbc.service;

import com.sztx.mall.adapter.common.XmlUtil;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCProductBasicProperty;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCProductDetailInfo;
import com.sztx.mall.adapter.icbc.model.constansModel.*;
import com.sztx.mall.adapter.icbc.model.httpModel.*;
import com.sztx.mall.adapter.icbc.util.Util;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SubmitGongShangServiceTest {

    public void testGetOrderList() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCOrderListQueryRequest request = new ICBCOrderListQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160504000001");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,   -1);
        request.setCreateStartTime(calendar.getTime());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.MONTH,   1);
        request.setCreateEndTime(calendar2.getTime());
        service.ICBCOrderListQuery(request);
    }
    @Test
    public void testICBCProductListQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductListQueryRequest request = new ICBCProductListQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160429000001");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,   -1);
        request.setCreateStartTime(calendar.getTime());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.MONTH, 1);
        request.setCreateEndTime(calendar2.getTime());
        service.ICBCProductListQuery(request);
    }
    public void testICBCTimeQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCTimeQueryRequest request = new ICBCTimeQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160428000002");
        service.ICBCTimeQuery(request);
    }

    public void testICBCProductLogistics() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCProductLogisticsRequest request = new ICBCProductLogisticsRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160504000002");
        service.ICBCProductLogistics(request);
    }

    public void testICBCProductBrandQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCProductBrandQueryRequest request = new ICBCProductBrandQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160504000003");
        service.ICBCProductBrandQuery(request);
    }

    public void testICBCCategoryAttrQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCCategoryAttrQueryRequest request = new ICBCCategoryAttrQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160504000003");
        service.ICBCCategoryAttrQuery(request);
    }

    public void testICBCOrderDetailQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCOrderDetailQueryRequest request = new ICBCOrderDetailQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160429000001");
        List<String> idList = new ArrayList<>();
        idList.add("020160602IM8617642");
        request.setOrderIdList(idList);
        service.ICBCOrderDetailQuery(request);
    }




    public void testICBCRefundQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCRefundQueryRequest request = new ICBCRefundQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160429000002");

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,   -10);
        request.setCreateStartTime(calendar.getTime());
        calendar.add(Calendar.DATE,   10);
        request.setCreateEndTime(calendar.getTime());
        service.ICBCRefundQuery(request);
    }

    public void testICBCProductImgUpload() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductImgUploadRequest request = new ICBCProductImgUploadRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);

        String imgString  = Util.img2String(new File("d:/orange.jpg"));
        request.setImgCategoryId(ICBCImgCategory.IMAGE_A);
        request.setImgFile(imgString);
        request.setReqSid("20160505000003");

        service.ICBCProductImgUpload(request);
    }

    public void testICBCProductCreate() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductCreateRequest request = new ICBCProductCreateRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160503000001");

        request.setProductName("特大橙子");
        request.setPriceMode("001");
        request.setProductMarketPrice("5000");
        request.setProductEmallPrice("4000");
        request.setStorageLimitNum("10");
        request.setDeductMode(ICBCDeductMode.ORDER_DEDUCT);
        request.setProductUnit("斤");
        request.setImgId1("000007658617");
        request.setIsDelivery(ICBCDelivery.DELIVERY_NO);
        request.setBuyChannel(ICBCBuyChannel.BUY_CHANNEL_PC);
        request.setPutOnType(ICBCPutOnType.PUT_ON_RIGHT_NOW);
        request.setWillToAuth("1");
        request.setSevRefundSupported("1");
        request.setProductStorage("80");
        request.setModifyRemark("测试一个橙子");
        request.setIsGroupBuy("0");
        request.setSkuOpenFlag("0");
        request.setProdCatId("47010001");//三级分类编号
        request.setProdBrandId("00017106");//品牌编号，天天鲜果
        List<ICBCProductDetailInfo>  productDetailInfoList = new ArrayList<>();
        ICBCProductDetailInfo info = new ICBCProductDetailInfo();
        info.setDetailInfoString("仅仅是个测试啊");
        productDetailInfoList.add(info);
        List<ICBCProductBasicProperty> basicPropertiesList = new ArrayList<>();
        ICBCProductBasicProperty basicProperty = new ICBCProductBasicProperty();
        basicProperty.setBasicPropId("0000100762");
        basicProperty.setBasicPropName("进口商品");
        basicProperty.setBasicPropValue("否");
        basicProperty.setIsCustom("0");
        ICBCProductBasicProperty basicProperty2 = new ICBCProductBasicProperty();
        basicProperty2.setBasicPropId("0000100058");
        basicProperty2.setBasicPropName("水果品种");
        basicProperty2.setBasicPropValue("橙子");
        basicProperty2.setIsCustom("0");
        basicPropertiesList.add(basicProperty);
        basicPropertiesList.add(basicProperty2);
        request.setProductBasicPropertiesList(basicPropertiesList);
        service.ICBCProductCreate(request);
    }
    public void testICBCProductModify() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductModifyRequest request = new ICBCProductModifyRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160503000001");
        request.setProductId("0000515931");
        request.setProductName("测试橙子哈哈");
        request.setPriceMode("001");
        request.setProductMarketPrice("100");
        request.setProductEmallPrice("30");
        request.setStorageLimitNum("10");
        request.setDeductMode(ICBCDeductMode.ORDER_DEDUCT);
        request.setProductUnit("斤");
        request.setImgId1("000007658617");
        request.setIsDelivery(ICBCDelivery.DELIVERY_NO);
        request.setBuyChannel(ICBCBuyChannel.BUY_CHANNEL_PC);
        request.setPutOnType(ICBCPutOnType.PUT_ON_RIGHT_NOW);
        request.setWillToAuth("1");
        request.setSevRefundSupported("1");
        request.setProductStorage("60");
        request.setModifyRemark("测试60斤橙子");
        request.setIsGroupBuy("0");
        request.setSkuOpenFlag("0");
        request.setProdCatId("47010001");//三级分类编号
        request.setProdBrandId("00017106");//品牌编号，天天鲜果
        List<ICBCProductDetailInfo>  productDetailInfoList = new ArrayList<>();
        ICBCProductDetailInfo info = new ICBCProductDetailInfo();
        info.setDetailInfoString("仅仅是个测试啊");
        productDetailInfoList.add(info);
        List<ICBCProductBasicProperty> basicPropertiesList = new ArrayList<>();
        ICBCProductBasicProperty basicProperty = new ICBCProductBasicProperty();
        basicProperty.setBasicPropId("0000100762");
        basicProperty.setBasicPropName("进口商品");
        basicProperty.setBasicPropValue("否");
        basicProperty.setIsCustom("0");
        ICBCProductBasicProperty basicProperty2 = new ICBCProductBasicProperty();
        basicProperty2.setBasicPropId("0000100058");
        basicProperty2.setBasicPropName("水果品种");
        basicProperty2.setBasicPropValue("橙子");
        basicProperty2.setIsCustom("0");
        basicPropertiesList.add(basicProperty);
        basicPropertiesList.add(basicProperty2);
        request.setProductBasicPropertiesList(basicPropertiesList);
        service.ICBCProductModify(request);
    }
    public void testICBCProductDelete() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductDeleteRequest request = new ICBCProductDeleteRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160503000001");
        request.setProductId("0000515926");
        service.ICBCProductDelete(request);
    }

    public void test() throws Exception {
        String s = "<?xml version='1.0' encoding='UTF-8'?><response><head><method>icbc.tools.time</method><req_sid>20160428000002</req_sid><version>1.0</version><timestamp>2016-04-28 14:22:48.00421</timestamp><app_key>0vnX50Qz</app_key><auth_code>uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4</auth_code><ret_code>0</ret_code><ret_msg>OK</ret_msg><sign>N7NaD8yZjsLQ3SQuz2ZamB6C1NuPHVDJgF1Os0E3J2U=</sign></head><body><order_list><order><order_id>1</order_id></order><order><order_id>2</order_id></order></order_list></body></response>";
        ICBCOrderListQueryResponse response = XmlUtil.fromXML(s, ICBCOrderListQueryResponse.class);
        int bodyStart = s.indexOf("<body>");
        int bodyEnd = s.indexOf("</body>")+7;
        String body = s.substring(bodyStart,bodyEnd);
        System.out.println(response);
    }
}