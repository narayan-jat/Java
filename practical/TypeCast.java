// write a program to show type-casting of variables.

public class TypeCast{
	public static void main(String[] args){
	// Actual variables.
	int var1 = 89;
	float var2 = 87;
	double var3 = 34;

	var2 = (float) var1; // doing typecasting for reassignment.
	var1 = (int) var3; // doing typecasting for reassignment.
	System.out.println(" the value of new assignment is " + var1 + " " + var2  + " " + var3);
	}
}
