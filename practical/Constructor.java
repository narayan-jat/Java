// creating a box class
class Box{
	// Default costructor.
	public void Box(){
		private double width = 90;
		private double height = 45;
		private double breadth = 47;
	}
	// Constructor with argument.
	public void Box(double width, double height, double breadth){
		private double width = width;
		private double breadth = breadth;
		private double height = height;
	}

	// Accessors.
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getBreadth(){
		return breadth;
	}

	// Setters.
	public void setWidth(double width){
		width = width;
	}
	public void setHeight(double height){
		height = heigth;
	}
	public void setBreadth(double breadth){
		breadth = breadth;
	}

	// Operations on Box.
	public double surfaceArea(){
		return 2 * (width * height + height * breadth + breadth * width);
	}
	public double volume(){
		return width * height * breadth;
	}
}

public class Constructor{
	public static void main(String[] args){
		Box box1 = new Box();
		System.out.println(box1.volume());
		System.out.println(box1.surfaceArea());
}
	
