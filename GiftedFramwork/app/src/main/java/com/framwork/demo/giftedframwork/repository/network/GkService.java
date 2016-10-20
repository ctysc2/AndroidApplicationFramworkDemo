package com.framwork.demo.giftedframwork.repository.network;

import com.framwork.demo.giftedframwork.mvp.entity.LoginEntity;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by cty on 16/10/19.
 */
public interface GkService {
    //登录接口
    @FormUrlEncoded
    @POST("login")
    Observable<LoginEntity> login(
            @Field("phone") String phone,
            @Field("password") String password,
            @Field("loginType") String loginType);
}
