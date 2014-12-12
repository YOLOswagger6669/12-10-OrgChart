// class to represent a manager - inherits Emplyee
public class Manager extends Employee
{
  private ArrayList<Employee> directReports=new ArrayList<Employee>();
  String department;
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
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
