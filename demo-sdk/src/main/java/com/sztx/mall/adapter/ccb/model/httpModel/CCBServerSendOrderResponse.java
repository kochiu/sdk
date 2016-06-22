package com.sztx.mall.adapter.ccb.model.httpModel;

import com.sztx.mall.adapter.ccb.model.httpModel.base.CCBServerResponseHead;
import com.sztx.mall.adapter.ccb.model.xmlModel.CCBServerSendOrderResponseBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 建设银行订单信息推送接口返回实体
 * User : LiuKe
 * Date : 2016/5/12
 * Time : 11:01
 */

@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSendOrderResponse {

    private CCBServerResponseHead head;

    private CCBServerSendOrderResponseBody body;

    public CCBServerResponseHead getHead() {
        return head;
    }

    public void setHead(CCBServerResponseHead head) {
        this.head = head;
    }

    public CCBServerSendOrderResponseBody getBody() {
        return body;
    }

    public void setBody(CCBServerSendOrderResponseBody body) {
        this.body = body;
    }
}
