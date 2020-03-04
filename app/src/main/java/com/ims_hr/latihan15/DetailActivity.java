package com.ims_hr.latihan15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView IV_Icon;
    TextView TV_Teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Inisial();
        Set_Object();
    }

    private void Inisial() {
        IV_Icon = findViewById(R.id.imageView_Detail_Icon);
        TV_Teks = findViewById(R.id.textView_Detail_Teks);
    }

    private void Set_Object() {
        Intent intent = getIntent();
        String Huruf = intent.getStringExtra("huruf");
        int Gambar = intent.getIntExtra("gambar",0);
        TV_Teks.setText("Anda memilih huruf: " + Huruf);
        IV_Icon.setImageResource(Gambar);
    }

}
