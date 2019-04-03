package com.linguo.admin.codingchallange;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class NormalTextView extends android.support.v7.widget.AppCompatTextView {
    public NormalTextView(Context context) {
        super(context);
        applyTypeface(context,"retnorm.ttf");
    }

    private void applyTypeface(Context context, String d) {
        Typeface tr = Typeface.createFromAsset(getContext().getAssets(),d);
        setTypeface(tr);
    }

    public NormalTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyTypeface(context,"retnorm.ttf");
    }

    public NormalTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyTypeface(context,"retnorm.ttf");
    }


}
