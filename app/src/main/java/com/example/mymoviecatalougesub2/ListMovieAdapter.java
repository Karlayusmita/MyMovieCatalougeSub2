package com.example.mymoviecatalougesub2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ViewHolder>{
    private ArrayList<Movie> movieArrayList;
    private Context context;

    public ListMovieAdapter(Context context) {
        this.context = context;
    }

    public ListMovieAdapter(ArrayList<Movie> movieArrayList) {
        this.movieArrayList = movieArrayList;
    }

    public Context getContext() {
        return context;
    }

    public ArrayList<Movie> getMovieArrayList() {
        return movieArrayList;
    }

    @NonNull
    @Override
    public ListMovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMovieAdapter.ViewHolder holder, final int position) {
        Movie movie = movieArrayList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(Integer.valueOf(movie.getPoster()))
                .apply(new RequestOptions().override(96,144))
                .into(holder.poster);
        holder.title.setText(movie.getTitle());
        holder.overview.setText(movie.getOverview());
        holder.release_date.setText(movie.getRelease_date());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),DetailMovieActivity.class);
                intent.putExtra("MOVIE_DATA", getMovieArrayList().get(position));
                getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }

    public void setMovieArrayList(ArrayList<Movie> movieArrayList) {
        this.movieArrayList = movieArrayList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView poster;
        TextView title;
        TextView overview;
        TextView release_date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.item_poster);
            title = itemView.findViewById(R.id.item_title);
            overview = itemView.findViewById(R.id.item_overview);
            release_date = itemView.findViewById(R.id.item_release_date);
        }
    }
}
