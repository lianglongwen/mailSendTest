import utils.MailUtils;

import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

public class MainApp {

    public static void main(String[] args){
        MailUtils mailUtils = new MailUtils();
        try {
            mailUtils.sendMail("wen.liang@gzgi.com","你好，这是一封测试邮件，无需回复。","测试邮件");
            System.out.println("发送成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("发送失败");
        }

    }
}
