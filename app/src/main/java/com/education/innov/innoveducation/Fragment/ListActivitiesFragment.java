package com.education.innov.innoveducation.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.innov.innoveducation.Adapter.HomeAdapter;
import com.education.innov.innoveducation.R;


public class ListActivitiesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    private String mParam1;
    private String mParam2;



    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager ;

    // TODO: Rename and change types and number of parameters
    public static ListActivitiesFragment newInstance(int param1, String param2) {
        ListActivitiesFragment fragment = new ListActivitiesFragment();

        return fragment;
    }



    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_activities, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.Activities_recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        //Adapter is created in the last step
        mAdapter = new HomeAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);
        return view ;

    }



}
