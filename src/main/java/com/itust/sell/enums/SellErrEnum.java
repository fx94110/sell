package com.itust.sell.enums;

/**
 * @program: SellErrEnum
 * @description: 错误码
 * @author: FangXu
 * @create: 2018-11-30 17:05
 */
public enum SellErrEnum {


    EMPTY_NAME_ERR(1101, "name不能为空"),
    PARAMS_ERR(1102, "参数错误"),
    ERR_OTHER(-999, "未知错误"),
    ;

    private int code;
    private String message;


    private SellErrEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public static SellErrEnum getValue(int code) {

        for (SellErrEnum errEnum : SellErrEnum.values()) {
            if (errEnum.getCode() == code) {
                return errEnum;
            }
        }

        return ERR_OTHER;
    }

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public int getCode() {
        return code;
    }



    /**
     * Gets the value of message.
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }


}
