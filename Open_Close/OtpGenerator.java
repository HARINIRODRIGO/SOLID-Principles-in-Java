package Open_Close;

import java.util.Random;

public class OtpGenerator {
    public String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); 
        return String.valueOf(otp);
    }
}
