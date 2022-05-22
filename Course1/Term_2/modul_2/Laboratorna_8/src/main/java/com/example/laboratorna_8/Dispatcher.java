package com.example.laboratorna_8;

import java.io.*;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Dispatcher extends Application {


    public Label first_name_label;
    public TextField first_name;
    public Label second_name_label;
    public TextField second_name;
    public Label data_of_birth_label;
    public DatePicker datePicker;
    public Label gender_label;
    public ToggleGroup group_gender;
    public RadioButton male_radio;
    public RadioButton female_radio;
    public Label languages_label;
    public CheckBox java_checkBox;
    public CheckBox python_checkBox;
    public CheckBox cpp_checkBox;
    public Label education_label;
    public ChoiceBox educational_choiceBox;
    public Button button_register;
    public GridPane gridPane;
    public Scene scene;


    public Dispatcher(){

        this.first_name_label = new Label("First name");
        this.first_name = new TextField();
        this.second_name_label = new Label("Second name");
        this.second_name = new TextField();
        this.data_of_birth_label = new Label("Choose your birthday");
        this.datePicker = new DatePicker();
        this.gender_label = new Label("Choose gender");
        this.group_gender = new ToggleGroup();
        this.male_radio = new RadioButton("male");
        this.female_radio = new RadioButton("female");
        this.languages_label = new Label("Choose which languages you know");
        this.java_checkBox = new CheckBox("Java");
        this.python_checkBox = new CheckBox("Python");
        this.cpp_checkBox = new CheckBox("C++");
        this.education_label = new Label("Educational qualification");
        this.educational_choiceBox = new ChoiceBox();
        this.button_register = new Button("Register");
        this.gridPane = new GridPane();
        this.scene = new Scene(this.gridPane);
    }


    @Override
    public void start(Stage stage) throws IOException {

        this.male_radio.setToggleGroup(this.group_gender);
        this.female_radio.setToggleGroup(this.group_gender);


        this.java_checkBox.setIndeterminate(false);
        this.python_checkBox.setIndeterminate(false);
        this.cpp_checkBox.setIndeterminate(false);


        this.educational_choiceBox.getItems().addAll("Junoir","Middle","Senior");

        this.gridPane.setMinSize(600,300);

        this.gridPane.setPadding(new Insets(10,10,10,10));

        this.gridPane.setVgap(5);
        this.gridPane.setHgap(5);

        this.gridPane.setAlignment(Pos.CENTER);


        this.gridPane.add(this.first_name_label,0,0);
        this.gridPane.add(this.first_name,1,0);

        this.gridPane.add(this.second_name_label,0,1);
        this.gridPane.add(this.second_name,1,1);

        this.gridPane.add(this.gender_label,0,2);
        this.gridPane.add(this.male_radio,1,2);
        this.gridPane.add(this.female_radio,2,2);

        this.gridPane.add(this.data_of_birth_label,0,3);
        this.gridPane.add(this.datePicker,1,3);

        this.gridPane.add(this.languages_label,0,4);
        this.gridPane.add(this.java_checkBox,1,4);
        this.gridPane.add(this.python_checkBox,2,4);
        this.gridPane.add(this.cpp_checkBox,3,4);

        this.gridPane.add(this.education_label,0,5);
        this.gridPane.add(this.educational_choiceBox,1,5);

        this.gridPane.add(this.button_register,1,6);





        this.button_register.setStyle("-fx-background-color:darkslateblue; -fx-text-fill: white;");
        this.button_register.setMinSize(130,40);
        this.first_name_label.setStyle("-fx-font:normal bold 15px 'serif' ");
        this.second_name_label.setStyle("-fx-font:normal bold 15px 'serif' ");
        this.data_of_birth_label.setStyle("-fx-font:normal bold 15px 'serif' ");
        this.gender_label.setStyle("-fx-font:normal bold 15px 'serif' ");
        this.languages_label.setStyle("-fx-font:normal bold 15px 'serif' ");
        this.education_label.setStyle("-fx-font:normal bold 15px 'serif' ");
        this.gridPane.setStyle("-fx-background-color:silver;");


        stage.setTitle("Registration Form");

        stage.setScene(this.scene);

        stage.show();


        this.button_register.setOnAction(actionEvent -> {

            try {
                write_values_into_the_file();
            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            stage.close();
        });

    }


    public void write_values_into_the_file() throws FileNotFoundException {

        File file = new File("D:\\MyJavaTasks\\Course1\\Term_2\\modul_2\\Laboratorna_8\\test.txt");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Name: " + this.first_name.getText().trim());
        printWriter.println("Second name: "+ this.second_name.getText().trim());


        if(male_radio.isSelected()){
            printWriter.println("Gender: " + this.male_radio.getText());
        }

        else {
            printWriter.println("Gender: " + this.female_radio.getText());
        }


        String formatedDate = this.datePicker.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yy"));
        printWriter.println("Date of birth: " + formatedDate);


        if(this.java_checkBox.isSelected()){
            printWriter.println("Language: " + this.java_checkBox.getText());
        }

        if(this.python_checkBox.isSelected()){
            printWriter.println("Language: " + this.python_checkBox.getText());
        }

        if(this.cpp_checkBox.isSelected()){
            printWriter.println("Language: " + this.cpp_checkBox.getText());
        }


        printWriter.println("Status: " + this.educational_choiceBox.getValue());

        printWriter.flush();
        printWriter.close();
    }


    public static void  read_values_from_the_file() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\MyJavaTasks\\Course1\\Term_2\\modul_2\\Laboratorna_8\\test.txt"));

        String string;
        while ((string = bufferedReader.readLine()) != null){
            System.out.println(string);
        }
    }


    public static void main(String[] args) throws IOException {
        launch(args);
        read_values_from_the_file();
    }
}
