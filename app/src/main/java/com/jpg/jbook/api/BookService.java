package com.jpg.jbook.api;

import com.jpg.jbook.bean.Recommend;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Author uidq1152
 * Date   2018-7-22 15:42
 */

public interface BookService {

    @GET("/book/recommend")
     Observable<Recommend> getRecommend(@Query("gender") String gender);

}
