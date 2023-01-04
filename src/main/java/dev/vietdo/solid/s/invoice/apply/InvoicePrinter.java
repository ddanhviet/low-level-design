package dev.vietdo.solid.s.invoice.apply;

import dev.vietdo.solid.s.invoice.apply.Invoice;

public class InvoicePrinter {

  Invoice invoice;

  public InvoicePrinter(Invoice invoice) {
    this.invoice = invoice;
  }

  public void print() {
    System.out.println("---------Invoice--------");
    this.invoice.bookList.forEach(book ->
        System.out.println(book.name + " - " + book.authorName + " $" + book.price));
    System.out.println("------------------------");
    System.out.println("Discount Rate: " + this.invoice.discountRate * 100 + "%");
    System.out.println("Tax Rate: " + this.invoice.taxRate * 100 + "%");
    System.out.println("------------------------");
    System.out.println("Total: $" + this.invoice.calculateTotal());
  }
}
