package com.sztx.mall.adapter.ccb.model.httpModel;

import com.sztx.mall.adapter.ccb.model.httpModel.base.CCBServerRequestHead;
import com.sztx.mall.adapter.ccb.model.xmlModel.CCBServerSkuStoreQueryRequestBody;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * 建设银行库存查询接口请求实体
 * User : LiuKe
 * Date : 2016/5/10
 * Time : 10:34
 *
 */

@XmlRootElement(name="request")
public class CCBServerSkuStoreQueryRequest {

    private CCBServerRequestHead head;

    private CCBServerSkuStoreQueryRequestBody body;

    public CCBServerRequestHead getHead() {
        return head;
    }

    public void setHead(CCBServerRequestHead head) {
        this.head = head;
    }

    public CCBServerSkuStoreQueryRequestBody getBody() {
        return body;
    }

    public void setBody(CCBServerSkuStoreQueryRequestBody body) {
        this.body = body;
    }
}
