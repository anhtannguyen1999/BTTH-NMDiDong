package com.example.msi.btandroid_4;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtText=findViewById(R.id.edtText);
        final AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();
        edtText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if(keyEvent.getAction()==KeyEvent.ACTION_DOWN&&keyCode==KeyEvent.KEYCODE_DPAD_CENTER){
                    String message=edtText.getText().toString();
                    alertDialog.setMessage(message);
                    alertDialog.show();
                    return true;
                }

                return false;
            }
        });

    }
}
