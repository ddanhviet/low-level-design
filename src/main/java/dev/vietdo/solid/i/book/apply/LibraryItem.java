package dev.vietdo.solid.i.book.apply;

import java.time.OffsetDateTime;

public interface LibraryItem {

  void checkOut(String borrowerName);

  void checkIn();

  OffsetDateTime getDueDate();

  String getTitle();
}
