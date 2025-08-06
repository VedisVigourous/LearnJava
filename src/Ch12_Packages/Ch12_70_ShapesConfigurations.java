package Shapes;

import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    void Dimensions(){
        Scanner rectangleDimension = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle(m) - ");
        this.length = rectangleDimension.nextDouble();
        System.out.print("Enter the breadth of Rectangle(m) - ");
        this.breadth = rectangleDimension.nextDouble();
    }

   void Area(){
        System.out.println("Area of Rectangle is: " + (this.length*this.breadth) + " m");
    }

   void Perimeter(){
        System.out.println("Perimeter of Rectangle is: " + 2*(this.length + this.breadth) + " m");
    }
}

class Square extends Rectangle{
    @Override
    void Dimensions(){
        Scanner squareDimension = new Scanner(System.in);
        System.out.print("Enter the side of Square(m) - ");
	this.length = squareDimension.nextDouble();
    }
    
    @Override	
    void Area(){
	System.out.println("Area of Square is: " + (this.length*this.length) + " m");
    }

    @Override
    void Perimeter(){
         System.out.println("Perimeter of Square is: " + 4*(this.length) + " m");
    }
}

class Circle{
    double radius;

    void Dimensions(){
	Scanner squareDimension = new Scanner(System.in);
	System.out.print("Enter the Radius of Circle(m): "); this.radius = squareDimension.nextDouble();
    }

   void Area(){
        System.out.println("Area of Circle is: " + (22*this.radius*this.radius)/7 + " m");
    }

   void Perimeter(){
        System.out.println("Perimeter of Circle is: " + (2*22*this.radius)/7 + " m");
    }
}

class Cylinder extends Circle{
    double height;

    void Dimensions(){
        Scanner cylinderDimension = new Scanner(System.in);
        System.out.print("Enter the radius of Cylinder(m) - ");
        this.radius = cylinderDimension.nextDouble();
        System.out.print("Enter the height of Cylinder(m) - ");
        this.height = cylinderDimension.nextDouble();
    }

   void CurvedSurfaceArea(){
        System.out.println("Curved Surface Area of Cylinder is: " + (2*22*this.radius*this.height)/7 + " m");
    }

   void TotalSurfaceArea(){
        System.out.println("Total Surface Area of Cylinder is: " + ((2*22*this.radius*(this.radius+this.height))/7) + " m");
    }

   void Volume(){
        System.out.println("Volume of Cylinder is: " + (22*this.radius*this.radius*this.height)/7 + " m");
    }
}

class Sphere extends Circle{

    @Override	
    void Dimensions(){
        Scanner sphereDimension = new Scanner(System.in);
        System.out.print("Enter the radius of Sphere(m) - ");
        this.radius = sphereDimension.nextDouble();
    }


   void CurvedSurfaceArea(){
        System.out.println("Curved Surface Area of Sphere is: " + (4*22*this.radius*this.radius)/7 + " m");
    }

   void Volume(){
        System.out.println("Volume of Sphere is: " + (4*22*this.radius*this.radius*this.radius)/21 + " m");
    }
}

	

public class Ch12_70_ShapesConfigurations {
    public static void main(String[] args) {
        System.out.println();

        /* Challenge - Write this code on notepad.

           1. Create package name Shape
           2. Should have individual classes for -
              a. Rectangle
              b. Square
              c. Circle
              d. Cylinder
              e. Sphere
           3. It should use inheritance to manage the code
           4. Include methods like volume , surface area (getters/setters - dimensions).  */

        java.util.Scanner choice = new java.util.Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Choose the Shape for it's Specifications -\n1. Rectangle\n2. Square\n3. Circle\n4. Cylinder\n5.Sphere\nChoice: ");
        int shapeChoice = choice.nextInt();

        System.out.println();

        if (shapeChoice == 1){
            Rectangle obj1 = new Rectangle();
            System.out.println("You've Chosen Rectangle - ");
            obj1.Dimensions(); System.out.println();
            java.util.Scanner specsChoice1 = new java.util.Scanner(System.in);
            System.out.println("Now, Select the specification you want to know:");
            System.out.print("1.Perimeter\n2.Area\nChoice: ");  int choice1 = specsChoice1.nextInt();
            switch (choice1){
                case 1 -> obj1.Perimeter();
                case 2 -> obj1.Area();
                default -> System.out.println("Enter a valid choice");
            }
        }

        else if (shapeChoice == 2){
            Square obj2 = new Square();
            System.out.println("You've Chosen Square - ");
            obj2.Dimensions(); System.out.println();
            java.util.Scanner specsChoice2 = new java.util.Scanner(System.in);
            System.out.println("Now, Select the specification you want to know:");
            System.out.print("1.Perimeter\n2.Area\nChoice: ");  int choice1 = specsChoice2.nextInt();
            switch (choice1){
                case 1 -> obj2.Perimeter();
                case 2 -> obj2.Area();
                default -> System.out.println("Enter a valid choice");
            }
        }

        else if (shapeChoice == 3){
            Circle obj3 = new Circle();
            System.out.println("You've Chosen Circle - ");
            obj3.Dimensions(); System.out.println();
            java.util.Scanner specsChoice3 = new java.util.Scanner(System.in);
            System.out.println("Now, Select the specification you want to know:");
            System.out.print("1.Perimeter\n2.Area\nChoice: ");  int choice1 = specsChoice3.nextInt();
            switch (choice1){
                case 1 -> obj3.Perimeter();
                case 2 -> obj3.Area();
                default -> System.out.println("Enter a valid choice");
            }
        }

        else if (shapeChoice == 4){
            Cylinder obj4 = new Cylinder();
            System.out.println("You've Chosen Cylinder - ");
            obj4.Dimensions(); System.out.println();
            java.util.Scanner specsChoice4 = new java.util.Scanner(System.in);
            System.out.println("Now, Select the specification you want to know:");
            System.out.print("1.Curved Surface Area\n2.Total Surface Area\n3. Volume\nChoice: ");  int choice1 = specsChoice4.nextInt();
            switch (choice1){
                case 1 -> obj4.CurvedSurfaceArea();
                case 2 -> obj4.TotalSurfaceArea();
                case 3 -> obj4.Volume();
                default -> System.out.println("Enter a valid choice");
            }
        }

        else if (shapeChoice == 5){
            Sphere obj5 = new Sphere();
            System.out.println("You've Chosen Sphere - ");
            obj5.Dimensions(); System.out.println();
            java.util.Scanner specsChoice5 = new java.util.Scanner(System.in);
            System.out.println("Now, Select the specification you want to know:");
            System.out.print("1.Curved Surface Area\n2. Volume\nChoice: ");  int choice1 = specsChoice5.nextInt();
            switch (choice1){
                case 1 -> obj5.CurvedSurfaceArea();
                case 2 -> obj5.Volume();
                default -> System.out.println("Enter a valid choice");
            }
        }

        else {
            System.out.println("Enter a correct shape from available list.");
        }

    }
}