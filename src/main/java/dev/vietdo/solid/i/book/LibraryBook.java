package dev.vietdo.solid.i.book;

import java.time.OffsetDateTime;

public interface LibraryBook {

  void checkOut(String borrowerName);

  void checkIn();

  OffsetDateTime getDueDate();

  String getAuthor();

  String getTitle();

  String getNumberOfPages();

  BookCover getCoverType();
}
