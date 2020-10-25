package com.example.githubtest.MVP;

import android.view.accessibility.AccessibilityNodeInfo;

import com.example.githubtest.ModelResponeToPresenterListener;

public class ModelLogin  {

    ModelResponeToPresenterListener callback;

    public ModelLogin (ModelResponeToPresenterListener callback){
        this.callback = callback;
    }

    public void handLogin(String email,String password){
        /////xu ly login o day

        if ("tuongnhps07603@gmail.com".equals(email)&& "123456".equals(password)){
            callback.onLoginSuccess();
        }else {
            callback.onLoginFaile();
        }
    }
}
