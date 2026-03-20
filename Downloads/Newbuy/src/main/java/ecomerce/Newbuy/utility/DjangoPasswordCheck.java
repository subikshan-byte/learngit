package ecomerce.Newbuy.utility;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.util.Base64;

public class DjangoPasswordCheck {

    public static boolean checkPassword(String rawPassword, String djangoHash) {

        try {

            String[] parts = djangoHash.split("\\$");

            int iterations = Integer.parseInt(parts[1]);
            String salt = parts[2];
            String storedHash = parts[3];

            byte[] hash = pbkdf2(rawPassword, salt, iterations);

            String encodedHash = Base64.getEncoder().encodeToString(hash);

            return encodedHash.equals(storedHash);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static byte[] pbkdf2(String password, String salt, int iterations) throws Exception {

        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(),
                salt.getBytes(),
                iterations,
                256
        );

        SecretKeyFactory factory =
                SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

        return factory.generateSecret(spec).getEncoded();
    }
}