package com.example.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.githubtest.MVP.PresenterLogin;

public class MainActivity extends AppCompatActivity {

     EditText editTextName,editTextPassword;
     Button buttonXacnhan;
     PresenterLogin presenterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenterLogin = new PresenterLogin();
        editTextName = findViewById(R.id.edtname);
        editTextPassword = findViewById(R.id.edtpassword);
        buttonXacnhan = findViewById(R.id.btnxacnhan);

        buttonXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = editTextName.getText().toString();
                String password = editTextPassword.getText().toString();
                presenterLogin.receivedHanleLogin(email,password);

            }
        });
    }

    public void handleLogins(String email,String password) {
            if ("tuongnhps07603@gmail.com".equals(email)&& "123456".equals(password)){
                    loginSuccess();
            }else {
                    loginFail();
            }


    }
    private void loginSuccess() {
        Intent intent = new Intent(MainActivity.this, HomActivity.class);
        startActivity(intent);
    }
    private void loginFail() {
        Toast.makeText(this, "Dang nhap that bai", Toast.LENGTH_SHORT).show();
    }

    //// Model : la noi su ly logic, hoac xu ly nghirp vu cho chuc nang hay app
    //// View : la noi hien thi thong tin nguoi dung nhin thay (Activity, Fragment, View...)
    //// Presenter: la noi trung gian giao tiep giua view va model ok
    ////  Khi người dùng click vào login View báo cho Presenter người dùng yêu cầu login, Presenter nhận được
    ////  thông báo như vậy thì nó chuyển xuống cho tầng model là xử lý login, xử lý xong trả lại kết quả cho Presenter
    ///    sau đó trả lại cho View
}
