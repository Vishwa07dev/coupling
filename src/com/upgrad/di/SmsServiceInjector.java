package com.upgrad.di;

public class SmsServiceInjector implements MessageServiceInjector {
  @Override
  public Sender getSender() {
    return new MyApplication(new SmsService());
  }
}
