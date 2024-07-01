package com.vanpine.Entity;

import lombok.Data;

@Data
public class Result<V> {
    private Integer code;
    private String msg;
    private V data;

    public Result() {
    }

    public Result(Integer code, String msg, V data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /*
     *  处理正确信息，无具体data
     * */
    public static Result<String> success() {
        return new Result<>(1, null, "操作成功");
    }

    /*
     *  处理正确信息，响应具体的data
     * */
    public static <V> Result<V> success(V data) {
        return new Result<>(1, null, data);
    }

    /*
     *  处理错误信息，返回错误消息
     * */
    public static <V> Result<V> error(String msg) {
        return new Result<>(0, msg, null);
    }

}
