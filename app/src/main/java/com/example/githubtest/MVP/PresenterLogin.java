package com.example.githubtest.MVP;

import com.example.githubtest.ModelResponeToPresenterListener;

public class PresenterLogin implements ModelResponeToPresenterListener {
    ModelLogin modelLogin;
    public void receivedHanleLogin(String email, String password){
        modelLogin = new ModelLogin(this);
        modelLogin.handLogin(email, password);


    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFaile() {

    }
}