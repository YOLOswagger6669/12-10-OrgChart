// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private String jobTitle;
  private Double hourlyWage;
  private int hoursWorked;
  private Manager manager;
  public Employee(double wage, int hours, String one, String a, int old, String job)
  {
    super(one, a, old);
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=job;
  }
  public String getName()
  {
    return super.toString();
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hoursWorked*hourlyWage;
  }
  public double getYearlySalary()
  {
    return 52*getWeeklySalary();
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    return super.toString()+": "+jobTitle+" @ "+getYearlySalary();
  }
  public Manager getManager()
  {
    return manager;
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }
  public void setManager(Manager newManager)
  {
    if(manager!=null)
    {
      manager.removeDirectReport(this);
    }
    manager=newManager;
    manager.addDirectReport(this);
  }
}
