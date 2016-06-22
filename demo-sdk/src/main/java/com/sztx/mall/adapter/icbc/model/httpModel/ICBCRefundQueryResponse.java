package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCRefundQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 18:24
 */
@XmlRootElement(name="response")
public class ICBCRefundQueryResponse {

    private ICBCResponseHead head;
    private ICBCRefundQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCRefundQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCRefundQueryResponseBody body) {
        this.body = body;
    }
}
