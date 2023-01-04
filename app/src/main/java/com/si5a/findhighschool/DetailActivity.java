package com.si5a.findhighschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvTentang;
    private String yNama, yTentang, yFoto;
    private Button btnLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivFoto      = findViewById(R.id.iv_foto);
        tvNama      = findViewById(R.id.tv_nama);
        tvTentang   = findViewById(R.id.tv_tentang);
        btnLokasi   = findViewById(R.id.btn_lokasi);

        Intent terima = getIntent();
        yNama    = terima.getStringExtra("xNama");
        yTentang = terima.getStringExtra("xTentang");
        yFoto    = terima.getStringExtra("xFoto");


        tvNama.setText(yNama);
        tvTentang.setText(yTentang);
        Glide
                .with(DetailActivity.this)
                .load(yFoto)
                .into(ivFoto);
    }
}