// main program to drive org chart
public class OrgChart
{
  public static void main(String args[])
  {
    Manager sam=new Manager("S.A.", "Mosley", 17, 42.0, 69, "Swagnician", "Justice");
    Manager koma=new Manager("Alex", "Komarinski", 26, 7.5, 60, "Computer Science Teacher", "Mathematics");
    Employee linex=new Employee("Soffie", "Patel", 14, .0000000000000001, 100, "Janitor");
    Employee kile=new Employee("Kyle", "DisGrace", 15, 7.0, 3, "Boolie");
    Employee nam=new Employee("Naman", "Patel", 14, 7.0, 6, "Pastor");
    linex.setManager(sam);
    kile.setManager(sam);
    nam.setManager(koma);
    System.out.println(sam.toString());
    System.out.println("\t Employee:"+linex.toString());
    System.out.println("\t Employee:"+kile.toString());
    System.out.println(koma.toString());
    System.out.println("\t Employee:"+nam.toString());
  }
}
