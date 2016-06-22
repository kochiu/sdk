package com.sztx.mall.adapter.icbc.service;

import com.sztx.mall.adapter.common.SignUtil;
import com.sztx.mall.adapter.common.XmlUtil;
import com.sztx.mall.adapter.icbc.model.businessModel.*;
import com.sztx.mall.adapter.icbc.model.constansModel.*;
import com.sztx.mall.adapter.icbc.model.httpModel.*;
import com.sztx.mall.adapter.icbc.util.Util;
import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class ICBCSubmitServiceTest {

    public void testGetOrderList() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
//        测试环境
//        String app_key ="0vnX50Qz";
//        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
//        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";
//        正式环境 商户ID 10016788
        String app_key ="NXZnaaVH";
        String app_secret = "APPz5V5SiUi24YdZxAnFTVJFbp8Z2EC4";
        String auth_code = "XvN0VbbRq2vGSZzv54QfQMllFJSfN6FIJMHboVTxEuAHYT9DFvCiZLboeza4b8tt";

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

    @Test
    public void testICBCOrderSendMess() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCOrderSendMessRequest request = new ICBCOrderSendMessRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160429000001");

        request.setOrderId("020160625IM8617785");
        request.setLogisticsCompany("0000000605");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,   -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2016-06-27 16:33:57");
        request.setShippingTime(date);
//        request.setShippingTime(calendar.getTime());
        request.setShippingCode("589815060333");

        ICBCSendMessageProduct product = new ICBCSendMessageProduct();
        product.setProductId("0000516069");
        product.setProductCode("435");
        product.setProductName("工行电商测试商品");
//        product.setGrossWeight("1");
        List<ICBCSendMessageProduct> list = new ArrayList<>();
        list.add(product);
        request.setProductList(list);
        service.ICBCOrderSendMess(request);
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
    @Test
    public void testICBCStorageModify() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCStorageModifyRequest request = new ICBCStorageModifyRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160428000002");

        List<ICBCStorageModifyProduct> productList = new ArrayList<>();
        ICBCStorageModifyProduct product = new ICBCStorageModifyProduct();
        product.setProductId("0000516069");
        product.setProductSkuId("00000000000000740455");
        product.setStorage("188");
        productList.add(product);

        request.setStorageModifyProducts(productList);
        service.ICBCStorageModify(request);
    }

    @Test
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

    @Test
    public void testICBCCategoryAttrQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";
        // 正式环境 商户ID 10016788
//        String app_key ="NXZnaaVH";
//        String app_secret = "APPz5V5SiUi24YdZxAnFTVJFbp8Z2EC4";
//        String auth_code = "XvN0VbbRq2vGSZzv54QfQMllFJSfN6FIJMHboVTxEuAHYT9DFvCiZLboeza4b8tt";
        // 招金账号
//        String app_key ="WToprpch";
//        String app_secret = "APP5yKleEaSpHxdF1ViTfBg4pBtNnAW9";
//        String auth_code = "XBl0P0KxKcq5k7wCH2CP6dwRSAa11tZfrHT852b3oNkagVAOURdX7DLCDoUXqSNI";

        ICBCCategoryAttrQueryRequest request = new ICBCCategoryAttrQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160504000003");
        ICBCCategoryAttrQueryResponse resp = service.ICBCCategoryAttrQuery(request);
        System.out.print(resp);
    }

    @Test
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
//        idList.add("020160602IM8617642");
        idList.add("020160625IM8617793");
