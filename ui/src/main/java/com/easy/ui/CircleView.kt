package com.easy.ui

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View

class CircleView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val mPaint = Paint().also {
        it.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {

        super.onDraw(canvas)

        val width = width
        val height = height
        val radius = Math.min(width, height) / 2.toFloat()

        mPaint.shader =
            RadialGradient((width / 2).toFloat(), (height / 2).toFloat(), radius, Color.TRANSPARENT, Color.parseColor("#aa000000"), Shader.TileMode.MIRROR)
        // 绘制圆形
        canvas.drawCircle((width / 2).toFloat(), (height / 2).toFloat(), radius, mPaint)
    }

}