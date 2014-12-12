// class to represent a manager - inherits Emplyee
import java.util.*;
public class Manager extends Employee
{
  private ArrayList<Employee> directReport=new ArrayList<Employee>();
  private String department;
  public Manager(String one, String a, int old, double wage, int hours, String job, String dep)
  {
    super(one, a, old, wage, hours, job);
    department=dep;
  }
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReport;
  }
  public String toString()
  {
    return "manager: "+super.toString();
  }
  public void addDirectReport(Employee employee)
  {
    directReport.add(employee);
  }
  public void removeDirectReport(Employee employee)
  {
    directReport.remove(employee);
  }
  public void setDepartment(String dept)
  {
    department=dept;
  }
}
