package com.minkagency.roundedbutton;

/*
 * Created by louisparrouy on 27/07/2017.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

public class RoundedButton extends android.support.v7.widget.AppCompatButton {

    private Context context;
    private float cornerRadius = 4;
    private float strokeWidth = 1;
    private int strokeColor = Color.BLACK;
    private int backgroundColor = Color.GRAY;

    public RoundedButton(Context context) {
        super(context);
        this.context = context;
        init(context, null);
    }

    public RoundedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(context, attrs);
    }

    public RoundedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            initAttributes(context, attrs);
        }
        Drawable mNormalDrawable = createButton();
        setBackgroundCompat(mNormalDrawable);
    }

    private void initAttributes(Context context, AttributeSet attributeSet) {
        TypedArray attr = getTypedArray(context, attributeSet, R.styleable.RoundedButton);
        if (attr == null) {
            return;
        }

        try {

            cornerRadius = attr.getDimension(R.styleable.RoundedButton_rb_cornerRadius, cornerRadius);
            backgroundColor = attr.getColor(R.styleable.RoundedButton_rb_backgroundColor, backgroundColor);
            strokeWidth = attr.getDimension(R.styleable.RoundedButton_rb_strokeWidth, strokeWidth);
            strokeColor = attr.getColor(R.styleable.RoundedButton_rb_strokeColor, strokeColor);

        } finally {
            attr.recycle();
        }
    }

    protected TypedArray getTypedArray(Context context, AttributeSet attributeSet, int[] attr) {
        return context.obtainStyledAttributes(attributeSet, attr, 0, 0);
    }

    private Drawable createButton() {
        GradientDrawable drawable =
                (GradientDrawable) ContextCompat.getDrawable(context, R.drawable.button).mutate();
        drawable.setCornerRadius(cornerRadius);
        drawable.setColor(backgroundColor);
        drawable.setStroke((int) strokeWidth, strokeColor);

        return drawable;
    }

    public void setBackgroundCompat(Drawable drawable) {
        int pL = getPaddingLeft();
        int pT = getPaddingTop();
        int pR = getPaddingRight();
        int pB = getPaddingBottom();

        setBackgroundDrawable(drawable);
        setPadding(pL, pT, pR, pB);
    }
}
