package Open_Close.methods;

import Open_Close.OtpSender;

public class VoiceCallOtp implements OtpSender{

    @Override
    public void sendOtp(String otp, String method) {
        System.out.println("Sending OTP via voice call on " + method + " with otp: " + otp);
    }
    
}
