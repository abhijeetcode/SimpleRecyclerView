package com.example.a1405001.stories;

/**
 * Created by 1405001 on 24-04-2018.
 */
import android.support.v7.widget.RecyclerView;

import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

    public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

        private List<Setter_getter_stroies> storyList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, year, genre;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title1);
                genre = (TextView) view.findViewById(R.id.genre);
                year = (TextView) view.findViewById(R.id.year);
            }
        }
        public StoryAdapter(List<Setter_getter_stroies> storyList)  {
            this.storyList = storyList;
        }
        //Inflate one item list
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_list_row, parent, false);
            return  new MyViewHolder(itemView);
        }
        //Set data to holder
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Setter_getter_stroies  sgs = storyList.get(position);
            holder.title.setText(sgs.getTitle());
            holder.genre.setText(sgs.getGenre());
            holder.year.setText(sgs.getYear());
        }
        @Override
        public int getItemCount() {
            return storyList.size();
        }
    }
