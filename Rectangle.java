// Problem Statement: defines class which has a method to calculate the area of the Rectangle.

public class Rectangle {
	public static void main(String[] args){
		int length = 89;
		float breadth = 89;
		System.out.println("Area of the rectangle is : ");
		double area = calculateRectangleArea(length, breadth);
		System.out.println(area);
		
	}

	public static double calculateRectangleArea(double length, double breadth) {
		return length * breadth;
	}
}
	
	
			