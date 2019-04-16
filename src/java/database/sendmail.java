/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vanaja
 */
public class sendmail {
    public void send(String to,String msg,String sub)
    {
    final String username = "atheena3467@gmail.com";//sender emailid
		final String password = "rejulesh";//sender password
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session1 = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
 
  
			Message message = new MimeMessage(session1);
			message.setFrom(new InternetAddress("atheena3467@gmail.com"));//sender email
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(to));
			message.setSubject(sub);
			message.setText(msg);
 
			Transport.send(message);
 
			System.out.println("Done");
                        System.out.println(to);
                }
                catch(Exception e)
                {}
           
    }
}
