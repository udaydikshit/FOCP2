class exceptiondemo
{
public static void main(String args[])
{
	int i,j,k=0;
	i=8;
	j=0;
	try{
	k=i/j;
	}
	catch(ArithmeticException e){
	System.out.println("Cannot be divided by zero");
	}
	finally{
	System.out.println(k);
}
}
}