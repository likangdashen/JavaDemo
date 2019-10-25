package com.whfc.enumTest;

/**
 * @Author: ；likang
 * @Description:
 * @Date:Create：in 2019/10/25 10:38
 * @Version：1.0
 */
public class ResultUtil {

    //工具类要提供成功的静态方法
    public static Result success() {
        Result result = new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg());
        return result;
    }

    //工具类提供静态方法
    public static Result success(Object object) {
        Result result = new Result(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }



}
