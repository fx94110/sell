package com.itust.sell.handle;

import com.itust.sell.dto.ResultResponse;
import com.itust.sell.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: ExceptionHandle
 * @description: 异常统一返回
 * @author: FangXu
 * @create: 2018-11-29 20:26
 */
@ControllerAdvice
public class ExceptionHandle {


    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultResponse handle(Exception e) {

        if (e instanceof CustomException) {
            CustomException exception = (CustomException) e;
            return ResultResponse.fail(exception.getCode(), exception.getMessage());
        }
        LOGGER.error("【系统异常】");
        return ResultResponse.fail(-999, "未知错误");
    }
}
