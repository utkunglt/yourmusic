package com.uk.khanhnt.yourmusic.utils;

import retrofit.RestAdapter;

/**
 * Created by khanhnt on 4/5/2016.
 * Singleton pattern: The RestAdapter and SCService will be create only once.
 */
public class SoundCloud {


    // Create RestAdapters that use the Interfaces to perform a server request.
    private  static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private  static final  SCService scService = REST_ADAPTER.create(SCService.class);

    /**
     * The method will be return a scService
     * @return scService
     */
    public static SCService getScService() {
        return scService;
    }
}
