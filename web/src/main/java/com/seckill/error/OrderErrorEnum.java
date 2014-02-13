package com.seckill.error;

/**
 * User: 黄锴
 * Date: 13-11-17
 * Time: 下午2:38
 */
public enum OrderErrorEnum {
    MISSING_VCODE("MISSING_VCODE", "请填写验证码"),
    BAD_VCODE("BAD_VCODE", "验证码错误"),
    SAME_USER_PROCESSING("SAME_USER_PROCESSING", "一个账号不能同时发起多个秒杀请求"),
    BAD_USER("BAD_URSER", "用户被禁止参加秒杀活动"),
    SYSTEM_ERROR("SYSTEM_ERROR", "服务器开小差了");

    private String code;
    private String msg;

    OrderErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
