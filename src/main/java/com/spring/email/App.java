package com.spring.email;

import com.spring.email.gmail.GmailSender;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GmailSender gmailSender = new GmailSender();
    	String from = "ankitsharma97194@gmail.com";
    	String to ="ankitshrma97194@gmail.com";
    	String subject = "Sending email examle";
    	String text="Hello world";
    	boolean status = gmailSender.sendEmail(to, from, subject,text);
    	if (status) {
			System.out.println("Email send successfully");
		}else {
			System.out.println("Something went wrong!!");
		}
    }
}
