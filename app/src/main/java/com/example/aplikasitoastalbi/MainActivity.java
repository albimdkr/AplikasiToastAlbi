package com.example.aplikasitoastalbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnToastClick(View view) {
        Toast.makeText(this, "Ini aplikasi Toast", Toast.LENGTH_SHORT).show();
    }


    public void btnCountClick(View view) {
    }
}