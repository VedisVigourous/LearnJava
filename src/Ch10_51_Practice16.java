import java.util.Scanner;
public class Ch10_51_Practice16 {
	
	static class Circle{
		Scanner input = new Scanner(System.in);
		float radius1;
		
		Circle(){
		System.out.print("What will be the radius of Circle: "); this.radius1 = input.nextFloat();
		}
		
		public void Area(){
			System.out.println("\nArea of Circle: " + (22* this.radius1 * this.radius1)/7);
		}
	}
	
	static class Cylinder extends Circle{
		float radius2;
		float height;
		
		Cylinder(){
			Scanner input = new Scanner(System.in);
			System.out.print("\nWhat will be the radius of Cylinder: "); this.radius2 = input.nextFloat();
			System.out.print("What will be the height of Cylinder: "); this.height = input.nextFloat();
		}
		public void Volume(){
			float vol = (22*this.radius2*this.radius2*this.height)/7;
			System.out.println("Volume of Cylinder is: " + vol);
		}
	}
	
	//**************************
	
	static class Rectangle{
		double length;
		double breadth;
		
		Rectangle(double l , double b){
			this.length = l;
			this.breadth = b;
		}
		
		void getlength(){
			System.out.println("Lenght is set to: " + this.length);
		}
	
void getbreadth(){
			System.out.println("Breadth is set to: " + this.breadth);
		}
		
		void AreaRectangle(){
		System.out.println("Area of rectangle: " + this.length*this.breadth);
	}
	}
	
	static class Cuboid extends Rectangle{
		double height;
		
		Cuboid(double l1 , double b1 , double h){
			super(l1,b1);
			this.height = h;
		}
		
		void getheight(){
			System.out.println("Height is set to: " + this.height);
		}
		
		void Volume(){
			System.out.println("Volume of Cuboid: " + this.length*this.breadth*this.height);
		}
	}
	
	public static void main(String[] args) {
		System.out.println();
		
		// Q1. Creating a class circle and inheriting it to Cylinder
		Cylinder obj = new Cylinder();
		obj.Area();
		obj.Volume();
		
		System.out.println();
		
		// Q2. Create a class Rectangle and using inheritance create a class Cuboid
		Cuboid obj1 = new Cuboid(12.87,13.78,7.8);
		obj1.getlength();
		obj1.getbreadth();
		obj1.getheight();
		System.out.println();
		obj1.AreaRectangle();
		obj1.Volume();
		
	}
}