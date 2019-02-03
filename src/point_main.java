//Author Uday Dikshit
//Version 2.03
//Purpose Definition of Done:
//a)	The class definitions are defined as per the class diagram.
//b)	Each class definition is stored in its own .java file.
//c)	Base class constructors are invoked using super keyword
//d)	Function overriding is applied to define inherited function toString


class point_main
{
	public static void main(String args[])
	{ String x,y,z;
	//float x;
		//float y;
		//float z;
	 point2D d = new point2D();
	 d.setx();
	 d.sety();
	 d.toString();
	 point3D d1 = new point3D();
	 d1.setz();
    // d1.toString();
     System.out.print("Point is:");
     d1.toString();
     //System.out.print(" ");
     //System.out.print(x);
     //System.out.print(" ");
     //System.out.print(y);
     //System.out.print(" ");
     //System.out.print(z);
	}
}