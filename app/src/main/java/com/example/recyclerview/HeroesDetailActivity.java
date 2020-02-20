package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class HeroesDetailActivity extends AppCompatActivity {
private ImageView ivHero;
private TextView tvName,tvDetail;

Heroes heroes = new Heroes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_detail);
        ivHero = findViewById(R.id.itemhero_iv_foto);
        tvName = findViewById(R.id.itemhero_tv_nama);
        tvDetail = findViewById(R.id.itemhero_tv_deskripsi);

        heroes = getIntent().getParcelableExtra("heroes");

        tvName.setText(heroes.getHeroName());
        tvDetail.setText(heroes.getHeroDetail());
        Glide.with(getApplicationContext()).load(heroes.getHeroImage()).into(ivHero);
    }
}
