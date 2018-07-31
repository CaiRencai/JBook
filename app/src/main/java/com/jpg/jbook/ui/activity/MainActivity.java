package com.jpg.jbook.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jpg.jbook.R;
import com.jpg.jbook.base.BaseActivity;
import com.jpg.jbook.bean.BookMixAToc;
import com.jpg.jbook.bean.Recommend;
import com.jpg.jbook.component.AppComponent;
import com.jpg.jbook.ui.contrcact.RecommendBookContract;
import com.jpg.jbook.ui.presenter.RecommendPresenter;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements RecommendBookContract.RecommendBookView{

    @Inject
    RecommendPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.getRecommendList();
    }

    @Override
    protected void setupAppComponent(AppComponent appComponent) {
//        DaggerBookComponent.builder()
//                .appComponent(appComponent)
//                .build()
//                .inject(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFail() {

    }

    @Override
    public void showRecommendList(List<Recommend.RecommendBooks> list) {

    }

    @Override
    public void showBookToc(String bookId, List<BookMixAToc.mixToc.Chapters> list) {

    }
}
