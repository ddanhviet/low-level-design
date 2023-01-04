package dev.vietdo.solid.i.book.apply;

import dev.vietdo.solid.i.book.BookCover;

public interface Book {

  String getAuthor();

  String getNumberOfPages();

  BookCover getCoverType();
}
