package dev.vietdo.solid.s.invoice.apply;

import dev.vietdo.solid.s.invoice.Book;

import java.util.List;

public class Invoice {
  public List<Book> bookList;
  public double discountRate;
  public double taxRate;

  public Invoice(List<Book> bookList, double discountRate, double taxRate) {
    this.bookList = bookList;
    this.discountRate = discountRate;
    this.taxRate = taxRate;
  }

  public double calculateTotal() {
    double fullTotal = bookList.stream().mapToDouble(book -> book.price).sum();
    double priceAfterDiscount = fullTotal * (1 - discountRate);
    return priceAfterDiscount * (1 + taxRate);
  }
}
