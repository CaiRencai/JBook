package com.jpg.jbook.ui.presenter;

import android.content.Context;

import com.jpg.jbook.api.BookApi;
import com.jpg.jbook.base.RxBasePresenter;
import com.jpg.jbook.bean.Recommend;
import com.jpg.jbook.ui.contrcact.RecommendBookContract;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;

/**
 * Author uidq1152
 * Date   2018-7-22 15:18
 */

public class RecommendPresenter extends RxBasePresenter<RecommendBookContract.RecommendBookView>
        implements RecommendBookContract.RecommendBookPresenter<RecommendBookContract.RecommendBookView>{

    private Context mContext;

    private BookApi mApi;

    @Inject
    public RecommendPresenter(Context context, BookApi api) {
        this.mContext = context;
        this.mApi = api;
    }

    @Override
    public void getRecommendList() {
        Observable<Recommend> compose = mApi.getRecommend("").compose(new Observable.Transformer<Recommend, Recommend>() {

            @Override
            public Observable<Recommend> call(Observable<Recommend> recommendObservable) {
                return null;
            }
        });
        Subscription subscribe = compose.subscribe(new Action1<Recommend>() {
            @Override
            public void call(Recommend recommend) {

            }
        });
    }


}
