package com.upgrad.di;

/**
 *  Email service to send email
 */
public class EmailService implements MessageService {


  @Override
  public void sendMessage(String msg, String rec) {

    System.out.println("Email send to : "+ rec + " with message : "+ msg);

  }
}
