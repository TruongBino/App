package com.ctk43.doancoso.Dangnhap;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ctk43.doancoso.R;
import com.ctk43.doancoso.View.Activity.JobActivity;
import com.ctk43.doancoso.View.Activity.MainActivity;

public class DangnhapActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);

        editTextUsername = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Kiểm tra thông tin đăng nhập
                if (username.equals("Truong@gmail.com") && password.equals("123")) {
                    // Đăng nhập thành công, chuyển đến màn hình chính
                    Intent intent = new Intent(DangnhapActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Đóng màn hình đăng nhập
                } else {
                    // Đăng nhập thất bại, hiển thị thông báo lỗi
                    Toast.makeText(DangnhapActivity.this, "Sai tên đăng nhập hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


