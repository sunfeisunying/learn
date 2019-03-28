package com.example.learningservice.vo;

/**
 * Created by liujie2 on 17-8-31.
 */
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(T data) {
        this(0, "ok", data);
    }

    public static Result<String> ok(String message) {
        return new Result<>(0, message, message);
    }

    public static Result ok() {
        return new Result(0, "ok", null);
    }

    public static <T> Result ok(T data) {
        return new Result(0, "ok", data);
    }

    public static  Result fail(){
        return new Result(1, "fail", null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
