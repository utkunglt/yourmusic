package com.uk.khanhnt.yourmusic.utils;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.uk.khanhnt.yourmusic.R;

/**
 * Created by khanhnt on 4/5/2016.
 */
public class TrackViewHolder extends RecyclerView.ViewHolder {

    protected CardView mCv;
    protected TextView mTrackTitle;
    protected ImageView mTrackImg;

    public TrackViewHolder(View itemView) {
        super(itemView);
        mCv = (CardView) itemView.findViewById(R.id.cv);
        mTrackTitle = (TextView) itemView.findViewById(R.id.track_title);
        mTrackImg = (ImageView) itemView.findViewById(R.id.track_img);
    }
}
