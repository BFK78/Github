package com.example.githubdemo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CustomComponent(
    canvasSize: Dp = 300.dp,
    indicatorValue: Int = 0,
    maxIndicatorValue: Int = 0,
    backgroundIndicatorColor: Color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
    backgroundIndicatorStrokeWidth: Float = 100f
) {

    Column(
       modifier = Modifier
           .size(canvasSize)
           .drawBehind {
               val componentSize = size / 1.25f
               backgroundIndicator(
                   componentSize = componentSize,
                   indicatorColor = backgroundIndicatorColor,
                   indicatorStrokeWidth = backgroundIndicatorStrokeWidth
               )
           }
    ) {

    }
}


fun DrawScope.backgroundIndicator(
    componentSize: Size,
    indicatorColor: Color,
    indicatorStrokeWidth: Float
) {
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = 240f,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        )
    )
}

@Composable
@Preview(showBackground = true)
fun CustomComponentPreview() {
    CustomComponent()
}