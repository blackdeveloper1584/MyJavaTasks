package com.example.laboratorna_10;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Dispatcher extends Application {

    GraphicsContext gc;

    Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.BLUEVIOLET, Color.PURPLE, Color.YELLOW,Color.TURQUOISE};

    public int circleX_1 = 10;
    public  int circleY_1 = 10;

    public int rectX = 650;
    public int rectY = 0;

    public int step = 5;
    public int types_of_color = 0;


    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("Animation");
        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 1300, 500);
        Canvas canvas = new Canvas(700, 400);
        gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.GREEN);
        gc.fillOval(circleX_1, circleY_1, 100, 100);

        gc.setFill(Color.RED);
        gc.fillRect(rectX,rectY,50,50);

        gc.setFill(Color.TAN);
        gc.setFont(new Font(20));
        gc.fillText("Andreiko Taras I-12",0,350);


        Label status_label = new Label("");


        Button buttonChangeColor = new Button("Change Color");
        buttonChangeColor.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent או) {
                types_of_color ++;
                if (types_of_color > 7) {
                    types_of_color = 0;
                }
                gc.setStroke(colors[types_of_color]);
                gc.setFill(colors[types_of_color]);

                gc.fillOval(circleX_1, circleY_1, 100, 100);

                gc.fillRect(rectX,rectY,50,50);

                gc.fillText("Andreiko Taras I-12",0,350);

            }
        });


        AnimationTimer timer_1 = new AnimationTimer(){
            @Override
            public void handle(long now) {
                draw_on_OX();
            }
        };


        AnimationTimer timer_2 = new AnimationTimer() {
            @Override
            public void handle(long l) {
                draw_on_OY();
            }
        };


        AnimationTimer timer_3 = new AnimationTimer() {
            @Override
            public void handle(long l) {
                drawRectOnOY();
            }
        };


        Button buttonStopCircleOnOX = new Button("Stop on OX");
        buttonStopCircleOnOX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timer_1.stop();
                status_label.setText("Button Stop on OX is active now");
            }
        });



        Button buttonStopCircleOnOY = new Button("Stop on OY");
        buttonStopCircleOnOY.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timer_2.stop();
                status_label.setText("Button Stop on OY is active now");
            }
        });


        Button buttonMoveOnOX = new Button("Move on OX");
        buttonMoveOnOX.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timer_1.start();
                status_label.setText("Button Move on OX is active now");
            }
        });


        Button buttonMoveOnOY = new Button("Move on OY");
        buttonMoveOnOY.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timer_2.start();
                status_label.setText("Button Move on OY is active now");
            }
        });


        Button buttonMoveRect = new Button("Move rect");
        buttonMoveRect.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timer_3.start();
                status_label.setText("Button Move rect is active now");
            }
        });


        flowPane.getChildren().addAll(canvas, buttonChangeColor, buttonMoveOnOX, buttonStopCircleOnOX, buttonMoveOnOY, buttonStopCircleOnOY,  buttonMoveRect, status_label);
        arg0.setScene(scene);
        arg0.show();
    }


    public void draw_on_OX(){
        gc.setFill(Color.WHITE);
        gc.fillOval(circleX_1, circleY_1,100,100);
        circleX_1 = circleX_1 + step;
        gc.setFill(colors[types_of_color]);
        gc.fillOval(circleX_1, circleY_1, 100, 100);

        try {
            Thread.sleep(50);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (circleX_1 + 100 > 700 || circleX_1 < 0) {
            step = -step;
        }
    }


    public void draw_on_OY(){
        gc.setFill(Color.WHITE);
        gc.fillOval(circleX_1, circleY_1,100,100);
        circleY_1 = circleY_1 + step;
        gc.setFill(colors[types_of_color]);
        gc.fillOval(circleX_1, circleY_1, 100, 100);

        try {
            Thread.sleep(50);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (circleY_1 + 100 > 400 || circleY_1 < 0) {
            step = -step;
        }
    }


    public void drawRectOnOY(){
        gc.setFill(Color.WHITE);
        gc.fillRect(rectX, rectY,50,50);
        rectY = rectY + step;
        gc.setFill(colors[types_of_color]);
        gc.fillRect(rectX, rectY, 50, 50);

        try {
            Thread.sleep(50);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (rectY + 50 > 400 || rectY < 0) {
            step = -step;
        }
    }
}

