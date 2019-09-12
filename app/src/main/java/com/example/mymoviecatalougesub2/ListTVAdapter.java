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

public class ListTVAdapter extends RecyclerView.Adapter<ListTVAdapter.ViewHolder> {
    private ArrayList<TV> tvArrayList;
    private Context context;

    public ListTVAdapter(Context context) {
        this.context = context;
    }

    public ListTVAdapter(ArrayList<TV> tvArrayList) {
        this.tvArrayList = tvArrayList;
    }

    public ArrayList<TV> getTvArrayList() {
        return tvArrayList;
    }

    public Context getContext() {
        return context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        return new ListTVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        TV tv = tvArrayList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(Integer.valueOf(tv.getPoster()))
                .apply(new RequestOptions().override(96,144))
                .into(holder.poster);
        holder.title.setText(tv.getTitle());
        holder.overview.setText(tv.getOverview());
        holder.network.setText(tv.getNetwork());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DetailTVShowActivity.class);
                intent.putExtra("TV_SHOW_DATA",getTvArrayList().get(position));
                getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tvArrayList.size();
    }

    public void setTvArrayList(ArrayList<TV> tvArrayList) {
        this.tvArrayList = tvArrayList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView title;
        TextView overview;
        TextView network;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.item_poster);
            title = itemView.findViewById(R.id.item_title);
            overview = itemView.findViewById(R.id.item_overview);
            network = itemView.findViewById(R.id.item_release_date);
        }
    }
}
