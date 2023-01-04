package dev.vietdo.solid.l.employee.apply;

import dev.vietdo.solid.l.employee.prior.Employee;

import java.util.List;

public interface Supervisor {

  public List<Employee> getDirectReports();
}
