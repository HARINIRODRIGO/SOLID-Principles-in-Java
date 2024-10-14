package Open_Close.methods;

import Open_Close.OtpSender;

public class EmailOtp implements OtpSender
 {

    @Override
    public void sendOtp(String otp, String method) {
       System.out.println("Sending OTP via Email on " + method + " with otp: " + otp);
    }

}
