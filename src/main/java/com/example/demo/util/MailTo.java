package com.example.demo.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.util.Properties;

public class MailTo {
    // 发件人 账号和密码
    //public static final String MY_EMAIL_ACCOUNT = "";
    //public static final String MY_EMAIL_PASSWORD = "";// 密码,是你自己的设置的授权码

    // SMTP服务器(这里用的163 SMTP服务器)
    //public static final String MEAIL_outlook_SMTP_HOST = "";
    //public static final String SMTP_oulook_PORT = "";// 端口号,这个是163使用到的;QQ的应该是465或者875

    // 收件人
    //public static final String RECEIVE_EMAIL_ACCOUNT = "1477205319@qq.com";

    public void sendmail(String email, int token) throws Exception {
        Properties properties = new Properties();
        // 使用InPutStream流读取properties文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\main\\resources\\com\\example\\demo\\util\\mail.properties"));
        properties.load(bufferedReader);
        // 获取key对应的value值
        //properties.getProperty(String key);
        Properties p = new Properties();
        p.setProperty("mail.smtp.host", properties.getProperty("MEAIL_SMTP_HOST"));
        p.setProperty("mail.smtp.port", properties.getProperty("SMTP_PORT"));
        p.setProperty("mail.smtp.socketFactory.port", properties.getProperty("SMTP_PORT"));
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.auth", "true");
        p.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //p.setProperty("mail.smtp.localhost", "jskh.cxxy.seu.edu.cn");

        Session session = Session.getInstance(p, new Authenticator() {
            // 设置认证账户信息
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(properties.getProperty("MY_EMAIL_ACCOUNT"), properties.getProperty("MY_EMAIL_PASSWORD"));
            }
        });
        session.setDebug(true);
        System.out.println("创建邮件");
        MimeMessage message = new MimeMessage(session);
        // 发件人
        message.setFrom(new InternetAddress(properties.getProperty("MY_EMAIL_ACCOUNT")));
        // 收件人和抄送人
        message.setRecipients(Message.RecipientType.TO, email);
        //给自己抄送一份，解决 554 DT:SPM 问题
        //message.setRecipients(Message.RecipientType.CC, MY_EMAIL_ACCOUNT);

        // 内容(这个内容还不能乱写,有可能会被SMTP拒绝掉;多试几次吧)
        message.setSubject("东南大学成贤学院数据采集系统用户验证");
        message.setContent("<h1>您好：欢迎使用东南大学成贤学院数据采集系统</h1>\n" +
                "<br>\n" +
                "<h4>您正在使用本系统进行邮箱验证，您填写的邮箱将作为您用户鉴别的唯一，密码找回的唯一途径。请仔细确认</h4>\n" +
                "<br>\n" +
                "<h4>你本次的验证码为</h4><h3 style=\"color : #f00;\">" +
                token +
                "</h3>\n" +
                "<br>\n" +
                "<h4>本邮件由系统自动发送，请勿回复</h4>", "text/html;charset=UTF-8");
        message.setSentDate(new Date());
        message.saveChanges();
        System.out.println("准备发送");
        Transport.send(message);
    }
}