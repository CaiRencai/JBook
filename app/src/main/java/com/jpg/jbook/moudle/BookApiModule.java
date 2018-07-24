package com.jpg.jbook.moudle;

import com.jpg.jbook.api.BookApi;
import com.jpg.jbook.api.support.HeaderInterceptor;
import com.jpg.jbook.api.support.Logger;
import com.jpg.jbook.api.support.LoggingInterceptor;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Author uidq1152
 * Date   2018-7-22 19:47
 */
@Module
public class BookApiModule {

    @Provides
    public OkHttpClient provideOkHttpClient() {
        LoggingInterceptor logging = new LoggingInterceptor(new Logger());
        logging.setLevel(LoggingInterceptor.Level.BODY);

        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .retryOnConnectionFailure(true) // 失败重发
                .addInterceptor(new HeaderInterceptor())
                .addInterceptor(logging);
        return builder.build();
    }

    /**
     *
     * @param okHttpClient  因为框架的构造函数没有@Inject注解，所以上面那个Provide 就提供了注入。
     * @return
     */
    @Provides
    public BookApi provideBookApi(OkHttpClient okHttpClient){
        return BookApi.getInstance(okHttpClient);
    }

}
