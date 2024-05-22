package Classeight;


public class Ex11_6Test {
	public static void main(String[] args)

	{

	Ex11_6 instanceA = new Ex11_6();

	Ex11_6 instanceB = new Ex11_6();

	instanceA.a = 8;

	instanceB.b = instanceA.x;

	instanceA.x++;

	instanceB.a = 10;

	instanceB.c = 90;

	instanceB.x++;
	/*System.out.println(instanceA.a);
	System.out.println(instanceA.b);
	System.out.println(instanceA.c);
	System.out.println(instanceA.x);
	System.out.println(instanceB.a);
	System.out.println(instanceB.b);
	System.out.println(instanceB.c);
	System.out.println(instanceB.x);
*/
	System.out.println(instanceA);
	System.out.println(instanceB);
	}

}
