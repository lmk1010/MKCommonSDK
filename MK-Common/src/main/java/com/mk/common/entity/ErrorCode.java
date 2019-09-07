package com.mk.common.entity;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author liumingkang
 * @Date 2019-09-06 20:26
 * @Destcription TODO 错误码实体类
 * @Version 1.0
 **/
public class ErrorCode {

    // 错误码 0-8位
    private String code;
    // 错误信息
    private String errorMsg;
    // 解决方案
    private String solution;
    // 原因
    private String cause;
    // 嵌套错误信息
    private ErrorCode causedBy;


    public ErrorCode() {
    }

    public ErrorCode(String code) {
        this.code = code;
    }

    public ErrorCode(String code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public ErrorCode(String code, String errorMsg, String solution) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.solution = solution;
    }

    public ErrorCode(String code, String errorMsg, String solution, String cause) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.solution = solution;
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "code='" + code + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                ", solution='" + solution + '\'' +
                ", cause='" + cause + '\'' +
                ", causedBy=" + causedBy +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public ErrorCode getCausedBy() {
        return causedBy;
    }

    public void setCausedBy(ErrorCode causedBy) {
        this.causedBy = causedBy;
    }
}
