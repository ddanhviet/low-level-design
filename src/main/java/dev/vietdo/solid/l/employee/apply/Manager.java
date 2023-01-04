package dev.vietdo.solid.l.employee.apply;

import dev.vietdo.solid.l.employee.prior.Employee;

import java.util.List;

public class Manager implements Supervised, Supervisor {

  public Employee manager;
  public List<Employee> staffList;
  @Override
  public Employee getSupervisor() {
    return this.manager;
  }

  @Override
  public List<Employee> getDirectReports() {
    return this.staffList;
  }
}
