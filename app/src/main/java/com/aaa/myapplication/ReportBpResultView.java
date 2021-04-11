package com.aaa.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class ReportBpResultView extends View {

    private final int TEXT_SIZE = getPixel(R.dimen.bp_text_size);
    private final int RECT_LEFT = getPixel(R.dimen.margin_btm2);
    private final int RECT_RIGHT = getPixel(R.dimen.dark_red_rect_w2);
    private final int RECT_TOP = getPixel(R.dimen.margin_btm2);
    private final int RECT_BTM = getPixel(R.dimen.dark_red_rect_h2);
    private final int BLUE_RECT_W = getPixel(R.dimen.blue_rect_w2);
    private final int BLUE_RECT_H = getPixel(R.dimen.blue_rect_h2);
    private final int GREEN_RECT_W = getPixel(R.dimen.green_rect_w2);
    private final int GREEN_RECT_H = getPixel(R.dimen.green_rect_h2);
    private final int YELLOW_RECT_W = getPixel(R.dimen.yellow_rect_w2);
    private final int YELLOW_RECT_H = getPixel(R.dimen.yellow_rect_h2);
    private final int ORANGE_RECT_W = getPixel(R.dimen.orange_rect_w2);
    private final int ORANGE_RECT_H = getPixel(R.dimen.orange_rect_h2);
    private final int RED_RECT_W = getPixel(R.dimen.red_rect_w2);
    private final int RED_RECT_H = getPixel(R.dimen.red_rect_h2);
    private final int DARK_RED_RECT_W = getPixel(R.dimen.dark_red_rect_w2);
    private final int DARK_RED_RECT_H = getPixel(R.dimen.dark_red_rect_h2);
    private final int CANVAS_W = getPixel(R.dimen.dark_red_rect_w2);
    private final int CANVAS_H = getPixel(R.dimen.dark_red_rect_h2);
    private final int MARGIN = getPixel(R.dimen.margin_btm2);
    private final int MARGIN_BTM = getPixel(R.dimen.margin_btm2);
    private final int CIRCLE_RADIO = getPixel(R.dimen.circle_radio);
    Paint mBluePaint;
    Paint mGreenPaint;
    Paint mYellowPaint;
    Paint mOrangePaint;
    Paint mRedPaint;
    Paint mDarkRedPaint;
    Paint mBlackPaint1;
    Paint mBlackPaint2;
    Paint mMainPaint;
    Paint mWhitePaint;
    Rect mBlueRect;
    Rect mGreenRect;
    Rect mYellowRect;
    Rect mOrangeRect;
    Rect mRedRect;
    Rect mDarkRedRect;
    int mWidth, mHeight;
    int sys, dia;

    public ReportBpResultView(Context context) {
        super(context);
        setPaint();
    }

    public ReportBpResultView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPaint();
    }

    public void setPaint() {
        mBluePaint = new Paint();
        mBluePaint.setColor(getColor(R.color.r_blue2));
        mGreenPaint = new Paint();
        mGreenPaint.setColor(getColor(R.color.r_green2));
        mYellowPaint = new Paint();
        mYellowPaint.setColor(getColor(R.color.r_yellow2));
        mOrangePaint = new Paint();
        mOrangePaint.setColor(getColor(R.color.r_orange2));
        mRedPaint = new Paint();
        mRedPaint.setColor(getColor(R.color.r_red2));
        mDarkRedPaint = new Paint();
        mDarkRedPaint.setColor(getColor(R.color.r_dark_red2));

        mBlackPaint1 = new Paint();
        mBlackPaint1.setColor(getColor(R.color.gray_vaca));
        mBlackPaint1.setTextSize(TEXT_SIZE);
        mBlackPaint1.setTextAlign(Paint.Align.RIGHT);
        mBlackPaint1.setAntiAlias(true);

        mBlackPaint2 = new Paint();
        mBlackPaint2.setColor(getColor(R.color.gray_vaca));
        mBlackPaint2.setTextSize(TEXT_SIZE);
        mBlackPaint2.setAntiAlias(true);
//        String familyName = "仿宋";
//        Typeface font = Typeface.create(familyName,Typeface.NORMAL);
//        mBlackPaint2.setTypeface(font);
        mBlackPaint2.setTextAlign(Paint.Align.CENTER);

        mMainPaint = new Paint();
        mMainPaint.setColor(getColor(R.color.beColorPrimary));

        mWhitePaint = new Paint();
        mWhitePaint.setColor(getColor(R.color.White));
        mWhitePaint.setTextSize(TEXT_SIZE);

        mBlueRect = new Rect(RECT_LEFT, RECT_BTM - BLUE_RECT_H, RECT_LEFT + BLUE_RECT_W, RECT_BTM);
        mGreenRect = new Rect(RECT_LEFT, RECT_BTM - GREEN_RECT_H, RECT_LEFT + GREEN_RECT_W, RECT_BTM);
        mYellowRect = new Rect(RECT_LEFT, RECT_BTM - YELLOW_RECT_H, RECT_LEFT + YELLOW_RECT_W, RECT_BTM);
        mOrangeRect = new Rect(RECT_LEFT, RECT_BTM - ORANGE_RECT_H, RECT_LEFT + ORANGE_RECT_W, RECT_BTM);
        mRedRect = new Rect(RECT_LEFT, RECT_BTM - RED_RECT_H, RECT_LEFT + RED_RECT_W, RECT_BTM);
        mDarkRedRect = new Rect(RECT_LEFT, RECT_BTM - DARK_RED_RECT_H, RECT_LEFT + DARK_RED_RECT_W, RECT_BTM);
    }

    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);
        c.drawColor(getResources().getColor(android.R.color.transparent));
        c.drawRect(mDarkRedRect, mDarkRedPaint);
        c.drawRect(mRedRect, mRedPaint);
        c.drawRect(mOrangeRect, mOrangePaint);
        c.drawRect(mYellowRect, mYellowPaint);
        c.drawRect(mGreenRect, mGreenPaint);
        c.drawRect(mBlueRect, mBluePaint);
        if (sys != 0 && sys <= 200 && sys >= 70 && dia != 0 && dia <= 120 && dia >= 40) {
              }
    }

    public void setBPValue(int sys, int dia) {
        if (this.sys != sys && this.dia != dia) {
            this.sys = sys;
            this.dia = dia;
            invalidate();
        }
    }

    protected void onMeasure(int width, int height) {
        setMeasuredDimension(CANVAS_W, CANVAS_H);
    }


    private int getPixel(int resource_id) {
        return getResources().getDimensionPixelSize(resource_id);
    }

    private int getColor(int resource_id) {
        return getResources().getColor(resource_id);
    }
}
