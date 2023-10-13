// Write a program to differentiate between local variables and other instance variables.

public class Variable{
	int x = 283;

	public static void main(String[] args){
		for (int i = 0; i < 5; i++){
			// Here i is a local variable.
			System.out.println("the local varible values are:" + i);
		Variable ins1 = new Variable(); // this is an instance variable.
		System.out.println("instance variable is " + ins1);
		}
	}
}
		
	