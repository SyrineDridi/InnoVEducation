package com.education.innov.innoveducation.Views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.education.innov.innoveducation.R;

/**
 * Created by Syrine on 05/04/2017.
 */
public class HomeWorkViewHolder extends RecyclerView.ViewHolder {

    public TextView TvComment ;


    public HomeWorkViewHolder(View view) {
        super(view);
        TvComment = (TextView)  view.findViewById(R.id.tvComment) ;


    }

}