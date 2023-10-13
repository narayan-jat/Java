// Write a program to create a static variable and show its advantage and limitation.

class Variable1{
	static String name = " Narayan Jat";
}

public class Static{
	public static void main(String[] args){
		// creating multiple objects.
		Variable1 name = new Variable1();
		name.name = " Ratan tata";
		Variable1 name1 = new Variable1();
		name1.name = " Kelash Pati ";	// at the this will be assigned to name variable.
		System.out.println(name.name + " " + name1.name);
	}
}

		