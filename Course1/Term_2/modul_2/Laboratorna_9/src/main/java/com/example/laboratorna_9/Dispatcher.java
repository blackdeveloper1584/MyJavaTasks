package com.example.laboratorna_9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.function.DoubleUnaryOperator;
import java.io.IOException;


public class Dispatcher extends Application {

    private DoubleUnaryOperator DoubleUnaryOperator;

    public double a = 1;
    public double b = 1;
    public double width = 1;
    public double scale = 5;


    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Графік функції");
        AnchorPane pane = new AnchorPane();
        GraphBuilder builder = new GraphBuilder(pane);
        builder.addFunction((DoubleUnaryOperator = x->a/(b*Math.sin(x))), Color.BLUE, width);

        Scene scene = new Scene(pane,  1400, 750);
        builder.drawGraph(-scale, scale);


        Label label_a = new Label("Значення a:");
        AnchorPane.setRightAnchor(label_a, 180.0);
        AnchorPane.setTopAnchor(label_a, 5.0);

        TextField textField_a = new TextField();
        AnchorPane.setRightAnchor(textField_a, 20.0);
        AnchorPane.setTopAnchor(textField_a,5.0);
        textField_a.setText(String.valueOf(a));


        Label label_b = new Label("Значення b:");
        AnchorPane.setRightAnchor(label_b, 180.0);
        AnchorPane.setTopAnchor(label_b, 45.0);

        TextField textField_b = new TextField();
        AnchorPane.setRightAnchor(textField_b, 20.0);
        AnchorPane.setTopAnchor(textField_b, 40.0);
        textField_b.setText(String.valueOf(b));


        Slider slider = new Slider(1, 10, 5);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setBlockIncrement(1);
        slider.setMajorTickUnit(1);
        slider.setSnapToTicks(true);
        slider.setMinWidth(200);
        slider.setMinHeight(100);
        AnchorPane.setRightAnchor(slider, 40.0);
        AnchorPane.setTopAnchor(slider, 80.0);


        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setMinWidth(200);
        scrollBar.setMinHeight(20);
        AnchorPane.setRightAnchor(scrollBar,40.0);
        AnchorPane.setTopAnchor(scrollBar,200.0);



        textField_a.textProperty().addListener((observable, old_value, new_value) -> {
            a = Double.parseDouble(textField_a.getText());
            builder.addFunction((DoubleUnaryOperator = x->a/(b*Math.sin(x))), Color.BLUE, width);
            builder.drawGraph(-scale, scale);
            pane.getChildren().addAll(label_a, textField_a, label_b, textField_b, slider, scrollBar);
        });


        textField_b.textProperty().addListener((observable, old_value, new_value) -> {
            b = Double.parseDouble(textField_b.getText());
            builder.addFunction((DoubleUnaryOperator = x->a/(b*Math.sin(x))), Color.BLUE, width);
            builder.drawGraph(-scale, scale);
            pane.getChildren().addAll(label_a, textField_a, label_b, textField_b, slider, scrollBar);
        });


        slider.valueProperty().addListener((observable, old_value, new_value) -> {
            int value  = (int) Math.round(slider.getValue());

            if(value != Math.round(old_value.doubleValue())) {
                scale = (double) new_value;
                builder.drawGraph(-scale, scale);
                pane.getChildren().addAll(label_a, textField_a, label_b, textField_b, slider, scrollBar);
            }
        });


        scrollBar.valueProperty().addListener((observable, old_value, new_value) ->{
            int value = (int) Math.round(scrollBar.getValue());

            if(value != Math.round(old_value.doubleValue())) {
                width = Double.parseDouble(String.valueOf(new_value));
                builder.addFunction((DoubleUnaryOperator = x->a/(b*Math.sin(x))), Color.BLUE, width);
                builder.drawGraph(-scale, scale);
                pane.getChildren().addAll(label_a, textField_a, label_b, textField_b, slider, scrollBar);
            }
        });


        pane.getChildren().addAll(label_a, textField_a, label_b, textField_b, slider, scrollBar);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
