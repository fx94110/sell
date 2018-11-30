package com.itust.sell.exception;

import com.itust.sell.enums.SellErrEnum;
import lombok.Data;

/**
 * @program: CustomException
 * @description: TODO
 * @author: FangXu
 * @create: 2018-11-29 20:24
 */
@Data
public class CustomException extends RuntimeException {

    private Integer code;

    public CustomException(SellErrEnum sellErrEnum) {
        super(sellErrEnum.getMessage());
        this.code = sellErrEnum.getCode();
    }

}
