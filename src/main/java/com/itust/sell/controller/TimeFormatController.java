package com.itust.sell.controller;

import com.itust.sell.dto.ResultResponse;
import com.itust.sell.enums.SellErrEnum;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: TimeFormatController
 * @description: TODO
 * @author: FangXu
 * @create: 2018-12-03 14:45
 */
@RestController
public class TimeFormatController {

    @PostMapping(value = "test-time")
    public ResultResponse strToDate(Date time, String author) {

        if (time == null) {
            return ResultResponse.fail(SellErrEnum.PARAMS_ERR.getCode(), "time为空或转化异常");
        }

        Map<String, Object> result = new HashMap<>(2);
        result.put("author", author);
        result.put("time", time);
        return ResultResponse.success(result);
    }
}
