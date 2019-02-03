//Author Uday Dikshit
//Version 2.03
//Purpose Definition of Done:
//a)	The class definitions are defined as per the class diagram.
//b)	Each class definition is stored in its own .java file.
//c)	Base class constructors are invoked using super keyword
//d)	Function overriding is applied to define inherited function toString

import java.util.*;
class point2D
{   Scanner input = new Scanner(System.in);
	float x;
	float y;
    point2D()
    {
     float x = 0.0f;
     float y = 0.0f;
    }
    /*point2D(point2D d)
    {
    x = d.x;
    y = d.y;
    }*/
    point2D(float x, float y)
    {
    this.x=x;
    this.y=y;
    }
    void setx()
    {
    System.out.println("Enter the value of x: ");
    float x = input.nextFloat();
    }
    float getx()
    {
     return x;
    }
    void sety()
    {
    System.out.println("Enter the value of y: ");
    float y = input.nextFloat();
    }
    float gety()
    {
     return y;
    }
    public String toString()
    {
    return x+""+y;
    }
}