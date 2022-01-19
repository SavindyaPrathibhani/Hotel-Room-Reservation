package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class loginFormController {
    public TextField txtUserNameA;
    public TextField txtUserNameR;
    public PasswordField pwdPasswordA;
    public PasswordField pwdPasswordR;

    int attempts=0;

    public void loginAonAction(ActionEvent actionEvent) throws IOException {
        attempts++;
        if(attempts<=3) {

            String tempUserNameA = txtUserNameA.getText();
            String tempPasswordA = pwdPasswordA.getText();
            if (tempUserNameA.equals("a") && tempPasswordA.equals("A")) {
                URL resource = getClass().getResource("../view/AdminWindow.fxml");
                Parent load = FXMLLoader.load(resource);
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Incorrect User Name or Password").show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING, "You have tried 3 times").show();
        }
        txtUserNameA.setText("");
        pwdPasswordA.setText("");
    }



    public void loginRonAction(ActionEvent actionEvent) throws IOException {
        attempts++;
        if(attempts<=3) {

            String tempUserNameR = txtUserNameR.getText();
            String tempPasswordR = pwdPasswordR.getText();
            if (tempUserNameR.equals("r") && tempPasswordR.equals("R")) {
                URL resource = getClass().getResource("../view/receptionistWindow.fxml");
                Parent load = FXMLLoader.load(resource);
                Scene scene = new Scene(load);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Incorrect User Name or Password").show();
            }
        }else{
            new Alert(Alert.AlertType.WARNING, "You have tried 3 times").show();
        }
        txtUserNameR.setText("");
        pwdPasswordR.setText("");

    }
}
