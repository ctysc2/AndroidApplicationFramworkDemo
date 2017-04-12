package com.framwork.demo.giftedframwork.mvp.ui.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.framwork.demo.giftedframwork.R;
import com.framwork.demo.giftedframwork.annotation.BindValues;
import com.framwork.demo.giftedframwork.common.ApiConstants;
import com.framwork.demo.giftedframwork.dao.UserInfo;
import com.framwork.demo.giftedframwork.event.ToDoLoginEvent;
import com.framwork.demo.giftedframwork.mvp.presenter.impl.LoginPresenterImpl;
import com.framwork.demo.giftedframwork.mvp.ui.activitys.base.BaseActivity;
import com.framwork.demo.giftedframwork.mvp.view.LoginCompView;
import com.framwork.demo.giftedframwork.utils.LoginUtils;
import com.framwork.demo.giftedframwork.utils.MD5Util;
import com.framwork.demo.giftedframwork.utils.RxBus;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

import rx.functions.Action1;
@BindValues(mIsHasNavigationView = true)
public class MainActivity extends BaseActivity implements LoginCompView {

    @BindView(R.id.ed_phone)
    EditText mEdPhone;

    @BindView(R.id.ed_password)
    EditText mEdPassWord;

    @BindView(R.id.iv_header)
    SimpleDraweeView mHeader;

    @BindView(R.id.tv_userid)
    TextView mUserId;

    @BindView(R.id.tv_username)
    TextView mUserName;

    @BindView(R.id.bt_login)
    Button mLogin;

    @Inject
    LoginPresenterImpl mLoginPresenterImpl;

    @OnClick({R.id.bt_login,R.id.bt_history,R.id.bt_clear})
    public void onClick(View view) {
        switch (view.getId()) {
                
                
                //temp
            case R.id.bt_login:
                RxBus.getInstance().post(new ToDoLoginEvent());
                break;
            case R.id.bt_history:
                List<UserInfo> info = LoginUtils.getAllUserInfo(this);
                String toast = "";
                for(int i  = 0;i<info.size();i++){
                    toast += info.get(i).getNickname()+',';
                }
                Toast.makeText(this,toast.equals("")?"没有记录":toast,Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_clear:
                LoginUtils.clearAllUserInfo(this);

                break;

        }

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initInjector() {
        mActivityComponent.inject(this);
    }

    @Override
    public void initViews() {
        mPresenter = mLoginPresenterImpl;
        mPresenter.attachView(this);

        mSubscription = RxBus.getInstance().toObservable(ToDoLoginEvent.class)
                .subscribe(new Action1<ToDoLoginEvent>() {
                    @Override
                    public void call(ToDoLoginEvent toDoLogin) {
                        mLoginPresenterImpl.doLogin(
                                mEdPhone.getText().toString(),
                                MD5Util.compute(mEdPassWord.getText().toString()),
                                "个人"
                        );
                    }
                });

        Toast.makeText(this,mIsHasNavigationView?"带导航":"不带导航",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    @Override
    public void showLoginInfo(UserInfo info) {
        if(info!=null){

            mUserName.setText("用户昵称： "+info.getNickname());
            mHeader.setImageURI(ApiConstants.BASE_URL_PICTURE+info.getHeadurl());
            //登录记录
            LoginUtils.insertLoginInfo(this,info);

            Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
        }

        else{
            Toast.makeText(this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void showErrorMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
