package com.ben.springmvc.exception;

/**
 * @Author: benjieqiang
 * @CreateTime: 2023-12-11  17:38
 * @Description: BussinessException
 * @Version: 1.0
 */
public class BussinessException extends Exception {
    String msg;
    String code;

    public BussinessException(String message) {
        super(message);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
