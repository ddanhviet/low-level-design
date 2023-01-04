package dev.vietdo.solid.l.employee.prior;

public abstract class Employee {

  public String firstName;
  public String lastName;

  public Employee manager;
  public double salary;

  public double bonusRate;

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public Employee getManager() {
    return this.manager;
  }

  public double getSalary() {
    return this.salary;
  }

  public double getBonusRate() {
    return this.bonusRate;
  }
}
