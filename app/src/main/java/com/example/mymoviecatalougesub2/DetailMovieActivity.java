package com.example.mymoviecatalougesub2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailMovieActivity extends AppCompatActivity {
    ImageView moviePoster;
    TextView movieTitle;
    TextView movieOverview;
    TextView movieReleaseDate;
    TextView movieDirectorName;
    TextView movieRuntime;
    Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        moviePoster = findViewById(R.id.detail_poster);
        movieTitle = findViewById(R.id.detail_title);
        movieOverview = findViewById(R.id.detail_overview);
        movieReleaseDate= findViewById(R.id.detail_releaseDate);
        movieRuntime = findViewById(R.id.detail_runtime);
        movieDirectorName = findViewById(R.id.detail_director_name);

        movie = getIntent().getParcelableExtra("MOVIE_DATA");

        Glide.with(this)
                .load(Integer.valueOf(movie.getPoster()))
                .apply(new RequestOptions().override(136,204))
                .into(moviePoster);
        movieTitle.setText(movie.getTitle());
        movieOverview.setText(movie.getOverview());
        movieReleaseDate.setText(movie.getRelease_date());
        movieRuntime.setText(movie.getRuntime());
        movieDirectorName.setText(movie.getDirector_name());
    }
}
