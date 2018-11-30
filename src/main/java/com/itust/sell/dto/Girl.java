package com.itust.sell.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @program: Girl
 * @description: TODO
 * @author: FangXu
 * @create: 2018-11-29 18:49
 */
@Data
public class Girl implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1472416516830641512L;

    private Integer id;
    private String cupSize;

    @Min(value = 18, message = "未成年少女禁止入内")
    private Integer age;

}
