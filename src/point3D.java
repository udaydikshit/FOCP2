//Author Uday Dikshit
//Version 2.03
//Purpose Definition of Done:
//a)	The class definitions are defined as per the class diagram.
//b)	Each class definition is stored in its own .java file.
//c)	Base class constructors are invoked using super keyword
//d)	Function overriding is applied to define inherited function toString

import java.util.*;
class point3D extends point2D
{
	float z;
	Scanner input = new Scanner(System.in);
	point3D()
	{
	float z;
	}
	/*point3D(point3D d1)
	{
	x = d1.x;
	y = d1.y;
	z = d1.z;
	}*/
	point3D(float x, float y, float z)
	{
	super();
	this.z=z;
	}
	void setz()
	{
	System.out.println("Enter the value of z: ");
	float z = input.nextFloat();
	}
	float getz()
	{
		System.out.println(z);
	return z;
	}
	public String toString()
    {
    	System.out.println( x+""+y+""+z);
    return x+""+y+""+z;
    }
}