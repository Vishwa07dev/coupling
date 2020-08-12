package com.upgrad.di;

public class EmailServiceInjector implements  MessageServiceInjector {
  @Override
  public Sender getSender() {
    return new MyApplication(new EmailService());
  }
}
