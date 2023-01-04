package dev.vietdo.solid.d.invoice.prior;

import dev.vietdo.solid.d.invoice.Book;
import dev.vietdo.solid.d.invoice.DynamoDbInvoicePersistence;
import dev.vietdo.solid.d.invoice.Invoice;

import java.util.List;

public class InvoiceService {

  private DynamoDbInvoicePersistence dynamoDbInvoicePersistence;

  public InvoiceService(DynamoDbInvoicePersistence dynamoDbInvoicePersistence) {
    this.dynamoDbInvoicePersistence = dynamoDbInvoicePersistence;
  }

  public void checkOutOnWeekend(List<Book> bookList) {
    Invoice invoice = new Invoice(bookList, 0.15, 0.1);
    dynamoDbInvoicePersistence.save(invoice);
  }
}
