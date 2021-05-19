package com.uitl;

public class RespBean {
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //不携带数据
    public static RespBean success(String msg) {
        return new RespBean(200, msg, null);
    }

    //携带数据
    public static RespBean success(String msg, Object data) {
        return new RespBean(200, msg, data);
    }

    //不携带数据
    public static RespBean error(String msg) {
        return new RespBean(202, msg, null);
    }

    //携带数据
    public static RespBean error(String msg, Object data) {
        return new RespBean(202, msg, data);
    }

    public RespBean() {
    }

    public RespBean(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

