package Open_Close;

import Open_Close.methods.EmailOTP;
import Open_Close.methods.SmsOTP;
import Open_Close.methods.VoiceCallOTP;

public class OtpSenderFactory {
    public static OtpSender getOtpSender(String method) {
        if (method.equalsIgnoreCase("sms")) {
            return new SmsOTP();
        } else if (method.equalsIgnoreCase("email")) {
            return new EmailOTP();
        } else if (method.equalsIgnoreCase("voice")) {
            return new VoiceCallOTP();
        } else {
            throw new IllegalArgumentException("Invalid OTP sending method");
        }
    }
}

