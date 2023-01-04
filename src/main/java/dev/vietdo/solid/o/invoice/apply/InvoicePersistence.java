package dev.vietdo.solid.o.invoice.apply;

import dev.vietdo.solid.s.invoice.apply.Invoice;

public interface InvoicePersistence {

  public void save(Invoice invoice);
}
