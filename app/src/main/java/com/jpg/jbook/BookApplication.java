package com.jpg.jbook;

import android.app.Application;

import com.jpg.jbook.api.BookApi;
import com.jpg.jbook.component.AppComponent;
import com.jpg.jbook.component.DaggerAppComponent;
import com.jpg.jbook.moudle.AppModule;
import com.jpg.jbook.moudle.BookApiModule;

/**
 * Author uidq1152
 * Date   2018-7-22 19:35
 */

public class BookApplication extends Application{

    private static BookApplication INSTANCE = null;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        initAppComponent();
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .bookApiModule(new BookApiModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static BookApplication getInstance() {
        return INSTANCE;
    }
}
