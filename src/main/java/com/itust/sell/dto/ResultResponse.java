package com.itust.sell.dto;

import com.itust.sell.enums.SellErrEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: ResultResponse
 * @description: TODO
 * @author: FangXu
 * @create: 2018-11-29 20:27
 */
@Data
public class ResultResponse implements Serializable {

     /**
      *
      */
     private static final long serialVersionUID = 4552613260952113711L;

     public static final Integer SUCCESS_CODE=0;
     public static final Integer FAIL_CODE = 1;

     private Integer code;
     private String message;
     private String errDetail;
     private Object result;


     public ResultResponse() {}

     public static ResultResponse success(Object result) {
          ResultResponse response = new ResultResponse();
          response.setCode(SUCCESS_CODE);
          response.setResult(result);
          return response;
     }

     public static ResultResponse success() {
          return success(null);
     }


     public static ResultResponse fail(Integer code, String message) {

          ResultResponse response = new ResultResponse();
          response.setCode(code);
          response.setMessage(message);
          return response;
     }

    public static ResultResponse fail(SellErrEnum sellErrEnum) {

        ResultResponse response = new ResultResponse();
        response.setCode(sellErrEnum.getCode());
        response.setMessage(sellErrEnum.getMessage());
        return response;
    }

}
