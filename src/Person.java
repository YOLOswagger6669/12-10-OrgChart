// Super Class to represent a person
public class Person
{
  private String first;
  private String last;
  private int age;
  public Person()
  {
    first=null;
    last=null;
    age=0;
  }
  public Person(String one, String a, int old)
  {
    first=one;
    last=a;
    age=old;
  }
  public String getFirstName()
  {
    return first;
  }
  public String getLastName()
  {
    return last;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    return last+", "+first;
  }
  public void recordBirthday()
  {
    age++;
  }
}
