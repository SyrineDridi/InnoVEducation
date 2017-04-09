package com.education.innov.innoveducation.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.innov.innoveducation.Adapter.CoursesAdapter;
import com.education.innov.innoveducation.Adapter.HomeWorkAdapter;
import com.education.innov.innoveducation.R;


public class HomeworksFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private HomeWorkAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager ;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public HomeworksFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static HomeworksFragment newInstance(int page, String title) {
        HomeworksFragment fragment = new HomeworksFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homeworks, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.HomeWorks_recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
//Adapter is created in the last step
        mAdapter = new HomeWorkAdapter(getActivity());
        mRecyclerView.setAdapter(mAdapter);
        return view ;
    }

    // TODO: Rename method, update argument and hook method into UI event

}
