package com.example.mymoviecatalougesub2;


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
public class TVFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<TV> arrayListTV = new ArrayList<>();


    public TVFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv,container,false);
        recyclerView = view.findViewById(R.id.recycler_view_tv);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        arrayListTV.addAll(TVData.getListDataTV());
        showRecyclerList();
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListTVAdapter listTVAdapter = new ListTVAdapter(getActivity());
        listTVAdapter.setTvArrayList(arrayListTV);
        recyclerView.setAdapter(listTVAdapter);
    }
}
