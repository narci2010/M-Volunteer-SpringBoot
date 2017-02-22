package com.github.oneone1995.mvolunteer.config.result;

/**
 * Created by wangl on 2017/2/7.
 * 自定义请求状态码
 */
public enum ResultStatus {
    SUCCESS(200, "成功"),
    USERNAME_OR_PASSWORD_ERROR(-1001, "用户名或密码错误"),
    USER_NOT_FOUND(-1002, "用户不存在"),
    USER_NOT_LOGIN(-1003, "用户未登录"),
    ACTIVITY_NOT_FOUNT(-1004, "活动列表为空"),
    FILE_IS_EMPTY(-1005, "文件为空"),
    FILE_UPLOAD_ERROR(-1006, "文件上传失败"),
    SIGN_IN_FAIL(-1007, "签到失败"),
    ACTIVITY_CREATE_FAIL(-1008, "创建活动失败");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息描述
     */
    private String message;

    ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
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
}
