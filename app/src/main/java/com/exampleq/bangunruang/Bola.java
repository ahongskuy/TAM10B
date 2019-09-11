package com.exampleq.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bola extends AppCompatActivity implements OnClickListener {
    private EditText edt_jari;
    private Button btn_hitung;
    private TextView hasil3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        edt_jari = findViewById(R.id.edt_jari);
        btn_hitung = findViewById(R.id.btn_hitung);
        hasil3 = findViewById(R.id.hasil3);
        btn_hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung){
            String jari = edt_jari.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(jari)){
                isEmptyFields = true;
                edt_jari.setError("Harap diisi!");
            }
            if (!isEmptyFields) {
                double p = 3.14;
                double r = Double.parseDouble(jari);
                double volume = 1.33*p*r*r*r;
                hasil3.setText(String.valueOf(volume));
            }
        }
    }

}