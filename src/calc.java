import java.util.*;
class calc
{
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	double x,y,ans;
	System.out.println("Enter first number: ");
	x = input.nextDouble();
	System.out.println("Enter Second number: ");
    y=input.nextDouble();
    ans=x+y;
    System.out.println("Answer= " +ans);
	}
}
