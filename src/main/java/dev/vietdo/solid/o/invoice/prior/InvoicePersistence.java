package dev.vietdo.solid.o.invoice.prior;

import dev.vietdo.solid.s.invoice.apply.Invoice;

public class InvoicePersistence {

  private Invoice invoice;

  public InvoicePersistence(Invoice invoice) {
    this.invoice = invoice;
  }
  public void saveToFile(Invoice invoice) {

  }
  public void saveToDatabase(Invoice invoice) {

  }
}
