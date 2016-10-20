package com.framwork.demo.giftedframwork.mvp.entity.base;

/**
 * Created by cty on 16/10/19.
 */
public class BaseEntity {
    public int status;
    public String msg;

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
