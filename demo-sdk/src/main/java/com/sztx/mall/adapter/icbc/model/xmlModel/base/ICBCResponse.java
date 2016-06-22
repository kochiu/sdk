package com.sztx.mall.adapter.icbc.model.xmlModel.base;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 14:19
 */
@XmlRootElement(name="response")
public class ICBCResponse {
    private ICBCResponseHead head;
    private String body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
