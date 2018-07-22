package com.jpg.jbook.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Author uidq1152
 * Date   2018-7-22 14:35
 */

public class RxBasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T>{

    protected T mView;
    protected CompositeSubscription mSubscriptions;


    protected void addSubscribe(Subscription subscription) {
        if (mSubscriptions == null) {
            mSubscriptions = new CompositeSubscription();
        }
        mSubscriptions.add(subscription);
    }

    private void unSubscribe(){
        if (mSubscriptions != null) {
            mSubscriptions.unsubscribe();
        }
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }


    @Override
    public void detachView() {
        mView = null;
        unSubscribe();
    }
}
