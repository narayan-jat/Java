// Write a program to create constant and show its limitation.

public class Constant{
	public static void main(String[] args){
		final int MAX = 500; // creating a constant.

		// Follwing code is showing it's limitation. 
		MAX  = 1000; // generate an error

		// can be used further for many processes bur can not be reassinged.
	}
}	