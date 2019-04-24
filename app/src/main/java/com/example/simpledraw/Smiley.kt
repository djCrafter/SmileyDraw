package com.example.simpledraw

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View

class Smiley(context: Context, attrs: AttributeSet) : View(context, attrs)
{

    private val STANDART_OVAL = RectF(10f, 10f, 300f, 300f)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if(canvas == null) return

        val strokePaint = Paint()
        strokePaint.setARGB(255, 0, 0, 0)
        strokePaint.style = Paint.Style.STROKE
        strokePaint.strokeWidth = 10f

        val fillPaintYellow = Paint()
        fillPaintYellow.setARGB(255, 246, 255, 0)
        fillPaintYellow.style = Paint.Style.FILL

        val fillPaintBlue = Paint()
        fillPaintBlue.setARGB(255, 0, 17, 255)
        fillPaintYellow.style = Paint.Style.FILL

        val fillPaintRed = Paint()
        fillPaintRed.setARGB(255, 255, 0, 0)


        //Smiley
        canvas.drawOval(STANDART_OVAL, strokePaint)
        canvas.drawOval(STANDART_OVAL, fillPaintYellow)
        canvas.drawLine(80f, 80f, 120f, 120f, strokePaint)
        canvas.drawLine(120f, 80f, 80f, 120f, strokePaint)
        canvas.drawLine(190f, 80f, 230f, 120f, strokePaint)
        canvas.drawLine(230f, 80f, 190f, 120f, strokePaint)
        canvas.drawLine(120f, 250f, 190f, 250f, strokePaint)

        //Flag
        canvas.drawRect(400f, 30f, 650f, 130f, fillPaintBlue)
        canvas.drawRect(400f, 130f, 650f, 230f, fillPaintYellow)
        canvas.drawOval(RectF(395f, 20f, 405f, 30f), strokePaint)
        canvas.drawLine(400f, 20f, 400f, 400f, strokePaint)
        canvas.drawLine(390f, 400f, 410f, 400f, strokePaint)

        //Text
        fillPaintRed.typeface = Typeface.create(Typeface.MONOSPACE, Typeface.BOLD)
        fillPaintRed.textSize = 35f
        canvas.drawText("Hello Smiley!!!", 20f, 400f, fillPaintRed)
    }
}