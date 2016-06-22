package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCOrderDetailQueryResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/4/23
 * Time : 17:10
 */

@XmlRootElement(name="response")
public class ICBCOrderDetailQueryResponse {
    private ICBCResponseHead head;
    private ICBCOrderDetailQueryResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCOrderDetailQueryResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCOrderDetailQueryResponseBody body) {
        this.body = body;
    }
}
