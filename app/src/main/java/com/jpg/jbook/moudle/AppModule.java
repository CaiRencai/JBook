package com.jpg.jbook.moudle;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Author uidq1152
 * Date   2018-7-22 19:40
 */
@Module
public class AppModule {

    private Context mContext;

    public AppModule(Context context) {
        this.mContext = context;
    }

    @Provides
    public Context provideContext(){
        return mContext;
    }

}
