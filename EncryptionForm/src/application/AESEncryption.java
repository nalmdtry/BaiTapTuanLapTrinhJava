package application;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AESEncryption implements Encryptable {

    private SecretKey key;
    private final String ALGORITHM = "AES";

    public AESEncryption() throws Exception {
        // Tạo một key ngẫu nhiên (trong thực tế bạn cần quản lý key an toàn hơn)
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(128); // Độ dài key 128-bit
        key = keyGen.generateKey();
    }

    public AESEncryption(String secretKey) throws Exception {
        byte[] decodedKey = Base64.getDecoder().decode(secretKey);
        this.key = new SecretKeySpec(decodedKey, 0, decodedKey.length, ALGORITHM);
    }

    @Override
    public String encrypt(String data) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "Lỗi mã hóa AES";
        }
    }

    @Override
    public String decrypt(String encryptedData) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decodedBytes = Base64.getDecoder().decode(encryptedData);
            byte[] decryptedBytes = cipher.doFinal(decodedBytes);
            return new String(decryptedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return "Lỗi giải mã AES";
        }
    }

    // Phương thức để lấy key (chỉ cho mục đích demo, cần quản lý key an toàn hơn)
    public String getKeyBase64() {
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }
}