//Author Uday Dikshit
//Version 1.020
//Purpose Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.
class exception4
{
    public static void main(String args[])
    {
        String a;
        try
        { 
            a=null;
            System.out.println(a.toString());
        }
        catch(NullPointerException e)
        {
         System.out.println("a can't be null");   
        }
    }
}