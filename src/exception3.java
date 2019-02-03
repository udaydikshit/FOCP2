//Authot Uday Dikshit
//version 1.001
//Purpose Create a class with a main( ) that throws an object of class Exception inside a try block. Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument. Add a finally clause and print a message to prove you were there.
import java.io.FileNotFoundException;
 
public class exception3 {
    exception3(String msg) {
        msg = "this is bound to execute";
        System.out.println(msg);
    }
 
    public static void main(String[] args) throws Exception {
        try {
            // Suppose here you are looking for any resource for eg.File
            // If program is unable to find file
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new Exception("File not found");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            // This block will get get executed whether exception occures or
            // not.
            System.out.println("i will get printed");
        }
 
    }
}
