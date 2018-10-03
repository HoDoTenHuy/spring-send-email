package stackjava.com.springsendemail.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MainApp {
	public static void main(final String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MailSender mailSender = (MailSender) context.getBean("mailSender2");
		System.out.println("Sending text...");
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("teststackjava@gmail.com");
		message.setTo("stackjava.com@gmail.com");
		message.setSubject("Subject");
		message.setText("test send gmail using spring");
		// sending message
		mailSender.send(message);
		System.out.println("Sending text done!");
		context.close();
	}
}
