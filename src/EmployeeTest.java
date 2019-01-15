// Author: Uday Dikshit
// Version: 1.12
// Purpose: 4.	Create a class Employee that includes the following: name, year of joining, salary, address. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities by displaying the output. 
import java.util.*;
class Employee{
	String FirstName()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your First name here: ");
    String FirstName = input.nextLine();
	return FirstName;
	}
	String LastName()
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your Last name here: ");
    String LastName = input.nextLine();
	return LastName;
	}
	double Salary()
	{
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your yearly Salary here: ");
     double Salary = input.nextDouble();
     if(Salary<0)
     {
     	System.out.println("Please enter your salary Again");
     	  double Salary_again  = input.nextDouble();
     	  Salary_again=Salary_again + 0.1*Salary_again;
     	  Salary = Salary_again;
     	  return Salary;
     }
     else
     {
     	Salary=Salary + 0.1*Salary;
     }
     return Salary;
	}
	public void display(String FirstName, String LastName, double Salary)
	{
	System.out.println("First Name - " +FirstName);
	System.out.println("Last Name - " +LastName);
	System.out.println(" Yearly Salary after raise  - " +Salary);
	}
}
class EmployeeTest
{
	public static void main(String args[]){
	String FirstName,LastName;
	double Salary;
	Employee EmployeeObject = new Employee();
	EmployeeObject.display(EmployeeObject.FirstName(), EmployeeObject.LastName(), EmployeeObject.Salary());
	}
}