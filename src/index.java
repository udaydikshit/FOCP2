//Author Uday Dikshit
//Version 1.23
//Purpose To create a java program to find index of a element in an array
import java.util.Arrays;
import java.util.Scanner;
public class index {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=s.nextInt();
int check;
int[] arr=new int[n];
int i;
for (i = 0; i < arr.length; i++) {
System.out.println("Enter the "+(i+1)+" number");
arr[i]=s.nextInt();
}
System.out.println("Enter the number to find index");
check=s.nextInt();
System.out.println("Index is/are ");
for (i = 0; i < arr.length; i++)
{
if (arr[i]==check)
System.out.println(i);
}
}
}