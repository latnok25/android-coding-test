package com.linguo.admin.codingchallange;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class SemiBoldTextView extends android.support.v7.widget.AppCompatTextView{
    public SemiBoldTextView(Context context) {
        super(context);
        applyTypeface(context,"retsemibold.ttf");

    }

    private void applyTypeface(Context context, String d) {
        Typeface tr = Typeface.createFromAsset(context.getAssets(),d);
        setTypeface(tr);
    }

    public SemiBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyTypeface(context,"retsemibold.ttf");
    }

    public SemiBoldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyTypeface(context,"retsemibold.ttf");
    }
}
