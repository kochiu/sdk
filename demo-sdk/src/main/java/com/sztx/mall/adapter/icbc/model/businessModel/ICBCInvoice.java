package com.sztx.mall.adapter.icbc.model.businessModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 8:54
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCInvoice {

    @XmlElement(name="invoice_type")
    private String invoiceType;
    @XmlElement(name="invoice_title")
    private String invoiceTitle;
    @XmlElement(name="invoice_content")
    private String invoiceContent;
    @XmlElement(name="register_address")
    private String registerAddress;
    @XmlElement(name="register_tel")
    private String registerTel;
    @XmlElement(name="deposit_bank")
    private String depositBank;
    @XmlElement(name="bank_account")
    private String bankAccount;
    @XmlElement(name="taxpayer_id")
    private String taxpayerId;

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

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisterTel() {
        return registerTel;
    }

    public void setRegisterTel(String registerTel) {
        this.registerTel = registerTel;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }
}
