package com.manroid.event.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.manroid.event.R;
import com.manroid.event.inerfaces.LoginListener;
import com.manroid.event.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, LoginListener{


    EditText edtUserName, edtPassword;
    Button btnLogin;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LoginPresenter();

        edtUserName = (EditText)findViewById(R.id.editText);
        edtPassword = (EditText)findViewById(R.id.editText2);
        btnLogin = (Button) findViewById(R.id.button);

        btnLogin.setOnClickListener(this);

    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        presenter.attachView(this);
    }

    @Override
    public void onClick(View view) {
        presenter.onLogin(edtUserName.getText().toString(),edtPassword.getText().toString());
    }

    @Override
    public void loginSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
