package com.sztx.mall.adapter.icbc.model.xmlModel;

import com.sztx.mall.adapter.icbc.model.businessModel.ICBCOrder;
import com.sztx.mall.adapter.icbc.model.businessModel.ICBCRefund;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * User : LiuKe
 * Date : 2016/4/29
 * Time : 14:34
 */

@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ICBCRefundQueryResponseBody {

    @XmlElementWrapper(name="refund_list")
    @XmlElement(name = "refund")
    private List<ICBCRefund> refundList;

    public List<ICBCRefund> getRefundList() {
        return refundList;
    }

    public void setRefundList(List<ICBCRefund> refundList) {
        this.refundList = refundList;
    }
}


