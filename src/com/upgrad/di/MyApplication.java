package com.upgrad.di;

/**
 * Main application code.
 */
public class MyApplication  implements Sender{


  private MessageService messageService ;

  public MyApplication(MessageService messageService){
    this.messageService= messageService;
  }

  @Override
  public void processMessage(String message, String rec) {
    messageService.sendMessage(message,rec);

  }
}
