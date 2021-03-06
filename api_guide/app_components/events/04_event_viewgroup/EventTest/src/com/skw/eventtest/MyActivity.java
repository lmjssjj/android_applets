package com.skw.eventtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Activity, ViewGroup, View的触摸事件测试程序。
 *
 * 说明：MyGroupView即拦截了触摸事件，也消费了触摸事件。
 * 即，MyGroupView.onInterceptTouchEvent()返回true；
 *     MyGroupView.onTouchEvent()也返回true；
 *
 */
public class MyActivity extends Activity {
    private static final String TAG = "##skywang-MyActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
 
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        String actionName = Utils.getActionName(event);
        Log.d(TAG, "dispatchTouchEvent(start) :"+actionName);
        boolean ret = super.dispatchTouchEvent(event);
        Log.d(TAG, "dispatchTouchEvent( end ) :"+actionName+", ret="+ret);
        return ret;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String actionName = Utils.getActionName(event);
        Log.d(TAG, "onTouchEvent(start) :"+actionName);
        boolean ret = super.onTouchEvent(event);
        Log.d(TAG, "onTouchEvent( end ) :"+actionName+", ret="+ret);
        return ret;
    }
}
