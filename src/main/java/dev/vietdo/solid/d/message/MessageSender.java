package dev.vietdo.solid.d.message;

public interface MessageSender {

  void sendAsync(String message);

  void scheduleMessage(String message);
}
