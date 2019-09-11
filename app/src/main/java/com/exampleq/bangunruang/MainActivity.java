package com.exampleq.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_tabung,btn_kerucut, btn_bola,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tabung = (Button)findViewById(R.id.btn_tabung);
        btn_kerucut = (Button)findViewById(R.id.btn_kerucut);
        btn_bola = (Button)findViewById(R.id.btn_bola);
        about = (Button)findViewById(R.id.about);
        btn_kerucut.setOnClickListener(this);
        btn_tabung.setOnClickListener(this);
        btn_bola.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch  (v.getId()){
            case R.id.btn_tabung:
                    Intent moveIntent = new Intent(MainActivity.this, Tabung.class);
                    startActivity(moveIntent);
                    break;
            case R.id.btn_kerucut:
                    Intent moveIntent1 = new Intent(MainActivity.this, Kerucut.class);
                    startActivity(moveIntent1);
                    break;
            case R.id.btn_bola:
                    Intent moveIntent2 = new Intent (MainActivity.this, Bola.class);
                    startActivity(moveIntent2);
                    break;
            case R.id.about:
                Intent moveIntent3 = new Intent (MainActivity.this, Aboutus.class);
                startActivity(moveIntent3);
                break;
        }
    }
}
