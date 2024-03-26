package util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
	//from: testemailtest047@gmail.com
	//pass: dqowzastdiarlehv
	static final String from = "testemailtest047@gmail.com";
	static final String password = "dqowzastdiarlehv";
	static final String to = "levubang997@gmail.com";
	
	public static void sendEmail(String from, String pass, String to, String sub, String content) {
		//Properties: Khai bao cac thuoc tinh
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP HOST
		props.put("mail.smtp.port", "587"); //TLS 587 SSL 465
		props.put("mail.smtp.auth", "true"); //Yeu cau dang nhap
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true"); //giao thuc
		// Create Authenticator
		Authenticator auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pass);
			}
		};
		// Create session
		Session session = Session.getInstance(props, auth);
		//Send email
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.addHeader("Conten-type", "text/html; charset=UTF-8"); //Kiểu nội dung
			msg.setFrom(from); //Người gửi
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false)); //Người nhận
			msg.setSubject(sub); //Tiêu đề
			msg.setSentDate(new Date()); //Ngày gửi
			//msg.setReplyTo(null); //Quy định nhận phản hồi
			//Nội dung gửi
			//msg.setText("Đây là phần nội dung", "UTF-8");
			msg.setContent(content, "text/html");
			//Gửi email
			Transport.send(msg);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	public static boolean sendEmailWithDefaul(String to, String sub, String content) {
		//Properties: Khai bao cac thuoc tinh
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP HOST
		props.put("mail.smtp.port", "587"); //TLS 587 SSL 465
		props.put("mail.smtp.auth", "true"); //Yeu cau dang nhap
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true"); //giao thuc
		// Create Authenticator
		Authenticator auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		};
		// Create session
		Session session = Session.getInstance(props, auth);
		//Send email
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.addHeader("Conten-type", "text/html; charset=UTF-8"); //Kiểu nội dung
			msg.setFrom(from); //Người gửi
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false)); //Người nhận
			msg.setSubject(sub); //Tiêu đề
			msg.setSentDate(new Date()); //Ngày gửi
			//msg.setReplyTo(null); //Quy định nhận phản hồi
			//Nội dung gửi
			//msg.setText("Đây là phần nội dung", "UTF-8");
			msg.setContent(content, "text/html; charset=UTF-8");
			//Gửi email
			Transport.send(msg);
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}
}