package com.uk.khanhnt.yourmusic.utils;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.uk.khanhnt.yourmusic.R;

import java.util.List;

/**
 * Created by khanhnt on 4/5/2016.
 */
public class SCTrackAdapter extends RecyclerView.Adapter<TrackViewHolder> {

    private static  final String TAG = "SCTrackAdapter";
    private Context mContext;
    // The track list is got from server.
    private List<Track> mTracks;

    // The default constructor of SCTrackAdapter.
    public SCTrackAdapter(Context context, List<Track> tracks) {
        mContext = context;
        mTracks = tracks;
    }

    @Override
    public TrackViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // Inflate the layout, initialize the View Holder
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.track_list_row, viewGroup, false);
        TrackViewHolder trackViewHolder = new TrackViewHolder(view);
        return trackViewHolder;
    }

    @Override
    public void onBindViewHolder(TrackViewHolder trackViewHolder, int i) {
        // Use the provided View Holder on the onCreateViewHolder method
        // to populate the current row on the RecyclerView
        trackViewHolder.mTrackTitle.setText(mTracks.get(i).getTitle());
        Picasso.with(mContext).load(mTracks.get(i).getArtworkURL()).into(trackViewHolder.mTrackImg);
        if (mTracks.get(i).getArtworkURL() != null) {
            Log.d(TAG,"onBindViewHolder getArtworkURL: " + mTracks.get(i).getArtworkURL().toString());
        }
    }

    @Override
    public int getItemCount() {
        return mTracks.size();
    }
}
