class cylinder{
    int radius;
    int height;

    // Using Shortcut trick of IntelliJ idea


    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
    }public double Volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Ch09_43_Practice15 {
    public static void main(String[] args) {
        System.out.println();

        // Problem 1-
        System.out.println("Problem1:");
        cylinder myCylinder = new cylinder(45,20);
//        myCylinder.setHeight(20); // Commented in order to use Constructor
//        myCylinder.setRadius(45); // Commented in order to use Constructor
        System.out.println("Height is: " + myCylinder.getHeight() + "cm");
        System.out.println("Radius is: " + myCylinder.getRadius() + "cm");

        System.out.println();

        // Problem 2-
        System.out.println("Surface area and Volume");
        System.out.println("Surface Area: " + myCylinder.surfaceArea() + " m²");
        System.out.println("Volume: " + myCylinder.Volume() + " m³");

        // Problem 3
        // Using Constructor now

    }
}
