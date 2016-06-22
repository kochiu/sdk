package com.sztx.mall.adapter.icbc.util;

import com.sztx.mall.adapter.icbc.config.ICBCConfigInfo;
import com.sztx.mall.adapter.icbc.model.businessModel.*;
import com.sztx.mall.adapter.icbc.model.constansModel.ICBCProductUploadType;
import com.sztx.mall.adapter.icbc.model.httpModel.*;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;
import com.sztx.se.common.util.StringUtil;

import java.util.*;

/**
 * User : LiuKe
 * Date : 2016/4/19
 * Time : 15:31
 */
public class Converter {

    public static Map<String,String> baseConvert(ICBCRequest request)
    {
        Map<String,String> map = new HashMap<>();

        map.put("version", ICBCConfigInfo.VERSION_ICBCB2C);
        map.put("format", ICBCConfigInfo.FORMAT_ICBCB2C);
        map.put("timestamp",Util.getDateStringMillisecond(new Date()));
        map.put("req_sid",request.getReqSid());
        map.put("app_key",request.getAppKey());
        map.put("auth_code",request.getAuthCode());
        return map;
    }


    public static Map<String,String> convertPublic(ICBCTimeQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBC_TOOLS_TIME);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCTimeQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        return map;
    }

    public static Map<String,String> convertPublic(ICBCOrderListQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_ORDER_LIST);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCOrderListQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("create_start_time",Util.getDateString(request.getCreateStartTime()));
        map.put("create_end_time",Util.getDateString(request.getCreateEndTime()));
        map.put("modify_time_from",Util.getDateString(request.getModifyTimeFrom()));
        map.put("modify_time_to",Util.getDateString(request.getModifyTimeTo()));
        map.put("order_status",request.getOrderStatus());
        return map;
    }
    public static Map<String,String> convertPublic(ICBCProductListQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_LIST);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductListQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("create_start_time",Util.getDateString(request.getCreateStartTime()));
        map.put("create_end_time",Util.getDateString(request.getCreateEndTime()));
        map.put("modify_time_from",Util.getDateString(request.getModifyTimeFrom()));
        map.put("modify_time_to",Util.getDateString(request.getModifyTimeTo()));
        map.put("put_time_from",Util.getDateString(request.getPutTimeFrom()));
        map.put("put_time_to",Util.getDateString(request.getPutTimeTo()));
        map.put("product_status",request.getProductStatus());
        return map;
    }
    public static Map<String,String> convertPublic(ICBCOrderDetailQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_ORDER_DETAIL);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCOrderDetailQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("order_ids",Util.getIdString(request.getOrderIdList()));
        return map;
    }
    public static Map<String,String> convertPublic(ICBCProductDetailQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_DETAIL);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductDetailQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("product_ids",Util.getIdString(request.getProductIdList()));
        return map;
    }

    public static Map<String,String> convertPublic(ICBCOrderSendMessRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_ORDER_SENDMESS);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCOrderSendMessRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("order_id",request.getOrderId());
        map.put("shipping_time",Util.getDateString(request.getShippingTime()));
        map.put("logistics_company",request.getLogisticsCompany());
        map.put("shipping_code",request.getShippingCode());
        map.put("shipping_num",request.getShippingNum());
        map.put("notes",request.getNotes());
        List<ICBCSendMessageProduct> productList = request.getProductList();
        if(productList!=null&&productList.size()>0)
        {
            StringBuffer sb = new StringBuffer();
            for(ICBCSendMessageProduct product : productList)
            {
                sb.append("<product>");
                xmlConnectBuffer(sb,"product_id",product.getProductId());
                xmlConnectBuffer(sb,"product_code",product.getProductCode());
                xmlConnectBuffer(sb,"product_name",product.getProductName());
                if(!StringUtil.isBlank(product.getGrossWeight()))
                {
                    xmlConnectBuffer(sb,"gross_weight",product.getGrossWeight());
                }
                sb.append("</product>");
            }
            map.put("products",sb.toString());
        }
        return map;
    }

    public static Map<String,String> convertPublic(ICBCRefundQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_REFUND_QUERY);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCRefundQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("create_start_time",Util.getDateString(request.getCreateStartTime()));
        map.put("create_end_time",Util.getDateString(request.getCreateEndTime()));
        map.put("refund_status",request.getRefundStatus());
        map.put("order_id",request.getOrderId());
        return map;
    }


    public static Map<String,String> convertPublic(ICBCRefundApplyStatusRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_REFUND_APPLY_STATUS);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCRefundApplyStatusRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("order_id",request.getOrderId());
        map.put("refund_id",request.getRefundId());
        map.put("refund_amount",request.getRefundAmount());
        map.put("refund_time",Util.getDateString(request.getRefundTime()));
        map.put("refund_status",request.getRefundStatus());
        map.put("refund_feedback",request.getRefundFeedback());
        map.put("refund_operation",request.getRefundOperation());
        return map;
    }

    public static Map<String,String> convertPublic(ICBCStorageModifyRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_STORAGE_MODIFY);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCStorageModifyRequest request)
    {
        Map<String,String> map = new HashMap<>();
        List<ICBCStorageModifyProduct> productSKUList = request.getStorageModifyProducts();
        if(productSKUList!=null&&productSKUList.size()>0)
        {
            StringBuffer sb = new StringBuffer();
            for(ICBCStorageModifyProduct product : productSKUList)
            {
                sb.append("<product>");
                xmlConnectBuffer(sb,"product_id",product.getProductId());
                xmlConnectBuffer(sb,"product_sku_id",product.getProductSkuId());
                xmlConnectBuffer(sb,"product_code",product.getProductCode());
                xmlConnectBuffer(sb,"logstor_id",product.getLogstorId());
                xmlConnectBuffer(sb,"logstor_mer_id",product.getLogstorMerId());
                xmlConnectBuffer(sb,"storage",product.getStorage());
                sb.append("</product>");
            }
            map.put("products",sb.toString());
        }
        return map;
    }

    public static Map<String,String> convertPublic(ICBCProductImgUploadRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_IMGUPLOAD);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductImgUploadRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("img_file",request.getImgFile());
        map.put("img_category_id",request.getImgCategoryId());
        return map;
    }

    public static Map<String,String> convertPublic(ICBCProductCreateRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_CMD);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductCreateRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("upload_type", ICBCProductUploadType.UPLOAD_TYPE_CREATE);
        map.put("product_id", "");
        map.put("product_name",request.getProductName());
        map.put("prod_sub_title",request.getProdSubTitle());
        map.put("prod_cat_id",request.getProdCatId());
        map.put("prod_brand_id",request.getProdBrandId());
        map.put("price_mode",request.getPriceMode());
        map.put("product_market_price",request.getProductMarketPrice());
        map.put("product_emall_price",request.getProductEmallPrice());
        map.put("net_weight",request.getNetWeight());
        map.put("other_price",request.getOtherPrice());
        map.put("product_storage",request.getProductStorage());
        map.put("storage_limitnum",request.getStorageLimitNum());
        map.put("deduct_mode",request.getDeductMode());
        map.put("product_unit",request.getProductUnit());
        map.put("product_bar_code",request.getProductBarCode());
        map.put("product_merchant_id",request.getProductMerchantId());
        map.put("img_id1",request.getImgId1());
        map.put("img_id2",request.getImgId2());
        map.put("img_id3",request.getImgId3());
        map.put("img_id4",request.getImgId4());
        map.put("img_id5",request.getImgId5());
        map.put("is_delivery",request.getIsDelivery());
        map.put("template_id",request.getTemplateId());
        map.put("template_type_id",request.getTemplateTypeId());
        map.put("product_weight",request.getProductWeight());
        map.put("product_bulk",request.getProductBulk());
        map.put("buy_channel",request.getBuyChannel());
        map.put("puton_type",request.getPutOnType());
        map.put("puton_time",Util.getDateStringHour(request.getPutOnTime()));
        map.put("will_to_auth",request.getWillToAuth());
        map.put("sev_refund_supported",request.getSevRefundSupported());
        map.put("m_ins_num",request.getmInsNum());
        map.put("tax_rate",request.getTaxRate());
        map.put("modify_remark",request.getModifyRemark());
        map.put("is_group_buy",request.getIsGroupBuy());
        map.put("sku_open_flag",request.getSkuOpenFlag());
        List<ICBCProductBasicProperty> productBasicPropertiesList = request.getProductBasicPropertiesList() ;
        List<ICBCSkuProduct> skuProductList = request.getSkuProductList();
        List<ICBCProductDetailInfo> productDetailInfoList = request.getProductDetailInfoList();

        StringBuffer basicPropertiesBuffer = new StringBuffer();
        if(productBasicPropertiesList!=null&&productBasicPropertiesList.size()>0)
        {

            int size = productBasicPropertiesList.size();
            for(int i = 0 ; i < size ; i++)
            {
                basicPropertiesBuffer.append("<basicproperty>");
                ICBCProductBasicProperty productBasicProperty = productBasicPropertiesList.get(i);
                xmlConnectBuffer(basicPropertiesBuffer,"basic_prop_id",productBasicProperty.getBasicPropId());
                xmlConnectBuffer(basicPropertiesBuffer,"basic_prop_name",productBasicProperty.getBasicPropName());
                xmlConnectBuffer(basicPropertiesBuffer,"basic_prop_value",productBasicProperty.getBasicPropValue());
                xmlConnectBuffer(basicPropertiesBuffer,"is_custom",productBasicProperty.getIsCustom());
                basicPropertiesBuffer.append("</basicproperty>");
            }
        }
        map.put("basicproperties",basicPropertiesBuffer.toString());

        StringBuffer skuProductsBuffer = new StringBuffer();
        if(skuProductList!=null&&skuProductList.size()>0)
        {
            int size = skuProductList.size();
            for(int i = 0 ; i < size ; i++)
            {
                skuProductsBuffer.append("<skuproduct>");
                ICBCSkuProduct skuProduct = skuProductList.get(i);
                xmlConnectBuffer(skuProductsBuffer,"product_sku_id","");
                xmlConnectBuffer(skuProductsBuffer,"product_merchant_id",skuProduct.getProductMerchantId());
                xmlConnectBuffer(skuProductsBuffer,"product_market_price",skuProduct.getProductMarketPrice());
                xmlConnectBuffer(skuProductsBuffer,"product_emall_price",skuProduct.getProductEmallPrice());
                xmlConnectBuffer(skuProductsBuffer,"product_storage",skuProduct.getProductStorage());
                xmlConnectBuffer(skuProductsBuffer,"product_bar_code",skuProduct.getProductBarCode());
                List<ICBCSaleProperty> salePropertiesList = skuProduct.getSalePropertiesList();
                skuProductsBuffer.append("<saleproperties>");
                if(salePropertiesList!=null&&salePropertiesList.size()>0)
                {
                    int salePropertiesSize = salePropertiesList.size();
                    for(int j = 0 ; j<salePropertiesSize ; j++)
                    {
                        skuProductsBuffer.append("<saleproperty>");
                        ICBCSaleProperty saleProperty = salePropertiesList.get(j);
                        xmlConnectBuffer(skuProductsBuffer,"sale_prop_id",saleProperty.getSalePropId());
                        xmlConnectBuffer(skuProductsBuffer,"sale_prop_value_id",saleProperty.getSalePropValueId());
                        xmlConnectBuffer(skuProductsBuffer,"sale_prop_value",saleProperty.getSalePropValue());
                        xmlConnectBuffer(skuProductsBuffer,"is_color",saleProperty.getIsColor());
                        xmlConnectBuffer(skuProductsBuffer,"colorimg_id",saleProperty.getColorImgId());
                        skuProductsBuffer.append("</saleproperty>");
                    }
                }
                skuProductsBuffer.append("</saleproperties>");
                skuProductsBuffer.append("</skuproduct>");
            }
        }
        map.put("skuproducts",skuProductsBuffer.toString());
        StringBuffer detailInfosBuffer = new StringBuffer();
        if(productDetailInfoList!=null&&productDetailInfoList.size()>0)
        {
            int size = productDetailInfoList.size();
            for(int i = 0 ; i < size ; i++)
            {
                detailInfosBuffer.append("<detailinfo>");
                ICBCProductDetailInfo productDetailInfo = productDetailInfoList.get(i);
                xmlConnectBuffer(detailInfosBuffer,"detail_info_string",productDetailInfo.getDetailInfoString());
                xmlConnectBuffer(detailInfosBuffer,"detail_info_image_id",productDetailInfo.getDetailInfoImageId());
                detailInfosBuffer.append("</detailinfo>");
            }
        }
        map.put("detailinfos", detailInfosBuffer.toString());
        return map;
    }

    public static Map<String,String> convertPublic(ICBCProductModifyRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_CMD);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductModifyRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("upload_type", ICBCProductUploadType.UPLOAD_TYPE_MODIFY);
        map.put("product_id", request.getProductId());
        map.put("product_name",request.getProductName());
        map.put("prod_sub_title",request.getProdSubTitle());
        map.put("prod_cat_id","");
        map.put("prod_brand_id",request.getProdBrandId());
        map.put("price_mode",request.getPriceMode());
        map.put("product_market_price",request.getProductMarketPrice());
        map.put("product_emall_price",request.getProductEmallPrice());
        map.put("net_weight",request.getNetWeight());
        map.put("other_price",request.getOtherPrice());
        map.put("product_storage",request.getProductStorage());
        map.put("storage_limitnum",request.getStorageLimitNum());
        map.put("deduct_mode",request.getDeductMode());
        map.put("product_unit",request.getProductUnit());
        map.put("product_bar_code",request.getProductBarCode());
        map.put("product_merchant_id",request.getProductMerchantId());
        map.put("img_id1",request.getImgId1());
        map.put("img_id2",request.getImgId2());
        map.put("img_id3",request.getImgId3());
        map.put("img_id4",request.getImgId4());
        map.put("img_id5",request.getImgId5());
        map.put("is_delivery",request.getIsDelivery());
        map.put("template_id",request.getTemplateId());
        map.put("template_type_id",request.getTemplateTypeId());
        map.put("product_weight",request.getProductWeight());
        map.put("product_bulk",request.getProductBulk());
        map.put("buy_channel",request.getBuyChannel());
        map.put("puton_type",request.getPutOnType());
        map.put("puton_time",Util.getDateStringHour(request.getPutOnTime()));
        map.put("will_to_auth",request.getWillToAuth());
        map.put("sev_refund_supported",request.getSevRefundSupported());
        map.put("m_ins_num",request.getmInsNum());
        map.put("tax_rate",request.getTaxRate());
        map.put("modify_remark",request.getModifyRemark());
        map.put("is_group_buy",request.getIsGroupBuy());
        map.put("sku_open_flag",request.getSkuOpenFlag());
        List<ICBCProductBasicProperty> productBasicPropertiesList = request.getProductBasicPropertiesList() ;
        List<ICBCSkuProduct> skuProductList = request.getSkuProductList();
        List<ICBCProductDetailInfo> productDetailInfoList = request.getProductDetailInfoList();

        StringBuffer basicPropertiesBuffer = new StringBuffer();
        if(productBasicPropertiesList!=null&&productBasicPropertiesList.size()>0)
        {

            int size = productBasicPropertiesList.size();
            for(int i = 0 ; i < size ; i++)
            {
                basicPropertiesBuffer.append("<basicproperty>");
                ICBCProductBasicProperty productBasicProperty = productBasicPropertiesList.get(i);
                xmlConnectBuffer(basicPropertiesBuffer,"basic_prop_id",productBasicProperty.getBasicPropId());
                xmlConnectBuffer(basicPropertiesBuffer,"basic_prop_name",productBasicProperty.getBasicPropName());
                xmlConnectBuffer(basicPropertiesBuffer,"basic_prop_value",productBasicProperty.getBasicPropValue());
                xmlConnectBuffer(basicPropertiesBuffer,"is_custom",productBasicProperty.getIsCustom());
                basicPropertiesBuffer.append("</basicproperty>");
            }
        }
        map.put("basicproperties",basicPropertiesBuffer.toString());

        StringBuffer skuProductsBuffer = new StringBuffer();
        if(skuProductList!=null&&skuProductList.size()>0)
        {
            int size = skuProductList.size();
            for(int i = 0 ; i < size ; i++)
            {
                skuProductsBuffer.append("<skuproduct>");
                ICBCSkuProduct skuProduct = skuProductList.get(i);
                xmlConnectBuffer(skuProductsBuffer,"product_sku_id",skuProduct.getProductSkuId());
                xmlConnectBuffer(skuProductsBuffer,"product_merchant_id",skuProduct.getProductMerchantId());
                xmlConnectBuffer(skuProductsBuffer,"product_market_price",skuProduct.getProductMarketPrice());
                xmlConnectBuffer(skuProductsBuffer,"product_emall_price",skuProduct.getProductEmallPrice());
                xmlConnectBuffer(skuProductsBuffer,"product_storage",skuProduct.getProductStorage());
                xmlConnectBuffer(skuProductsBuffer,"product_bar_code",skuProduct.getProductBarCode());
                List<ICBCSaleProperty> salePropertiesList = skuProduct.getSalePropertiesList();
                skuProductsBuffer.append("<saleproperties>");
                if(salePropertiesList!=null&&salePropertiesList.size()>0)
                {
                    int salePropertiesSize = salePropertiesList.size();
                    for(int j = 0 ; j<salePropertiesSize ; j++)
                    {
                        skuProductsBuffer.append("<saleproperty>");
                        ICBCSaleProperty saleProperty = salePropertiesList.get(j);
                        xmlConnectBuffer(skuProductsBuffer,"sale_prop_id",saleProperty.getSalePropId());
                        xmlConnectBuffer(skuProductsBuffer,"sale_prop_value_id",saleProperty.getSalePropValueId());
                        xmlConnectBuffer(skuProductsBuffer,"sale_prop_value",saleProperty.getSalePropValue());
                        xmlConnectBuffer(skuProductsBuffer,"is_color",saleProperty.getIsColor());
                        xmlConnectBuffer(skuProductsBuffer,"colorimg_id",saleProperty.getColorImgId());
                        skuProductsBuffer.append("</saleproperty>");
                    }
                }
                skuProductsBuffer.append("</saleproperties>");
                skuProductsBuffer.append("</skuproduct>");
            }
        }
        map.put("skuproducts",skuProductsBuffer.toString());
        StringBuffer detailInfosBuffer = new StringBuffer();
        if(productDetailInfoList!=null&&productDetailInfoList.size()>0)
        {
            int size = productDetailInfoList.size();
            for(int i = 0 ; i < size ; i++)
            {
                detailInfosBuffer.append("<detailinfo>");
                ICBCProductDetailInfo productDetailInfo = productDetailInfoList.get(i);
                xmlConnectBuffer(detailInfosBuffer,"detail_info_string",productDetailInfo.getDetailInfoString());
                xmlConnectBuffer(detailInfosBuffer,"detail_info_image_id",productDetailInfo.getDetailInfoImageId());
                detailInfosBuffer.append("</detailinfo>");
            }
        }
        map.put("detailinfos", detailInfosBuffer.toString());
        return map;
    }

    public static Map<String,String> convertPublic(ICBCProductDeleteRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_CMD);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductDeleteRequest request)
    {
        Map<String,String> map = new HashMap<>();
        map.put("upload_type", ICBCProductUploadType.UPLOAD_TYPE_DELETE);
        map.put("product_id", request.getProductId());
        return map;
    }

    public static Map<String,String> convertPublic(ICBCProductLogisticsRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_LOGISTICS);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductLogisticsRequest request)
    {
        Map<String,String> map = new HashMap<>();
        return map;
    }

    public static Map<String,String> convertPublic(ICBCProductBrandQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_PRODUCT_BRAND);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCProductBrandQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        return map;
    }

    public static Map<String,String> convertPublic(ICBCCategoryAttrQueryRequest request)
    {
        Map<String,String> map = baseConvert(request);
        map.put("method", ICBCConfigInfo.METHOD_ICBCB2C_CAT_QRYATTR);
        return map;
    }
    public static Map<String,String> convertPrivate(ICBCCategoryAttrQueryRequest request)
    {
        Map<String,String> map = new HashMap<>();
        return map;
    }

    private static void xmlConnectBuffer(StringBuffer buffer ,String key,String value)
    {
        value = value==null?"":value;
        buffer.append("<").append(key).append(">").append(value).append("</").append(key).append(">");
    }
}
