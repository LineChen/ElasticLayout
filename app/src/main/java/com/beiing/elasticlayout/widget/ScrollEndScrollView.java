package com.beiing.elasticlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
/**
 * Created by chenliu on 2016/9/30.<br/>
 * 描述：可以返回scrollview滑动到顶部和底部状态
 * </br>
 */
public class ScrollEndScrollView extends ScrollView {


    private OnScrollEndListener mOnScrollBottomListener;

    public ScrollEndScrollView(Context context) {
        super(context);
    }

    public ScrollEndScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollEndScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if(t == 0){
            if (null != mOnScrollBottomListener) {
                mOnScrollBottomListener.scrollToTop(this);
            }
        } else if(t + getMeasuredHeight() >=  getChildAt(0).getMeasuredHeight()){
            if (null != mOnScrollBottomListener) {
                mOnScrollBottomListener.scrollToBottom(this);
            }
        } else {
            if (null != mOnScrollBottomListener) {
                mOnScrollBottomListener.scrollToMiddle(this);
            }
        }
    }

    public void addOnScrollEndListener(OnScrollEndListener mOnScrollBottomListener) {
        this.mOnScrollBottomListener = mOnScrollBottomListener;
    }

    public interface OnScrollEndListener {
        void scrollToBottom(View view);
        void scrollToTop(View view);
        void scrollToMiddle(View view);
    }
}
