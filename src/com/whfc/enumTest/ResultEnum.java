package com.whfc.enumTest;

/**
 * @Author: ；likang
 * @Description:
 * @Date:Create：in 2019/10/25 10:28
 * @Version：1.0
 */

//枚举类的测试
public enum ResultEnum {

    //枚举的多种情况
    UNKNOWN_ERROR("100", "未知错误"),
    SUCCESS("200","发送成功"),
    PARAM_ERROR("400", "参数验证失败"),
    AUTHC_ERROR("401", "未认证"),
    AUTHZ_ERROR("403", "未授权"),
    NOT_FOUND("404", "未找到相关资源"),
    FAILURE("500", "服务器错误");

   //枚举内的字段
    private String code;
    private String msg;

    //枚举类的构造方法
    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //获得枚举类的get方法

    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
