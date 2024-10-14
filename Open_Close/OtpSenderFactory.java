package Open_Close;

import Open_Close.methods.EmailOtp;
import Open_Close.methods.SmsOtp;
import Open_Close.methods.VoiceCallOtp;

public class OtpSenderFactory {
    public static OtpSender getOtpSender(String method) {
        if (method.equalsIgnoreCase("sms")) {
            return new SmsOtp();
        } else if (method.equalsIgnoreCase("email")) {
            return new EmailOtp();
        } else if (method.equalsIgnoreCase("voice")) {
            return new VoiceCallOtp();
        } else {
            throw new IllegalArgumentException("Invalid OTP sending method");
        }
    }
}

