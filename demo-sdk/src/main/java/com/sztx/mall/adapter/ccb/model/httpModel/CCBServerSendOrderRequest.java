package com.sztx.mall.adapter.ccb.model.httpModel;

import com.sztx.mall.adapter.ccb.model.httpModel.base.CCBServerRequestHead;
import com.sztx.mall.adapter.ccb.model.xmlModel.CCBServerSendOrderRequestBody;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 建设银行订单信息推送接口请求实体
 * User : LiuKe
 * Date : 2016/5/12
 * Time : 11:01
 */

@XmlRootElement(name="request")
public class CCBServerSendOrderRequest {

    private CCBServerRequestHead head;

    private CCBServerSendOrderRequestBody body;

    public CCBServerRequestHead getHead() {
        return head;
    }

    public void setHead(CCBServerRequestHead head) {
        this.head = head;
    }

    public CCBServerSendOrderRequestBody getBody() {
        return body;
    }

    public void setBody(CCBServerSendOrderRequestBody body) {
        this.body = body;
    }
}
