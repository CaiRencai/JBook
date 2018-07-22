package com.jpg.jbook.ui.contrcact;

import com.jpg.jbook.base.BaseContract;
import com.jpg.jbook.bean.BookMixAToc;
import com.jpg.jbook.bean.Recommend;

import java.util.List;

/**
 * Author uidq1152
 * Date   2018-7-22 15:02
 */

public class RecommendBookContract implements BaseContract {

    public interface RecommendBookView extends BaseView{
        void showRecommendList(List<Recommend.RecommendBooks> list);

        void showBookToc(String bookId, List<BookMixAToc.mixToc.Chapters> list);
    }

    public interface RecommendBookPresenter<T extends RecommendBookView> extends BasePresenter<RecommendBookView>{
        void getRecommendList();
    }
}
