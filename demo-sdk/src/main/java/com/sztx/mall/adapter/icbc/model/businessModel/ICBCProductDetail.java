package com.sztx.mall.adapter.icbc.model.businessModel;

import com.sztx.mall.adapter.common.JaxbGMTTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 16:47
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCProductDetail {

    @XmlElement(name="product_id")
    private String productId;
    @XmlElement(name="product_name")
    private String productName;
    @XmlElement(name="prod_sub_title")
    private String prodSubTitle;
    @XmlElement(name="product_status")
    private String productStatus;
    @XmlElement(name="product_merchant_id")
    private String productMerchantId;
    @XmlElement(name="product_market_price")
    private String productMarketPrice;
    @XmlElement(name="product_emall_price")
    private String productEmallPrice;
    @XmlElement(name="product_storage")
    private String productStorage;
    @XmlElement(name="deduct_mode")
    private String deductMode;
    @XmlElement(name="product_bar_code")
    private String productBarCode;
    @XmlElement(name="product_unit")
    private String productUnit;
    @XmlElement(name="product_brand")
    private String productBrand;
    @XmlElement(name="product_brand_id")
    private String productBrandId;
    @XmlElement(name="buy_channel")
    private String buyChannel;
    @XmlElement(name="product_weight")
    private String productWeight;
    @XmlElement(name="product_bulk")
    private String productBulk;
    @XmlElement(name="puton_type")
    private String putOnType;
    @XmlElement(name = "puton_time")
    @XmlJavaTypeAdapter(JaxbGMTTimeAdapter.class)
    private Date putOnTime;
    @XmlElement(name="is_sev_refund")
    private String isSevRefund;
    @XmlElementWrapper(name="basicproperties")
    @XmlElement(name = "basicproperty")
    private List<ICBCProductBasicProperty> productBasicPropertyList;
    @XmlElementWrapper(name="img_Ids")
    @XmlElement(name = "string")
    private List<String> imgIdList;
    @XmlElementWrapper(name="skuproducts")
    @XmlElement(name = "skuproduct")
    private List<ICBCProductDetailSkuProduct> skuProductList;
    @XmlElementWrapper(name="tringproducts")
    @XmlElement(name = "tringproduct")
    private List<ICBCProductDetailTring> productDetailTringList;
    @XmlElementWrapper(name="logstors")
    @XmlElement(name = "logstor")
    private List<ICBCProductDetailLogstor> productDetailLogstorList;
    @XmlElementWrapper(name="storages")
    @XmlElement(name = "storage")
    private List<ICBCProductDetailStorage> productDetailStorageList;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

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

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductMerchantId() {
        return productMerchantId;
    }

    public void setProductMerchantId(String productMerchantId) {
        this.productMerchantId = productMerchantId;
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

    public String getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(String productStorage) {
        this.productStorage = productStorage;
    }

    public String getDeductMode() {
        return deductMode;
    }

    public void setDeductMode(String deductMode) {
        this.deductMode = deductMode;
    }

    public String getProductBarCode() {
        return productBarCode;
    }

    public void setProductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductBrandId() {
        return productBrandId;
    }

    public void setProductBrandId(String productBrandId) {
        this.productBrandId = productBrandId;
    }

    public String getBuyChannel() {
        return buyChannel;
    }

    public void setBuyChannel(String buyChannel) {
        this.buyChannel = buyChannel;
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

    public String getIsSevRefund() {
        return isSevRefund;
    }

    public void setIsSevRefund(String isSevRefund) {
        this.isSevRefund = isSevRefund;
    }

    public List<ICBCProductBasicProperty> getProductBasicPropertyList() {
        return productBasicPropertyList;
    }

    public void setProductBasicPropertyList(List<ICBCProductBasicProperty> productBasicPropertyList) {
        this.productBasicPropertyList = productBasicPropertyList;
    }

    public List<String> getImgIdList() {
        return imgIdList;
    }

    public void setImgIdList(List<String> imgIdList) {
        this.imgIdList = imgIdList;
    }

    public List<ICBCProductDetailSkuProduct> getSkuProductList() {
        return skuProductList;
    }

    public void setSkuProductList(List<ICBCProductDetailSkuProduct> skuProductList) {
        this.skuProductList = skuProductList;
    }

    public List<ICBCProductDetailTring> getProductDetailTringList() {
        return productDetailTringList;
    }

    public void setProductDetailTringList(List<ICBCProductDetailTring> productDetailTringList) {
        this.productDetailTringList = productDetailTringList;
    }

    public List<ICBCProductDetailLogstor> getProductDetailLogstorList() {
        return productDetailLogstorList;
    }

    public void setProductDetailLogstorList(List<ICBCProductDetailLogstor> productDetailLogstorList) {
        this.productDetailLogstorList = productDetailLogstorList;
    }

    public List<ICBCProductDetailStorage> getProductDetailStorageList() {
        return productDetailStorageList;
    }

    public void setProductDetailStorageList(List<ICBCProductDetailStorage> productDetailStorageList) {
        this.productDetailStorageList = productDetailStorageList;
    }
}
