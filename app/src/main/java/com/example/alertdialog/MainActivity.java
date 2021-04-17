package com.example.alertdialog;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnAlerDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAlerDialog = findViewById(R.id.buttonAlertDialog);

        mBtnAlerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Bạn Có Thông Báo Mới !");
                builder.setMessage("Có phiên bản Update mới !!");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.show();
            }
        });
    }
}