//        idList.add("020160625IM8617782");
//        idList.add("020160625IM8617781");
//        idList.add("020160619IM8617682");
//        idList.add("020160619IM8617681");
//        idList.add("020160602IM8617655");
//        idList.add("020160602IM8617654");
//        idList.add("020160602IM8617662");
//        idList.add("020160602IM8617661");
//        idList.add("020160601IM8617623");
//        idList.add("020160601IM8617622");
        request.setOrderIdList(idList);
        service.ICBCOrderDetailQuery(request);
    }

    @Test
    public void testICBCProductDetailQuery() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductDetailQueryRequest request = new ICBCProductDetailQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160429000001");
        List<String> idList = new ArrayList<>();
        idList.add("0000515931");
        idList.add("0000515958");
        idList.add("0000515959");
        idList.add("0000515964");
        request.setProductIdList(idList);
        service.ICBCProductDetailQuery(request);
    }



    @Test
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
    @Test
    public void testICBCProductCreate() throws Exception {
        SubmitICBCService service = new SubmitICBCServiceImpl();
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";


        ICBCProductCreateRequest request = new ICBCProductCreateRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160511000001");

        request.setProductName("特大橙子侧4个");
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
//        request.setSkuOpenFlag("0");
        request.setSkuOpenFlag("1");
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

        List<ICBCSkuProduct> skuProductList = new ArrayList<>();
        //---------------product1--------------
        ICBCSkuProduct product1 = new ICBCSkuProduct();
        product1.setProductEmallPrice("1000");
        product1.setProductMarketPrice("2000");
        product1.setProductStorage("20");
        List<ICBCSaleProperty> salePropertyList1 = new ArrayList<>();
        ICBCSaleProperty saleProperty1 = new ICBCSaleProperty();
        saleProperty1.setSalePropId("0000100757");
        saleProperty1.setSalePropValueId("0000028422");
        saleProperty1.setSalePropValue("小份");
        saleProperty1.setIsColor("0");
        salePropertyList1.add(saleProperty1);
        product1.setSalePropertiesList(salePropertyList1);
        skuProductList.add(product1);

        //---------------product2--------------
        ICBCSkuProduct product2 = new ICBCSkuProduct();
        product2.setProductEmallPrice("1050");
        product2.setProductMarketPrice("2000");
        product2.setProductStorage("20");
        List<ICBCSaleProperty> salePropertyList2 = new ArrayList<>();
        ICBCSaleProperty saleProperty2 = new ICBCSaleProperty();
        saleProperty2.setSalePropId("0000100757");
        saleProperty2.setSalePropValueId("0000028421");
        saleProperty2.setSalePropValue("大份");
        saleProperty2.setIsColor("0");
        salePropertyList2.add(saleProperty2);
        product2.setSalePropertiesList(salePropertyList2);
//------------------------------------------------------------
        skuProductList.add(product2);

        request.setSkuProductList(skuProductList);

        service.ICBCProductCreate(request);
    }

    @Test
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
        request.setProductName("测试橙子1");
        request.setPriceMode("001");
        request.setProductMarketPrice("100");
        request.setProductEmallPrice("30");
        request.setStorageLimitNum("10");
        request.setProductMerchantId("123");
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

    public void headTest() throws Exception {
        String s = "<?xml version='1.0' encoding='UTF-8'?><response><head><method>icbc.tools.time</method><req_sid>20160428000002</req_sid><version>1.0</version><timestamp>2016-04-28 14:22:48.00421</timestamp><app_key>0vnX50Qz</app_key><auth_code>uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4</auth_code><ret_code>0</ret_code><ret_msg>OK</ret_msg><sign>N7NaD8yZjsLQ3SQuz2ZamB6C1NuPHVDJgF1Os0E3J2U=</sign></head><body><order_list><order><order_id>1</order_id></order><order><order_id>2</order_id></order></order_list></body></response>";
        ICBCOrderListQueryResponse response = XmlUtil.fromXML(s, ICBCOrderListQueryResponse.class);
        int bodyStart = s.indexOf("<body>");
        int bodyEnd = s.indexOf("</body>")+7;
        String body = s.substring(bodyStart,bodyEnd);
        System.out.println(response);
    }
    @Test
    public void signCheckTest()
    {
        String app_key ="0vnX50Qz";
        String app_secret = "APPsdRdc7Z5TiilGn10YIeaUwGLbDzaD";
        String auth_code = "uvuL0k2tWFJjvqQM8B1EPvGi1vDPeSngcKdd2qrlaZVNf9diq05fYX0gbfDaQTD4";

        ICBCCategoryAttrQueryRequest request = new ICBCCategoryAttrQueryRequest();
        request.setAppKey(app_key);
        request.setAppSecret(app_secret);
        request.setAuthCode(auth_code);
        request.setReqSid("20160504000003");
        request.setSign("44fc0b4616bf224c9e292adf1bdca9e3");

        Map<String,String> map = new HashMap<>();
        map.put("appKey",request.getAppKey());
        map.put("appSecret",request.getAppSecret());
        map.put("authCode",request.getAuthCode());
        map.put("reqSid",request.getReqSid());
        map.put("sign",request.getSign());

        boolean flag = SignUtil.checkSign(map);
        System.out.println(flag);
    }
}