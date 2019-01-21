//Author Uday Dikshit
//Version 1.02
//Purpose Write an application that reads an Integer N, which will denote the number of tyres in the vehicle. You have to create an object of the appropriate class according to the value of N and use it display() function.
//If N = 2, Create a Bike Object.
//If N = 4, Create a Car Object.
//Create a Vehicle Object, otherwise.

import java.util.*;
class Vehichle
{
	public void display()
	{
	System.out.println("This is a Vehichle");
	}
}
class Bike extends Vehichle
{
	public void display()
	{
	System.out.println("This is a Bike");
	}
}
class Car extends Vehichle
{
	public void display()
	{
	System.out.println("This is a Car");
	}
}
class VehichleTest
{
    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of wheels:");
    int option = input.nextInt();
    switch (option)
    {
     case 2:
     Bike obj = new Bike();
     obj.display();
     break;

     case 4:
     Car obj1 = new Car();
     obj1.display();
     break;

     default:
     Vehichle obj2 = new Vehichle();
     obj2.display();
     break;
    }
    }	
}