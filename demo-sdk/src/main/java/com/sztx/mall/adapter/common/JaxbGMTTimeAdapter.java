package com.sztx.mall.adapter.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * User : LiuKe
 * Date : 2016/5/11
 * Time : 9:51
 */
public class JaxbGMTTimeAdapter extends XmlAdapter<String, Date> {

    static final String STANDARM_DATE_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";
    @Override
    public Date unmarshal(String v) throws Exception {
        if (v == null) {
            return null;
        }
        SimpleDateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT, Locale.US);
        return format.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        DateFormat format = new SimpleDateFormat(STANDARM_DATE_FORMAT);
        return format.format(v);
    }
}
