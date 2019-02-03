//Author Uday Dikshit
//Version 1.2.2
//Purpose Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class constructor.

class BaseException extends Exception{
class Base {
    Base() throws BaseException {
        throw new BaseException();
    }
}

class Derived extends Base {
    Derived() throws BaseException {
        super();
    }
}

public class exception7 {
    public static void main(String[] args) {
        try {
            Derived d = new Derived();
    } catch(BaseException e) {
            System.out.println("BaseException caught in main()");
        }
            
    }
}
}