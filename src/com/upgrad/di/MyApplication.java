package com.upgrad.di;

/**
 * Main application code.
 */
public class MyApplication {

  /**
   * Any issue with below ?
   */
  EmailService emailService = new EmailService();

  public void process(String str , String rec){
    emailService.sendEmail(str,rec);
  }
}
