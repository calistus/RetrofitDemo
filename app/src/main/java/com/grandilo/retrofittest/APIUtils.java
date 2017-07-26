package com.grandilo.retrofittest;

import com.grandilo.retrofittest.data.model.remote.RetrofitClient;
import com.grandilo.retrofittest.data.model.remote.SOService;

/**
 * Created by calistus on 25/07/2017.
 */

public class APIUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";


    public static SOService getSOService(){
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
