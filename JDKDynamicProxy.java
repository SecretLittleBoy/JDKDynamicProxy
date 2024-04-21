import SmsService.SmsService;
import SmsService.SmsServiceImpl;

public class JDKDynamicProxy {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
