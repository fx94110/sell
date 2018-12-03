package com.itust.sell.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: DateUtil
 * @description: TODO
 * @author: FangXu
 * @create: 2018-12-03 14:30
 */
public class DateUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    public static final String FORMAT_DATE_8 = "yyyyMMdd";
    public static final String FORMAT_DATE_10 = "yyyy-MM-dd";
    public static final String FORMAT_DATE_14 = "yyyyMMddHHmmss";
    public static final String FORMAT_DATE_16 = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_DATE_19 = "yyyy-MM-dd HH:mm:ss";

    public static Date strToDate(String source, String dateFormat) {

        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Date date = null;

        try {
            date = format.parse(source);
        } catch (ParseException e) {
            LOGGER.error("strToDate 转化异常！！", e);
        }

        return date;
    }
}
