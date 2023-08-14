package com.lst.entity;

/**
 * @author laoren
 * 创建时间:  2023/8/7 15:11
 * 封装一个service层统一的结果的实体类
 */
public class Result {
    /**
     * 业务状态码
     *      0, 来表示业务的成功
     *      非0, 表示失败.由这个状态码来判断我当前这个业务执行是否成功.
     *      注意: 这个跟我们的那个http状态码不是一个东西.
     */
    private Integer code;

    /**
     * 响应给浏览器的一些信息
     */
    private String msg;

    /**
     * 写在域对象当中的数据;
     */
    private Object data;

    private Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

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

    /**
     * 请求成功调用它
     * @param code 业务的状态码
     * @param msg 信息
     * @param data 携带的数据
     * @return Result对象
     */
    public static Result success(Integer code ,String msg, Object data){
        return new Result(code, msg, data);
    }

    public static Result success(String msg, Object data){
        return new Result(0, msg, data);
    }

    public static Result success(Object data){
        return new Result(0, "操作成功", data);
    }

    public static Result error(Integer code ,String msg, Object data){
        return new Result(code, msg, data);
    }

    public static Result error(String msg, Object data){
        return new Result(-1,  msg, data);
    }

    public static Result error(String msg){
        return new Result(-1, msg, null);
    }

    public static Result error(Integer code, String msg){
        return new Result(code, msg, null);
    }
}
