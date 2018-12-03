package com.itust.sell.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: DateFormatConfig
 * @description: date
 * @author: FangXu
 * @create: 2018-12-03 15:51
 */
@EnableWebMvc // 开启MVC配置，相当于 <mvc:annotation-driven/> 启动注解驱动
@Configuration
public class DateFormatConfig implements WebMvcConfigurer {

//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new DateConvert());
//        super.addFormatters(registry);
//    }


    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new DateConvert());
    }
}
