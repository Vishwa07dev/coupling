package com.upgrad.di;

/**
 * Client application
 */
public class Client {

  public static void main(String[] args) {

    String msg = "Hi Students";
    String email = "abc@xyz.com";
    String phone = "9176239912";

    MessageServiceInjector injector = null ;

    Sender app = null ;

    injector = new EmailServiceInjector();

    app = injector.getSender();
    app.processMessage(msg,email);

    injector = new SmsServiceInjector();

    app = injector.getSender();
    app.processMessage(msg,phone);
  }
}
