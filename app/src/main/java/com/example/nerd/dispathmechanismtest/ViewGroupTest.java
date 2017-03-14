package com.example.nerd.dispathmechanismtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by nerd on 2017/3/13.
 */

public class ViewGroupTest extends LinearLayout {
    public ViewGroupTest(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("DispathViewGroup","onInterceptTouchEvent() return true");
        return true;
    }
}
