package com.education.innov.innoveducation.Adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.education.innov.innoveducation.R;
import com.education.innov.innoveducation.Views.ImagePostViewHolder;
import com.education.innov.innoveducation.Views.TextPostViewHolder;
import com.education.innov.innoveducation.Views.VideoPostViewHolder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


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

    public static final int ITEM_TYPE_NORMAL = 0;
    public static final int ITEM_TYPE_HEADER = 1;
    public static final int ITEM_TYPE_Text = 2;
    public HomeAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        this.context=context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == ITEM_TYPE_NORMAL) {
            View ImageRow =   inflater.inflate(R.layout.row_item_image, parent, false);
            return new ImagePostViewHolder(ImageRow); // view holder for normal items
        } else if (viewType == ITEM_TYPE_HEADER) {
            View VideoRow =  inflater.inflate(R.layout.row_item_video, parent, false);
            return new VideoPostViewHolder(VideoRow); // view holder for header items
        }
    else if (viewType == ITEM_TYPE_Text) {
        View TexteRow =  inflater.inflate(R.layout.row_item_text, parent, false);
        return new TextPostViewHolder(TexteRow); // view holder for header items
    }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final int itemType = getItemViewType(position);

        if (itemType == ITEM_TYPE_NORMAL) {
            ImagePostViewHolder mHolder = (ImagePostViewHolder) holder;
        //    MainOption mo = mainOptionlist.get(position);
        //    mHolder.tv_title.setText(mo.title);
        //    mHolder.iv_icon.setImageResource(mo.icon);
         //   mHolder.itemView.setSelected(selectedPos == position);
        } else if (itemType == ITEM_TYPE_HEADER) {
            VideoPostViewHolder mHolder = (VideoPostViewHolder) holder;

        }
        else if (itemType == ITEM_TYPE_Text) {
            TextPostViewHolder mHolder = (TextPostViewHolder) holder;

        }
    }

    @Override
    public int getItemViewType(int position) {
        System.out.println("syriiiiine"+(title[position].toString().equals("image")));
        if (title[position].toString().equals("Image")) {
            return ITEM_TYPE_NORMAL;
        } else if (title[position].toString().equals("Video")) {
        return ITEM_TYPE_HEADER;
    }
    else if (title[position].toString().equals("Texte")) {
        return ITEM_TYPE_Text;
    }
        return 0;
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}