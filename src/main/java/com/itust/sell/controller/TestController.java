package com.itust.sell.controller;

import com.itust.sell.dto.Girl;
import com.itust.sell.dto.ResultResponse;
import com.itust.sell.enums.SellErrEnum;
import com.itust.sell.exception.CustomException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: TestController
 * @description: TODO
 * @author: FangXu
 * @create: 2018-11-29 18:52
 */
@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    /** 原子安全性自增长 **/
    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger();

    @PostMapping(value = "/girls")
    public ResultResponse girlAdd(HttpServletRequest request, @Valid Girl girl, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            LOGGER.error("参数异常 ===》", bindingResult.getFieldError().getDefaultMessage());
            return ResultResponse.fail(SellErrEnum.PARAMS_ERR.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }

        // TODO 模拟插入主键
        girl.setId(ATOMIC_INTEGER.incrementAndGet());

        return ResultResponse.success(girl);
    }

    /**
     * 测试自定义异常
     * @param request
     * @param name
     * @return
     */
    @PostMapping(value = "/test-execption")
    public ResultResponse testException(HttpServletRequest request, String name) {

        if (StringUtils.isBlank(name)) {
            throw new CustomException(SellErrEnum.EMPTY_NAME_ERR);
        }

        return ResultResponse.success(name);
    }
}
