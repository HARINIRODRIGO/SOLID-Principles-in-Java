package Open_Close.methods;

import Open_Close.OtpSender;

public class SmsOtp implements OtpSender  {

    @Override
    public void sendOtp(String otp, String method) {
        System.out.println("Sending OTP via SMS on " + method + " with otp: " + otp);
    }
    
}
