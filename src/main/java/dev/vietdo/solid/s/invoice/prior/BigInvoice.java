package dev.vietdo.solid.s.invoice.prior;

import dev.vietdo.solid.s.invoice.Book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BigInvoice {
  List<Book> bookList;
  double discountRate;
  double taxRate;

  public BigInvoice(List<Book> bookList, double discountRate, double taxRate) {
    this.bookList = bookList;
    this.discountRate = discountRate;
    this.taxRate = taxRate;
  }

  public double calculateTotal() {
    double fullTotal = bookList.stream().mapToDouble(book -> book.price).sum();
    double priceAfterDiscount = fullTotal * (1 - discountRate);
    return priceAfterDiscount * (1 + taxRate);
  }

  public void print() {
    System.out.println("---------Invoice--------");
    bookList.forEach(book ->
      System.out.println(book.name + " - " + book.authorName + " $" + book.price));
    System.out.println("------------------------");
    System.out.println("Discount Rate: " + discountRate * 100 + "%");
    System.out.println("Tax Rate: " + taxRate * 100 + "%");
    System.out.println("------------------------");
    System.out.println("Total: $" + this.calculateTotal());
  }

  public void saveToFile(String fileName) throws IOException {
    StringBuilder content = new StringBuilder();
    content.append("---------Invoice--------\n");
    for (Book book: bookList) {
      content
          .append(book.name)
          .append(" - ")
          .append(book.authorName)
          .append(" $")
          .append(book.price)
          .append("\n");
    }
    content.append("------------------------");
    content
        .append("Discount Rate: ")
        .append(discountRate * 100)
        .append("%");
    content
        .append("Tax Rate: ")
        .append(taxRate * 100)
        .append("%");
    content.append("------------------------");
    content
        .append("Total: $")
        .append(this.calculateTotal());

    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(content.toString());

    writer.close();
  }
}
