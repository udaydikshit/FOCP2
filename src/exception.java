class Exception
{
	public static void main(String args[])
	{
	   try
	   {
	      String s = "Hello";
	      int x= Integer.parseInt(s);
	   }
	   catch(NumberFormatException e)
	   {   
	       System.out.println(e);
           
	   }
	   System.out.println("Rest of the CODE");
	}
}
