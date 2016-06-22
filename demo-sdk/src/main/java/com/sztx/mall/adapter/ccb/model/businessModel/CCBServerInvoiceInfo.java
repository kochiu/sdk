package com.sztx.mall.adapter.ccb.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/5/16
 * Time : 14:32
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerInvoiceInfo {

    //发票类型0-普通发票,1-增值税发票 	int/1	非空
    @XmlElement(name = "invoice_type")
    private String invoiceType;

    //发票抬头	varchar/200	非空
    @XmlElement(name = "invoice_title")
    private String invoiceTitle;

    //纳税人识别号	varchar/100	可空	增票时非空
    @XmlElement(name = "tax_payer_id")
    private String taxPayerId;

    //注册地址	varchar/255	可空	增票时非空
    @XmlElement(name = "register_address")
    private String registerAddress;

    //注册电话	varchar/100	可空	增票时非空
    @XmlElement(name = "register_phone")
    private String registerPhone;

    //开户行	varchar/200	可空	增票时非空
    @XmlElement(name = "bank_name")
    private String bankName;

    //开户行账号	varchar/20	可空	增票时非空
    @XmlElement(name = "bank_acount")
    private String bankAcount;

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getTaxPayerId() {
        return taxPayerId;
    }

    public void setTaxPayerId(String taxPayerId) {
        this.taxPayerId = taxPayerId;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAcount() {
        return bankAcount;
    }

    public void setBankAcount(String bankAcount) {
        this.bankAcount = bankAcount;
    }
}
