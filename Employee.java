class Basic
{
 int salary=43000;
 String c_name="Enosis";

String message(){return ("This is default method");}
}

class Employee extends Basic
{
public static void main(String [] args)
{
//Basic b = new Basic();
Employee m = new Employee (); 
System.out.println("The basic salary is:"+m.salary);
System.out.println(m.message());
}

}