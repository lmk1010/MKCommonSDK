package com.mk.common.utils.errorcode;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mk.common.constant.ErrCodeContant;
import com.mk.common.entity.ErrorCode;

/**
 * @Author liumingkang
 * @Date 2019-09-06 20:51
 * @Destcription TODO 错误码工具类
 * @Version 1.0
 **/
public abstract class ErrorCodeUtil {
    
    /*
    *
     * @Author liumingkang
     * @Description //TODO 根据异常来翻译错误信息
     * @Date 20:55 2019-09-06
     * @Param [ex]
     * @return com.mk.common.entity.ErrorCode
     **/
    public abstract ErrorCode tanslateInfo(Exception ex);

    /*
    *
     * @Author liumingkang
     * @Description //TODO 根据code翻译错误码
     * @Date 20:56 2019-09-06
     * @Param [code]
     * @return com.mk.common.entity.ErrorCode
     **/
    public abstract ErrorCode tanslateInfo(String code);

    /*
    *
     * @Author liumingkang
     * @Description //TODO 核心执行翻译类 local为国际化 en 或者 zh-cn
     * @Date 20:58 2019-09-06
     * @Param [code, local]
     * @return com.mk.common.entity.ErrorCode
     **/
    public abstract ErrorCode tanslate(String code,String local);

    /*
    *
     * @Author liumingkang
     * @Description //TODO 将传入的错误码转换为json
     * @Date 20:53 2019-09-06
     * @Param [errorCode]
     * @return java.lang.String
     **/
    public static JSONObject toErrorCodeJson(ErrorCode errorCode)
    {
        if (null == errorCode)
        {
            return new JSONObject();
        }
        return (JSONObject) JSONObject.toJSON(errorCode);

    }


}
