package com.example.lv_78;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ListView<String> userListView;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button dodaj_button;

    private int selectedIndex = -1;
    private ObservableList<String> userList = FXCollections.observableArrayList();


    @FXML
    public void initialize() {
        userListView.setItems(userList);

        userListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                String[] parts = newValue.split(" ");
                nameTextField.setText(parts[0]);
                lastNameTextField.setText(parts[1]);
            }
        });
    }

    @FXML
    public void Dodaj(ActionEvent actionEvent) {
        String userName = nameTextField.getText();
        String userLastName = lastNameTextField.getText();
        String userEmail = emailTextField.getText();
        String userUsername = usernameTextField.getText();
        String userPassword = passwordField.getText();

        if (!userName.isEmpty() && !userLastName.isEmpty() && !userEmail.isEmpty() && !userUsername.isEmpty() && !userPassword.isEmpty()) {
            String newUser = userName + " " + userLastName;

            userList.add(newUser);

            nameTextField.clear();
            lastNameTextField.clear();
            emailTextField.clear();
            usernameTextField.clear();
            passwordField.clear();
        }
    }

    public void Kraj(ActionEvent actionEvent) {
        Platform.exit();
        System.exit(0);
    }
}
