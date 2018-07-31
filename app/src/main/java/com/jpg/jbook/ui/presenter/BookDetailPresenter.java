package com.jpg.jbook.ui.presenter;

import android.content.Context;

import com.jpg.jbook.api.BookApi;
import com.jpg.jbook.bean.Recommend;

import javax.inject.Inject;

/**
 * Author uidq1152
 * Date   2018-7-31 20:52
 */

public class BookDetailPresenter {

    private BookApi mBookApi;

    @Inject
    BookDetailPresenter(BookApi bookApi) {
        this.mBookApi = bookApi;
    }
}
