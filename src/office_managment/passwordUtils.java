package office_managment;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class passwordUtils {
    public static String hashPass(String password){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            byte[] hashBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            
            for(byte b : hashBytes){
                sb.append(String.format("%01x", b));
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
}
