package com.education.innov.innoveducation.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.innov.innoveducation.R;
import com.education.innov.innoveducation.Views.FreindsOnlineViewHolder;
import com.education.innov.innoveducation.Views.HomeWorkViewHolder;

/**
 * Created by Syrine on 08/04/2017.
 */

public class OnLineFrreindsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


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

    public OnLineFrreindsAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View FreindRow = inflater.inflate(R.layout.row_item_freind_online, parent, false);
        return new FreindsOnlineViewHolder(FreindRow); // view holder for normal items

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final int itemType = getItemViewType(position);


        FreindsOnlineViewHolder mHolder = (FreindsOnlineViewHolder) holder;

        //    MainOption mo = mainOptionlist.get(position);
        //    mHolder.tv_title.setText(mo.title);
        //    mHolder.iv_icon.setImageResource(mo.icon);
        //    mHolder.itemView.setSelected(selectedPos == position);

    }

    @Override
    public int getItemCount() {
        return title.length - 1;
    }
}
