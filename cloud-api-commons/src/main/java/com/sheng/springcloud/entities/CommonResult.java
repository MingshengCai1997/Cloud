package com.sheng.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  通用返回结果集
 *  【这个泛型就是为了通用，如果是一个payment就返回一个payment，如果是个order，则返回order】
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;

    /**
     * @function 只有全参和空参，定义一个双参数的构造器
     * @param code
     * @param message
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }


}
