package com.jpg.jbook.component;

import android.content.Context;

import com.jpg.jbook.api.BookApi;
import com.jpg.jbook.moudle.AppModule;
import com.jpg.jbook.moudle.BookApiModule;

import dagger.Component;

/**
 * Author uidq1152
 * Date   2018-7-22 19:50
 */
@Component(modules =  {BookApiModule.class, AppModule.class})
public interface AppComponent {

    Context getContext();

    BookApi getBookApi();

}
