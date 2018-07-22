package com.jpg.jbook.base;

/**
 * Author uidq1152
 * Date   2018-7-22 14:27
 */

public interface BaseContract {

     interface BaseView{

         void onSuccess();

         void onFail();

    }

    interface BasePresenter <T extends BaseView>{

        void attachView(T view);

        void detachView();

    }

}
