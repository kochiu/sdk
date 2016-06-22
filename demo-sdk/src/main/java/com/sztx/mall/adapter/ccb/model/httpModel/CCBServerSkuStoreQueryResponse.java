package com.sztx.mall.adapter.ccb.model.httpModel;

import com.sztx.mall.adapter.ccb.model.httpModel.base.CCBServerResponseHead;
import com.sztx.mall.adapter.ccb.model.xmlModel.CCBServerSkuStoreQueryResponseBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * 建设银行库存查询接口返回实体
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 11:06
 */

@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class CCBServerSkuStoreQueryResponse {

    private CCBServerResponseHead head;

    private CCBServerSkuStoreQueryResponseBody body;

    public CCBServerResponseHead getHead() {
        return head;
    }

    public void setHead(CCBServerResponseHead head) {
        this.head = head;
    }

    public CCBServerSkuStoreQueryResponseBody getBody() {
        return body;
    }

    public void setBody(CCBServerSkuStoreQueryResponseBody body) {
        this.body = body;
    }
}
