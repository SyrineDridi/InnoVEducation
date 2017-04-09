package com.education.innov.innoveducation.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.innov.innoveducation.Activities.CommentsActivity;
import com.education.innov.innoveducation.R;
import com.education.innov.innoveducation.Views.CourseViewHolder;
import com.education.innov.innoveducation.Views.HomeWorkViewHolder;

/**
 * Created by Syrine on 05/04/2017.
 */
public class HomeWorkAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


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

    public HomeWorkAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View HomeWorkRow = inflater.inflate(R.layout.row_item_homework, parent, false);
        return new HomeWorkViewHolder(HomeWorkRow); // view holder for normal items

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

      //  final int itemType = getItemViewType(position);


        HomeWorkViewHolder mHolder = (HomeWorkViewHolder) holder;
        mHolder.TvComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CommentsActivity.class) ;
                String idHomeWork = "1";
                intent.putExtra("idhommeWork", idHomeWork);
                context.startActivity(intent);

            }
        });
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
