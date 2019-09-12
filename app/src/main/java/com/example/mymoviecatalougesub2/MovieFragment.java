package com.example.mymoviecatalougesub2;


import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Movie> arrayList = new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie,container,false);
        recyclerView = view.findViewById(R.id.recycler_view_movie);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        arrayList.addAll(MovieData.getListDataMovie());
        showRecyclerList();
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(getActivity());
        listMovieAdapter.setMovieArrayList(arrayList);
        recyclerView.setAdapter(listMovieAdapter);
    }
}
