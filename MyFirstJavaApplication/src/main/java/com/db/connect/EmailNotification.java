package com.db.connect;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*; 

public class EmailNotification {
	
	public boolean status = false;
	public boolean notificationstatus = false;
	
	public boolean sendEmail(String email, String password) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("noreplymyfirstapplication@gmail.com","First@1234");
				}
			});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("noreplymyfirstapplication@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("Password Recovery");
			message.setText("Dear " +
					"\n\n Your password is:"+password+". Please use to login into your account.");
			Transport.send(message);
			System.out.println("email sent");
			status = true;
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return status;
	}
	
	public boolean sendJobNotifactionEmail(String email, String firstname) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("noreplymyfirstapplication@gmail.com","First@1234");
				}
			});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("noreplymyfirstapplication@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("Job Notification");
			message.setText("Dear " +firstname+","+
					"\n\n Your Job Application for the job id : 11111 has been submitted successfully.");
			Transport.send(message);
			System.out.println("email sent");
			notificationstatus = true;
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return notificationstatus;
	}
}
