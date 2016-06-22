package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCProductBasicProperty;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCProductDetailInfo;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCSaleProperty;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCSkuProduct;
import com.sztx.mall.adapter.icbc.model.httpModel.base.ICBCRequest;

import java.util.Date;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/3
 * Time : 11:24
 */
public class ICBCProductCreateRequest extends ICBCRequest {

    private String productName;
    private String prodSubTitle;
    private String prodCatId;
    private String prodBrandId;
    private String priceMode;
    private String productMarketPrice;
    private String productEmallPrice;
    private String netWeight;
    private String productStorage;
    private String storageLimitNum;
    private String otherPrice;
    private String deductMode;
    private String productUnit;
    private String productBarCode;
    private String productMerchantId;
    private String imgId1;
    private String imgId2;
    private String imgId3;
    private String imgId4;
    private String imgId5;
    private String isDelivery;
    private String templateId;
    private String templateTypeId;
    private String productWeight;
    private String productBulk;
    private String buyChannel;
    private String putOnType;
    private Date putOnTime;
    private String willToAuth;
    private String sevRefundSupported;
    private String mInsNum;
    private String taxRate;
    private String modifyRemark;
    private String isGroupBuy;
    private String skuOpenFlag;
    private List<ICBCProductBasicProperty> productBasicPropertiesList;
    private List<ICBCSkuProduct> skuProductList;
    private List<ICBCProductDetailInfo> productDetailInfoList;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdSubTitle() {
        return prodSubTitle;
    }

    public void setProdSubTitle(String prodSubTitle) {
        this.prodSubTitle = prodSubTitle;
    }

    public String getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(String prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getProdBrandId() {
        return prodBrandId;
    }

    public void setProdBrandId(String prodBrandId) {
        this.prodBrandId = prodBrandId;
    }

    public String getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(String priceMode) {
        this.priceMode = priceMode;
    }

    public String getProductMarketPrice() {
        return productMarketPrice;
    }

    public void setProductMarketPrice(String productMarketPrice) {
        this.productMarketPrice = productMarketPrice;
    }

    public String getProductEmallPrice() {
        return productEmallPrice;
    }

    public void setProductEmallPrice(String productEmallPrice) {
        this.productEmallPrice = productEmallPrice;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(String productStorage) {
        this.productStorage = productStorage;
    }

    public String getStorageLimitNum() {
        return storageLimitNum;
    }

    public void setStorageLimitNum(String storageLimitNum) {
        this.storageLimitNum = storageLimitNum;
    }

    public String getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(String otherPrice) {
        this.otherPrice = otherPrice;
    }

    public String getDeductMode() {
        return deductMode;
    }

    public void setDeductMode(String deductMode) {
        this.deductMode = deductMode;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductBarCode() {
        return productBarCode;
    }

    public void setProductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public String getProductMerchantId() {
        return productMerchantId;
    }

    public void setProductMerchantId(String productMerchantId) {
        this.productMerchantId = productMerchantId;
    }

    public String getImgId1() {
        return imgId1;
    }

    public void setImgId1(String imgId1) {
        this.imgId1 = imgId1;
    }

    public String getImgId2() {
        return imgId2;
    }

    public void setImgId2(String imgId2) {
        this.imgId2 = imgId2;
    }

    public String getImgId3() {
        return imgId3;
    }

    public void setImgId3(String imgId3) {
        this.imgId3 = imgId3;
    }

    public String getImgId4() {
        return imgId4;
    }

    public void setImgId4(String imgId4) {
        this.imgId4 = imgId4;
    }

    public String getImgId5() {
        return imgId5;
    }

    public void setImgId5(String imgId5) {
        this.imgId5 = imgId5;
    }

    public String getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(String isDelivery) {
        this.isDelivery = isDelivery;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateTypeId() {
        return templateTypeId;
    }

    public void setTemplateTypeId(String templateTypeId) {
        this.templateTypeId = templateTypeId;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductBulk() {
        return productBulk;
    }

    public void setProductBulk(String productBulk) {
        this.productBulk = productBulk;
    }

    public String getBuyChannel() {
        return buyChannel;
    }

    public void setBuyChannel(String buyChannel) {
        this.buyChannel = buyChannel;
    }

    public String getPutOnType() {
        return putOnType;
    }

    public void setPutOnType(String putOnType) {
        this.putOnType = putOnType;
    }

    public Date getPutOnTime() {
        return putOnTime;
    }

    public void setPutOnTime(Date putOnTime) {
        this.putOnTime = putOnTime;
    }

    public String getWillToAuth() {
        return willToAuth;
    }

    public void setWillToAuth(String willToAuth) {
        this.willToAuth = willToAuth;
    }

    public String getSevRefundSupported() {
        return sevRefundSupported;
    }

    public void setSevRefundSupported(String sevRefundSupported) {
        this.sevRefundSupported = sevRefundSupported;
    }

    public String getmInsNum() {
        return mInsNum;
    }

    public void setmInsNum(String mInsNum) {
        this.mInsNum = mInsNum;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getModifyRemark() {
        return modifyRemark;
    }

    public void setModifyRemark(String modifyRemark) {
        this.modifyRemark = modifyRemark;
    }

    public String getIsGroupBuy() {
        return isGroupBuy;
    }

    public void setIsGroupBuy(String isGroupBuy) {
        this.isGroupBuy = isGroupBuy;
    }

    public String getSkuOpenFlag() {
        return skuOpenFlag;
    }

    public void setSkuOpenFlag(String skuOpenFlag) {
        this.skuOpenFlag = skuOpenFlag;
    }

    public List<ICBCProductBasicProperty> getProductBasicPropertiesList() {
        return productBasicPropertiesList;
    }

    public void setProductBasicPropertiesList(List<ICBCProductBasicProperty> productBasicPropertiesList) {
        this.productBasicPropertiesList = productBasicPropertiesList;
    }

    public List<ICBCSkuProduct> getSkuProductList() {
        return skuProductList;
    }

    public void setSkuProductList(List<ICBCSkuProduct> skuProductList) {
        this.skuProductList = skuProductList;
    }

    public List<ICBCProductDetailInfo> getProductDetailInfoList() {
        return productDetailInfoList;
    }

    public void setProductDetailInfoList(List<ICBCProductDetailInfo> productDetailInfoList) {
        this.productDetailInfoList = productDetailInfoList;
    }
}
