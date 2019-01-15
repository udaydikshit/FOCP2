// Author: Uday Dikshit
// Version: 1.11
// Purpose: Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. If the monthly salary is not positive, ask the user to re-enter a positive value. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
import java.util.*;
class Employee2
{
	String Name()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your name here: ");
    String Name = input.nextLine();
	return Name;
	}
	double Year(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your Year of joining here: ");
    double Year = input.nextDouble();
	return Year;
	}
	double Salary()
	{
	Scanner input = new Scanner(System.in);
     System.out.println("Enter your yearly Salary here: ");
     double Salary = input.nextDouble();
     return Salary;
	}
	String Address()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Address here: ");
    String Address = input.nextLine();
	return Address;
	}
	public void display(String Name, double Year, double Salary, String Address)
	{
	System.out.print("Name");
	System.out.print("   ");
	System.out.print("Year of joining");
	System.out.print("   ");
    System.out.print("Salary");
    System.out.print("   ");
	System.out.print("Address");
	System.out.println("   ");
	System.out.print(Name);
	System.out.print("   ");
	System.out.print(Year);
	System.out.print("   ");
	System.out.print(Salary);
	System.out.print("   ");
	System.out.print(Address);
	System.out.print("   ");
	}
}
class EmployeeTest2
{
	public static void main(String args[]){
	String Name, Address;
	double Year, Salary;
	Employee2 EmployeeObject = new Employee2();
	EmployeeObject.display(EmployeeObject.Name(), EmployeeObject.Year(), EmployeeObject.Salary(), EmployeeObject.Address());
	}
}
