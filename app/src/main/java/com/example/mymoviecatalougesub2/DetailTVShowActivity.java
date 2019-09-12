package com.example.mymoviecatalougesub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailTVShowActivity extends AppCompatActivity {
    ImageView tvPoster;
    TextView tvTitle;
    TextView tvOverview;
    TextView tvNetwork;
    TextView tvRuntime;
    TextView tvGenre;
    TV tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tvshow);

        tvPoster = findViewById(R.id.detail_poster);
        tvTitle = findViewById(R.id.detail_title);
        tvOverview = findViewById(R.id.detail_overview);
        tvNetwork = findViewById(R.id.detail_network);
        tvRuntime = findViewById(R.id.detail_runtime);
        tvGenre = findViewById(R.id.detail_genre);

        tv = getIntent().getParcelableExtra("TV_SHOW_DATA");

        Glide.with(this)
                .load(Integer.valueOf(tv.getPoster()))
                .apply(new RequestOptions().override(136,204))
                .into(tvPoster);
        tvTitle.setText(tv.getTitle());
        tvOverview.setText(tv.getOverview());
        tvNetwork.setText(tv.getNetwork());
        tvRuntime.setText(tv.getRuntime());
        tvGenre.setText(tv.getGenre());
    }
}
