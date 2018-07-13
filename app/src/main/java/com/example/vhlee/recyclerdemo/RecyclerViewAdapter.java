package com.example.vhlee.recyclerdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private ArrayList<Movie> mListMovieId;

    public RecyclerViewAdapter(ArrayList<Movie> mListMovieId) {
        this.mListMovieId = mListMovieId;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int position) {
        Movie movie = mListMovieId.get(position);
        TextView title = recyclerViewHolder.mTextView;
        ImageView image = recyclerViewHolder.mImage;

        title.setText(movie.getmTitle());
        image.setImageResource(movie.getmImage());
    }

    @Override
    public int getItemCount() {
        return mListMovieId.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTextView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView)itemView.findViewById(R.id.text_title);
            mImage = (ImageView)itemView.findViewById(R.id.image_item);
        }
    }
}
