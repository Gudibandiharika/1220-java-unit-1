class ProgramStructure //class name should follow naming conventions
{
	int id; //variables and methods
	String name;
	String gender;
	void read()
	{
		System.out.println("I will Read");
	}
	void write()
	{
		System.out.println("I will Write");
	}
	public static void main(String args[]) //code will run from here
	{
		ProgramStructure p=new ProgramStructure(); // object creation
		p.id=1220;
		p.name="G.Harika";
		p.gender="Female";
		System.out.println(+p.id); //prints 1220
		System.out.println(p.name); //prints name
		System.out.println(p.gender); //prints gender
		p.read(); //prints I will read
		p.write(); // prints I will write
	}
}