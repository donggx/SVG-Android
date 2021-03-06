package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_loyalty extends SVGRenderer {

    public ic_loyalty(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(21.41f, 11.58f);
        mPath.rLineTo(-9.0f, -9.0f);
        mPath.cubicTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        mPath.lineTo(4.0f, 2.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 7.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        mPath.rLineTo(9.0f, 9.0f);
        mPath.rCubicTo(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        mPath.rCubicTo(0.55f, 0.0f, 1.05f, -0.22f, 1.41f, -0.59f);
        mPath.rLineTo(7.0f, -7.0f);
        mPath.rCubicTo(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        mPath.rCubicTo(0.0f, -0.55f, -0.23f, -1.06f, -0.59f, -1.42f);
        mPath.close();
        mPath.moveTo(21.41f, 11.58f);
        mPath.moveTo(5.5f, 7.0f);
        mPath.cubicTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        mPath.cubicTo(4.0f, 4.67f, 4.67f, 4.0f, 5.5f, 4.0f);
        mPath.cubicTo(6.33f, 4.0f, 7.0f, 4.67f, 7.0f, 5.5f);
        mPath.cubicTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f);
        mPath.close();
        mPath.moveTo(5.5f, 7.0f);
        mPath.rMoveTo(11.77f, 8.27f);
        mPath.lineTo(13.0f, 19.54f);
        mPath.rLineTo(-4.27f, -4.27f);
        mPath.cubicTo(8.28f, 14.81f, 8.0f, 14.19f, 8.0f, 13.5f);
        mPath.rCubicTo(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        mPath.rCubicTo(0.69f, 0.0f, 1.32f, 0.28f, 1.77f, 0.74f);
        mPath.rLineTo(0.73f, 0.72f);
        mPath.rLineTo(0.73f, -0.73f);
        mPath.rCubicTo(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f);
        mPath.rCubicTo(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        mPath.rCubicTo(0.0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f);
        mPath.close();
        mPath.moveTo(17.27f, 15.27f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}