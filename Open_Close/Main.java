package Open_Close;


public class Main {
    private OtpGenerator otpGenerator = new OtpGenerator();

    public void sendOtp(String method, String destination) {
        String otp = otpGenerator.generateOtp();
        OtpSender otpSender = OtpSenderFactory.getOtpSender(method);
        otpSender.sendOtp(otp, destination);
    }

    public static void main(String[] args) {
        

        // Sending OTP via SMS
        new Main().sendOtp("sms", "123-456-7890");

        // Sending OTP via Email
        new Main().sendOtp("email", "user@example.com");

        // Sending OTP via Voice Call
        new Main().sendOtp("voice", "123-456-7890");
    }
}
