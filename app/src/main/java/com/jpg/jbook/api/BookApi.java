package com.jpg.jbook.api;

import com.jpg.jbook.base.Constant;
import com.jpg.jbook.bean.Recommend;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Author uidq1152
 * Date   2018-7-22 15:40
 */

public class BookApi {

    private BookApi INSTANCE = null;
    private final BookService mService;

    private BookApi getInstance(OkHttpClient client) {
        if (INSTANCE == null) {
            INSTANCE = new BookApi(client);
        }
        return INSTANCE;
    }

    private BookApi(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
        mService = retrofit.create(BookService.class);

    }

    public Observable<Recommend> getRecommend(String gender){
        return mService.getRecommend(gender);
    }
}
