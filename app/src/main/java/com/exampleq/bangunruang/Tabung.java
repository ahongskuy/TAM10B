package com.exampleq.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tabung extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_jari, edt_tinggi;
    private Button btn_hitung;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        edt_jari = findViewById(R.id.edt_jari);
        edt_tinggi = findViewById(R.id.edt_tinggi);
        btn_hitung = findViewById(R.id.btn_hitung);
        hasil = findViewById(R.id.hasil);
        btn_hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_hitung){
            String jari = edt_jari.getText().toString().trim();
            String tinggi = edt_tinggi.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(jari)){
                isEmptyFields = true;
                edt_jari.setError("Harap diisi!");
            }
            if (TextUtils.isEmpty(tinggi)){
                isEmptyFields = true;
                edt_tinggi.setError("Harap diisi!");
            }
            if (!isEmptyFields) {
                double p = 3.14;
                double r = Double.parseDouble(jari);
                double t = Double.parseDouble(tinggi);
                double volume = p*r*r*t;
                hasil.setText(String.valueOf(volume));
            }
    }
}

}