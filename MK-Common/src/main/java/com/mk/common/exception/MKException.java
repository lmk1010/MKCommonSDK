package com.mk.common.exception;

import com.mk.common.constant.ErrCodeContant;
import com.mk.common.entity.ErrorCode;
import com.mk.common.utils.errorcode.ErrorCodeUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author liumingkang
 * @Date 2019-09-06 20:24
 * @Destcription TODO 通用异常报错类
 * @Version 1.0
 **/
public class MKException extends Exception{


    private String code;

    private String errorMsg;

    private String cause;

    private Exception ex;

    public MKException()
    {

    }

    public MKException(String code, Exception ex) {
        this.code = code;
        this.ex = ex;
    }

    public MKException(String code) {
        this.code = code;
    }

    public MKException(String code, String errorMsg)
    {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public MKException(String code,String errorMsg,String cause)
    {
        this.code = code;
        this.errorMsg = errorMsg;
        this.cause = cause;
    }

    public MKException(Exception ex) {
        this.ex = ex;
    }

    public MKException convertMKException(Exception ex)
    {
        if (ex instanceof  MKException)
        {
            return (MKException) ex;
        }
        return new MKException(ex);
    }


    @Override
    public String toString() {
        ErrorCode errorCode;

        if (StringUtils.isNotEmpty(code))
        {
            errorCode = new ErrorCode(code);
        }
        else if (StringUtils.isNotEmpty(errorMsg))
        {
            errorCode = new ErrorCode(code,errorMsg);
        }
        else if (StringUtils.isNotEmpty(cause))
        {
            errorCode = new ErrorCode(code,errorMsg,cause);
        }
        else
        {
            //返回错误码之前先实例化 未传入错误吗 默认是通用错误码
            errorCode = new ErrorCode(ErrCodeContant.COMMON_ERROR);
        }
        // todo 未来要经过翻译器 从DB或者XML里面去load错误码的其他属性
        // todo errorCode = ErrorCodeUtil.tanslateInfo(this.code);

        String errorCodeInfo = ErrorCodeUtil.toErrorCodeJson(errorCode).toJSONString();

        return "MKException{" +
                "errorCodeInfo=" + errorCodeInfo +", " +
                "exception=" + ex +
                '}';
    }
}
