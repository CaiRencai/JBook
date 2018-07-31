package com.jpg.jbook.component;

import com.jpg.jbook.ui.activity.BookDetailActivity;
import com.jpg.jbook.ui.activity.MainActivity;

import javax.inject.Inject;

import dagger.Component;

/**
 * Author uidq1152
 * Date   2018-7-31 19:23
 */
@Component(dependencies = {AppComponent.class})
public interface BookComponent {

    BookDetailActivity inject(BookDetailActivity activity);

}
