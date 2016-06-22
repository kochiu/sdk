package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCTimeQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 14:11
 */
@XmlRootElement(name="response")

public class ICBCTimeQueryResponse {
    private ICBCResponseHead head;
    private ICBCTimeQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCTimeQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCTimeQueryResponseBody body) {
        this.body = body;
    }
}
