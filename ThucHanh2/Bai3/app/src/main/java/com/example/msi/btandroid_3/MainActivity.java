package com.example.msi.btandroid_3;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get component
        final Button btnXemThoiGian=findViewById(R.id.btnXemThoiGian);
        final AlertDialog ad=new AlertDialog.Builder(MainActivity.this).create();

        btnXemThoiGian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date=new Date();
                String message="Thoi gian hien hanh "+date.toString();
                ad.setMessage(message);
                ad.show();
            }
        });
    }
}
