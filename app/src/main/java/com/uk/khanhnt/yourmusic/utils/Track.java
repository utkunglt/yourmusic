package com.uk.khanhnt.yourmusic.utils;

import com.google.gson.annotations.SerializedName;

/**
 * Created by khanhnt on 4/5/2016.
 */
public class Track {

    @SerializedName("title")
    private String mTitle;

    @SerializedName("id")
    private int mID;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("artwork_url")
    private String mArtworkURL;

    public String getTitle() {
        return mTitle;
    }

    public int getID() {
        return mID;
    }

    public String getArtworkURL() {
        return mArtworkURL;
    }
    public String getmStreamURL() {
        return mStreamURL;
    }
}
