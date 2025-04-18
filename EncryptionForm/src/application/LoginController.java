package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private Button loginButton;

    @FXML
    private Button resetButton;

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Thực hiện logic đăng nhập ở đây
        messageLabel.setText("Đang cố gắng đăng nhập với: " + username);
    }

    @FXML
    protected void handleResetButtonAction(ActionEvent event) {
        usernameField.setText("");
        passwordField.setText("");
        messageLabel.setText("");
    }
}
