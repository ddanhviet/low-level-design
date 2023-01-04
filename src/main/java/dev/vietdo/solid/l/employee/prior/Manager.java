package dev.vietdo.solid.l.employee.prior;

import dev.vietdo.solid.l.employee.prior.Employee;

import java.util.List;

public class Manager extends Employee {

  public List<Employee> staffList;

  public List<Employee> getDirectReports() {
    return this.staffList;
  }

  public void provideStaffPerformanceReviews() {

  }
}
