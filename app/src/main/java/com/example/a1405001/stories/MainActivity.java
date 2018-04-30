package com.example.a1405001.stories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    List<Setter_getter_stroies> story_Arraylist = new ArrayList<>();
    RecyclerView recyclerView;
    StoryAdapter storyAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        storyAdapter = new StoryAdapter(story_Arraylist);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager slayout =  new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(slayout);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(storyAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {

        for(int i=0;i<5;i++) {
            Setter_getter_stroies movie = new Setter_getter_stroies("Mad Max: Fury Road", "Action & Adventure", "2015");
            story_Arraylist.add(movie);
        }

        /*movie = new Setter_getter_stroies("Inside Out", "Animation, Kids & Family", "2015");
        story_Arraylist.add(movie);

        movie = new Setter_getter_stroies("Shaun the Sheep", "Animation", "2015");
        story_Arraylist.add(movie);

        movie = new Setter_getter_stroies("Inside Out", "Animation, Kids & Family", "2015");
        story_Arraylist.add(movie);*/

        storyAdapter.notifyDataSetChanged();

    }
}
