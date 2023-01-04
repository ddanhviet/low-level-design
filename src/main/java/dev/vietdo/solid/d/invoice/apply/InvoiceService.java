package dev.vietdo.solid.d.invoice.apply;

import dev.vietdo.solid.d.invoice.Book;
import dev.vietdo.solid.d.invoice.Invoice;
import dev.vietdo.solid.d.invoice.InvoicePersistence;

import java.util.List;

public class InvoiceService {

  private InvoicePersistence invoicePersistence;

  public InvoiceService(InvoicePersistence invoicePersistence) {
    this.invoicePersistence = invoicePersistence;
  }

  public void checkOutOnWeekend(List<Book> bookList) {
    Invoice invoice = new Invoice(bookList, 0.15, 0.1);
    invoicePersistence.save(invoice);
  }
}
