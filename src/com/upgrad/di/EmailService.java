package com.upgrad.di;

/**
 *  Email service to send email
 */
public class EmailService {

  public void sendEmail(String message , String receiver){

    System.out.println("Email send to : "+ receiver + " with message : "+ message);
  }
}
