package com.jpg.jbook.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.view.View;
import android.view.ViewGroup;

import com.jpg.jbook.R;


/**
 * Author uidq1152
 * Date   2018-7-23 19:21
 */

public class StatusBarUtil {


    public static View compat(Activity activity, @ColorInt int colorInt) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setStatusBarColor(colorInt);
            return null;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
                && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
                ViewGroup contentView = activity.findViewById(android.R.id.content);
                View statusBarView = contentView.getChildAt(0);
                if (statusBarView != null && statusBarView.getMeasuredHeight() == getStatusBarHeight(activity)) {
                    statusBarView.setBackgroundColor(colorInt);
                    return statusBarView;
                }
        }

        View statusBarView = new View(activity);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                getStatusBarHeight(activity));
        ViewGroup contentView = activity.findViewById(android.R.id.content);
        statusBarView.setBackgroundColor(colorInt);
        contentView.addView(statusBarView, lp);
        return statusBarView;

    }


    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

}


