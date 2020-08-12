package com.upgrad.di;

/**
 * Client application
 */
public class Client {

  public static void main(String[] args) {

    MyApplication app = new MyApplication();
    app.process("Hello students" , "abc@gmail.com");
  }
}
