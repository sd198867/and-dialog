package com.example.saeed.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ShowDialog = (Button) findViewById(R.id.btn_ShowDialog);
        btn_ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydialog m = new mydialog();
                m.show(getFragmentManager(), "test");
            }
        });

    }

}