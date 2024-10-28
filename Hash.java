import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {
    /*
     * @params password: password to be hashed
     * @return hashed password in sha256
     * @throw NoSuchAlgorithimException when MessageDiges is intitialized with an invalid algorithim
     */
    public static String hashPassword(String password) throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256"); // Throws no such algorithim
        byte[] hash = messageDigest.digest(password.getBytes()); // Generate hash
        
        // Convert hash to hex
        StringBuilder hexString = new StringBuilder();
        for(byte b: hash){
            String hex = Integer.toHexString(0xff & b);
            if(hex.length() == 1) hexString.append("0");
            hexString.append(hex);
        }

        return hexString.toString();
    }
}