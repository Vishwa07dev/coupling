package com.upgrad.di;

public class SmsService implements MessageService {
  @Override
  public void sendMessage(String msg, String rec) {
    System.out.println("sms send to : "+ rec + " with message : "+ msg);
  }
}
