package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 17:43
 */
@XmlRootElement(name="response")
public class ICBCOrderSendMessResponse {
    private ICBCResponseHead head;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }
}
