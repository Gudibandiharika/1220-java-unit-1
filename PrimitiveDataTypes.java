import java.util.Scanner;
public class PrimitiveDataTypes
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		byte x;
		x=sc.nextByte();
		System.out.print("Enter the byte value : ");
		short y;
		y=sc.nextShort();
		System.out.print("Enter the short value : ");
		int z;
		z=sc.nextInt();
		System.out.print("Enter the int value : ");
		long l;
		l=sc.nextLong();
		System.out.print("Enter the long value : " );
		boolean b;
		b=sc.nextBoolean();
		System.out.print("Enter the boolean value : ");
		double d;
		d=sc.nextDouble();
		System.out.print("Enter the double value : ");
		float f;
		f=sc.nextFloat();
		{
			System.out.println("Enter the float value : ");
			System.out.println("byte value = " +x);
			System.out.println("short value = " +y);
			System.out.println("int value = " +z);
			System.out.println("long value = " +l);
			System.out.println("boolean value = " +b);
			System.out.println("double value = " +d);
			System.out.println("float value = " +f);
		}
	}
}