package application;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EncryptionController {

    @FXML
    private TextField inputText;

    @FXML
    private ChoiceBox<String> algorithmChoice;

    @FXML
    private TextArea outputText;

    @FXML
    private TextArea keyText;

    private Encryptable currentAlgorithm;

    @FXML
    public void initialize() {
        algorithmChoice.setValue("AES"); // Giá trị mặc định
        try {
            currentAlgorithm = new AESEncryption();
            keyText.setText(((AESEncryption) currentAlgorithm).getKeyBase64());
        } catch (Exception e) {
            keyText.setText("Lỗi khởi tạo AES");
            e.printStackTrace();
        }

        algorithmChoice.setOnAction(event -> {
            String selectedAlgorithm = algorithmChoice.getValue();
            try {
                if (selectedAlgorithm.equals("AES")) {
                    currentAlgorithm = new AESEncryption();
                    keyText.setText(((AESEncryption) currentAlgorithm).getKeyBase64());
                } else if (selectedAlgorithm.equals("RSA")) {
                    currentAlgorithm = new RSAEncryption();
                    keyText.setText("Public Key:\n" + ((RSAEncryption) currentAlgorithm).getPublicKeyBase64() + "\nPrivate Key (ẩn): ...");
                }
            } catch (Exception e) {
                keyText.setText("Lỗi khởi tạo " + selectedAlgorithm);
                e.printStackTrace();
            }
        });
    }

    @FXML
    protected void handleEncrypt() {
        String textToEncrypt = inputText.getText();
        if (currentAlgorithm != null) {
            String encryptedText = currentAlgorithm.encrypt(textToEncrypt);
            outputText.setText("Mã hóa:\n" + encryptedText);
        } else {
            outputText.setText("Vui lòng chọn thuật toán.");
        }
    }

    @FXML
    protected void handleDecrypt() {
        String textToDecrypt = inputText.getText(); // Sử dụng lại inputText để nhập chuỗi đã mã hóa
        if (currentAlgorithm != null) {
            String decryptedText = currentAlgorithm.decrypt(textToDecrypt);
            outputText.setText(outputText.getText() + "\nGiải mã:\n" + decryptedText);
        } else {
            outputText.setText("Vui lòng chọn thuật toán.");
        }
    }
}
