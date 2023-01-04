package dev.vietdo.solid.s.invoice;

public class Book {
  public String name;
  public String authorName;
  public int year;
  public double price;
  public String isbn;

  public Book(String name, String authorName, int year, double price, String isbn) {
    this.name = name;
    this.authorName = authorName;
    this.year = year;
    this.price = price;
    this.isbn = isbn;
  }
}
