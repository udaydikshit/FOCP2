//Author Uday Dikshit
//Version 1.203
//Purpose 1.	Write a program in java that illustrates the following exceptions:
//a)    ArithmeticException
//c)    NumberFormatException
//d)   NullPointerException
//e)    IllegalArgumentException
//f)    IoException  // to be done in file handling

import java.util.*;
class exception1{
public static void main(String args[])
{
	int[] a = new int[5];
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] = 4;
	a[4] = 5;
	//a[5] = 6;
	String s;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your name:");
	s =input.nextLine();
	try{
		
	a[0] = 30/0;
	a[10] = 1;
	System.out.println(a[10]);
	s=null;
	
	}
	catch(ArithmeticException e)
	{
	System.out.println("array element here cannot be divided by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("mind the array length");
	}
	catch(NullPointerException e)
	{
	System.out.println("Name is a mandatory field");
	}
	finally
	{
	System.out.println(a[0]);
	System.out.println(s);
	}
}}