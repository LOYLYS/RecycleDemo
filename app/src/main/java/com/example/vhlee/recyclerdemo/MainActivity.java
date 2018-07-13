package com.example.vhlee.recyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerViewAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<Movie> mListMovie = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        showList();
    }
    public void init() {
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mListMovie.add(new Movie("One Piece",R.drawable.anh_three));
        mListMovie.add(new Movie("Conan",R.drawable.anh_two));
        mListMovie.add(new Movie("One Piece",R.drawable.anh_one));
        mListMovie.add(new Movie("Ekko",R.drawable.ekko));
        mAdapter = new RecyclerViewAdapter(mListMovie);
    }

    public void showList() {
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
