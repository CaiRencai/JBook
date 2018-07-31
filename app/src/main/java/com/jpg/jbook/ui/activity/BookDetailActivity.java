package com.jpg.jbook.ui.activity;

import com.jpg.jbook.base.BaseActivity;
import com.jpg.jbook.component.AppComponent;
import com.jpg.jbook.component.DaggerBookComponent;
import com.jpg.jbook.ui.presenter.BookDetailPresenter;

import javax.inject.Inject;

/**
 * Author uidq1152
 * Date   2018-7-31 20:49
 */

public class BookDetailActivity extends BaseActivity{


    @Inject
    BookDetailPresenter mPresenter;

    @Override
    protected void setupAppComponent(AppComponent appComponent) {
        DaggerBookComponent.builder()
                .appComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public int getLayoutId() {
        return 0;
    }
}
