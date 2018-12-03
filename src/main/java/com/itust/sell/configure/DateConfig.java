package com.itust.sell.configure;

import org.springframework.context.annotation.Configuration;

/**
 * @program: DateConfig
 * @description: string 转 date
 * @author: FangXu
 * @create: 2018-12-03 14:16
 */
@Configuration
public class DateConfig {

    /*@Bean(name = "conversionService")
    public ConversionServiceFactoryBean getConversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        Set<Converter> converters = new HashSet<>();
        converters.add(new DateConvert());
        bean.setConverters(converters);
        return bean;
    }*/

}
