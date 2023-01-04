package dev.vietdo.solid.d.invoice;

import dev.vietdo.solid.d.invoice.Invoice;

public interface InvoicePersistence {

  public void save(Invoice invoice);
}
