package com.mk.common.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.common.entity.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

/**
 * @Author liumingkang
 * @Date 2019-09-07 12:38
 * @Destcription TODO 通用rest返回数据类
 * @Version 1.0
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServerResponse<T> {
    private T data;
    private int statuscode;
    private String msg;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date responsetime;

    public ServerResponse(T data, int statuscode) {
        this.data = data;
        this.statuscode = statuscode;
        this.responsetime = new Date();
    }

    public ServerResponse(T data, int statuscode, Date responsetime) {
        this.data = data;
        this.statuscode = statuscode;
        this.responsetime = responsetime;
    }
    public ServerResponse(int statuscode, Date responsetime) {
        this.statuscode = statuscode;
        this.responsetime = responsetime;
    }

    public ServerResponse(int statuscode, String msg, Date responsetime) {
        this.statuscode = statuscode;
        this.msg = msg;
        this.responsetime = responsetime;
    }

    public boolean isSuccess(){
        if (this.getStatuscode()==200){
            return true;
        }else{
            return false;
        }
    }

    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),new Date());
    }

    public static <T> ServerResponse<T> createBySuccessMsg(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,new Date());
    }

    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(data,ResponseCode.SUCCESS.getCode(),new Date());
    }

    public static <T> ServerResponse<T> createBySuccess(T data,String msg){
        return new ServerResponse<T>(data,ResponseCode.SUCCESS.getCode(),msg,new Date());
    }

    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),new Date());
    }

    public static <T> ServerResponse<T> createByErrorMsg(String msg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),msg,new Date());
    }

    public static <T> ServerResponse<T> createByErrorCode(String msg,Integer Code){
        return new ServerResponse<T>(Code,msg,new Date());
    }

}
