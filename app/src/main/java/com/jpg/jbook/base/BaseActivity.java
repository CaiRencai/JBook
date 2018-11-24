package com.jpg.jbook.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jpg.jbook.BookApplication;
import com.jpg.jbook.R;
import com.jpg.jbook.component.AppComponent;

import butterknife.ButterKnife;

/**
 * Author uidq1152
 * Date   2018-7-23 19:03
 */

public abstract class BaseActivity extends AppCompatActivity{

    private Context mContext = this;

    private int mStatusBarColor = -1;

    private View mStatusBarView = null;

    private Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        ButterKnife.bind(this);
        setupAppComponent(BookApplication.getInstance().getAppComponent());

        mToolbar = ButterKnife.findById(this, R.id.common_toolbar);
        if (mToolbar != null) {
            initToolBar();
            setSupportActionBar(mToolbar);
        }
        initData();
        configViews();
        //分支修改
    }

    protected abstract void configViews();

    protected abstract void initData();

    protected abstract void initToolBar();

    protected abstract void setupAppComponent(AppComponent appComponent);

    public abstract int getLayoutId();

    public void showToolbar(@ColorInt int statusBarColor) {

    }

    public void hideToolbar() {

    }


}
