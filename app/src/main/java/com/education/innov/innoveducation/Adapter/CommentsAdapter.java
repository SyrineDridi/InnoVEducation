package com.education.innov.innoveducation.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.innov.innoveducation.R;
import com.education.innov.innoveducation.Views.CommentsViewHolder;
import com.education.innov.innoveducation.Views.CourseViewHolder;

/**
 * Created by Syrine on 07/04/2017.
 */

public class CommentsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private String[] title = {
            "Video",
            "Image",
            "Video",
            "Video",
            "Image",
            "Texte"
    };
    private LayoutInflater inflater;
    private Context context;

    public CommentsAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View CommentRow = inflater.inflate(R.layout.row_item_comment, parent, false);
        return new CommentsViewHolder(CommentRow); // view holder for normal items

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final int itemType = getItemViewType(position);


        CommentsViewHolder mHolder = (CommentsViewHolder) holder;
        //    MainOption mo = mainOptionlist.get(position);
        //    mHolder.tv_title.setText(mo.title);
        //    mHolder.iv_icon.setImageResource(mo.icon);
        //   mHolder.itemView.setSelected(selectedPos == position);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
