package com.itust.sell.configure;

import com.itust.sell.utils.DateUtil;
import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * @program: DateConvert
 * @description: TODO
 * @author: FangXu
 * @create: 2018-12-03 15:48
 */
public class DateConvert implements Converter<String, Date> {

    private static String datePattern1 = "^\\d{4}-\\d{1,2}-\\d{1,2}";
    private static String datePattern2 = "^\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}";
    private static String datePattern3 = "^\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}";

    @Override
    public Date convert(String source) {

        if (source.matches(datePattern1)) {
            return DateUtil.strToDate(source, DateUtil.FORMAT_DATE_10);
        } else if (source.matches(datePattern2)) {
            return DateUtil.strToDate(source, DateUtil.FORMAT_DATE_16);
        } else {
            return source.matches(datePattern3) ?
                    DateUtil.strToDate(source, DateUtil.FORMAT_DATE_19) : null;
        }

    }
}
