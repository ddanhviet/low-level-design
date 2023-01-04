package dev.vietdo.solid.s.invoice.apply;

import dev.vietdo.solid.s.invoice.Book;
import dev.vietdo.solid.s.invoice.apply.Invoice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InvoicePersistence {

  Invoice invoice;

  public InvoicePersistence(Invoice invoice) {
    this.invoice = invoice;
  }

  public void saveToFile(String fileName) throws IOException {
    StringBuilder content = new StringBuilder();
    content.append("---------Invoice--------\n");
    for (Book book: this.invoice.bookList) {
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
        .append(this.invoice.discountRate * 100)
        .append("%");
    content
        .append("Tax Rate: ")
        .append(this.invoice.taxRate * 100)
        .append("%");
    content.append("------------------------");
    content
        .append("Total: $")
        .append(this.invoice.calculateTotal());

    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write(content.toString());

    writer.close();
  }
}
