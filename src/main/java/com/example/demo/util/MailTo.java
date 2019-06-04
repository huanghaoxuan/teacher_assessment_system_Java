package com.example.demo.util;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class MailTo {
    // 发件人 账号和密码
    public static final String MY_EMAIL_ACCOUNT = "sjcj_cxxy@163.com";
    public static final String MY_EMAIL_PASSWORD = "sjcjcxxy123123";// 密码,是你自己的设置的授权码

    // SMTP服务器(这里用的163 SMTP服务器)
    public static final String MEAIL_163_SMTP_HOST = "smtp.163.com";
    public static final String SMTP_163_PORT = "25";// 端口号,这个是163使用到的;QQ的应该是465或者875

    // 收件人
    //public static final String RECEIVE_EMAIL_ACCOUNT = "1477205319@qq.com";

    public void sendmail(String email, int token) throws AddressException, MessagingException {
        Properties p = new Properties();
        p.setProperty("mail.smtp.host", MEAIL_163_SMTP_HOST);
        p.setProperty("mail.smtp.port", SMTP_163_PORT);
        p.setProperty("mail.smtp.socketFactory.port", SMTP_163_PORT);
        p.setProperty("mail.smtp.auth", "true");
        p.setProperty("mail.smtp.socketFactory.class", "SSL_FACTORY");
        //p.setProperty("mail.smtp.localhost", "mail.digu.com");

        Session session = Session.getInstance(p, new Authenticator() {
            // 设置认证账户信息
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MY_EMAIL_ACCOUNT, MY_EMAIL_PASSWORD);
            }
        });
        session.setDebug(true);
        System.out.println("创建邮件");
        MimeMessage message = new MimeMessage(session);
        // 发件人
        message.setFrom(new InternetAddress(MY_EMAIL_ACCOUNT));
        // 收件人和抄送人
        message.setRecipients(Message.RecipientType.TO, email);
        //给自己抄送一份，解决 554 DT:SPM 问题
        message.setRecipients(Message.RecipientType.CC, MY_EMAIL_ACCOUNT);

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