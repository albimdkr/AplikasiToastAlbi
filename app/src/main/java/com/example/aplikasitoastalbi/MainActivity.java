package com.example.aplikasitoastalbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int angka=0;
    TextView angkakounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkakounter=findViewById(R.id.txtCount);
    }

    public void btnToastClick(View view) {
        Toast.makeText(this, "Hallo, Ini Adalah Aplikasi Toast", Toast.LENGTH_SHORT).show();
    }

    public void btnCountClick(View view) {
        angka=angka+1;
        angkakounter.setText(Integer.toString(angka));
    }
}