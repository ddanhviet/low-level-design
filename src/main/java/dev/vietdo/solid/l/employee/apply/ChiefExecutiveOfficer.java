package dev.vietdo.solid.l.employee.apply;

import dev.vietdo.solid.l.employee.prior.Employee;

import java.util.List;

public class ChiefExecutiveOfficer implements Supervisor {

  public List<Employee> staffList;

  public void proposeOperationalPlan() {

  }

  public void finalizeOperationalPlan() {

  }

  public void meetBoardOfDirectors() {

  }
  @Override
  public List<Employee> getDirectReports() {
    return this.staffList;
  }
}
