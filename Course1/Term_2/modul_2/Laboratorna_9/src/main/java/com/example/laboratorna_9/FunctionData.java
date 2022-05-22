package com.example.laboratorna_9;

import javafx.scene.paint.Paint;

import java.util.function.DoubleUnaryOperator;

public class FunctionData {
    private DoubleUnaryOperator operator;
    private Paint paint;
    private double width;

    public FunctionData(DoubleUnaryOperator operator, Paint paint, double width) {
        this.operator = operator;
        this.paint = paint;
        this.width = width;
    }

    public DoubleUnaryOperator getOperator() {
        return operator;
    }

    public Paint getPaint() {
        return paint;
    }

    public double getWidth() {
        return width;
    }
}
