package com.sztx.mall.adapter.icbc.model.httpModel;

import com.sztx.mall.adapter.icbc.model.xmlModel.ICBCProductLogisticsResponseBody;
import com.sztx.mall.adapter.icbc.model.xmlModel.base.ICBCResponseHead;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User : LiuKe
 * Date : 2016/5/4
 * Time : 15:27
 */

@XmlRootElement(name="response")
public class ICBCProductLogisticsResponse {
    private ICBCResponseHead head;
    private ICBCProductLogisticsResponseBody body;

    public ICBCResponseHead getHead() {
        return head;
    }

    public void setHead(ICBCResponseHead head) {
        this.head = head;
    }

    public ICBCProductLogisticsResponseBody getBody() {
        return body;
    }

    public void setBody(ICBCProductLogisticsResponseBody body) {
        this.body = body;
    }
}
