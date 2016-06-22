package com.sztx.mall.adapter.ccb.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/16
 * Time : 14:29
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerProductItem {

    //商品SKU	varchar/60	非空	如果不为空，商品SKU须在第三方平台存在
    @XmlElement(name = "sku_id")
    private String skuId;

    //商户商品编号	varchar/60	非空	sku_id和pro_id不能同时为空。
    @XmlElement(name = "pro_id")
    private String proId;

    //商品名称	varchar/255	非空
    @XmlElement(name = "prod_name")
    private String prodName;

    //商品规格描述	varchar/200		商品描述里面包含商品属性以及属性值，比如：颜色：黑，尺码37
    @XmlElement(name = "prod_desc")
    private String prodDesc;

    //商品数量	int/10	非空	购买数量
    @XmlElement(name = "prod_buy_amt")
    private String prodBuyAmt;

    //商品单价	decimal(10,2)	非空	优惠后的单价，即订单商品中成交价格
    @XmlElement(name = "prod_price")
    private String prodPrice;

    //单件商品优惠金额	decimal(10,2)		单件商品优惠金额，         即商城价-订单商品单价
    @XmlElement(name = "prod_discount")
    private String prodDiscount;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdBuyAmt() {
        return prodBuyAmt;
    }

    public void setProdBuyAmt(String prodBuyAmt) {
        this.prodBuyAmt = prodBuyAmt;
    }

    public String getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(String prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdDiscount() {
        return prodDiscount;
    }

    public void setProdDiscount(String prodDiscount) {
        this.prodDiscount = prodDiscount;
    }
}
