package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Label for Username
        Label usernameLabel = new Label ("Username:");
        TextField usernameText = new TextField();
        usernameText.setPromptText("Username");

        // Label for Password
        Label passwordLabel = new Label ("Password");
        PasswordField passwordText = new PasswordField();
        passwordText.setPromptText("Password");

        // Label for Full Name
        Label fullnameLabel = new Label ("Full Name:");
        TextField fullnameText = new TextField();
        fullnameText.setPromptText("Full Name");

        // Label for E-Mail
        Label emailLabel = new Label ("E-Mail:");
        TextField emailText = new TextField();
        emailText.setPromptText("E-Mail");

        // Label for Phone #
        Label phoneLabel = new Label ("Phone #:");
        TextField phoneText = new TextField();
        phoneText.setPromptText("Phone #");

        // Label for Date of Birth
        Label dobLabel = new Label("Date of Birth:");
        DatePicker datePicker = new DatePicker();

        // Label for Register
        Button buttonRegister = new Button("Register");

        // Creating Grid Pane
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(500,300);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        gridPane.setAlignment(Pos.TOP_LEFT);

        // Adding Elements
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameText, 1, 0);

        gridPane.add(passwordLabel, 0, 2);
        gridPane.add(passwordText, 1, 2);

        gridPane.add(fullnameLabel, 0, 4);
        gridPane.add(fullnameText, 1, 4);

        gridPane.add(emailLabel, 0, 6);
        gridPane.add(emailText, 1, 6);

        gridPane.add(phoneLabel, 0, 8);
        gridPane.add(phoneText, 1, 8);

        gridPane.add(dobLabel, 0,10);
        gridPane.add(datePicker, 1,10);

        gridPane.add(buttonRegister, 1, 12);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Lab 04 Solution");

        // Adding the Scene to the stage
        stage.setScene(scene);

        // Display the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}