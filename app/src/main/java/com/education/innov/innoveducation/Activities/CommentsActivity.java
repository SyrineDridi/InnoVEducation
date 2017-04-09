package com.education.innov.innoveducation.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.education.innov.innoveducation.Adapter.CommentsAdapter;
import com.education.innov.innoveducation.Adapter.CoursesAdapter;
import com.education.innov.innoveducation.R;

public class CommentsActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private CommentsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        mRecyclerView = (RecyclerView) findViewById(R.id.Comments_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
       //Adapter is created in the last step
        mAdapter = new CommentsAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
