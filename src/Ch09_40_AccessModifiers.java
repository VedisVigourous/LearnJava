class schoolStudent{
    int roll_no;
    String name;
}
class schoolStudent1{
    private int roll_no;
    private String name;

    // Setter
    public void setName(String n) {
        name = n;
    }

    public void setRoll_no(int rn) {
        roll_no = rn;
    }

    // Getter
     public String getName(){
        return name;
     }

    public int getRoll_no(){
        return roll_no;
    }
}

class CircleProps{
    private float radius;
    private float perimeter;
    private float area;

    public void setRadius(int rad) {
        radius = rad;
    }
    public void setPerimeter(float p) {
        if (p == 6*radius){
            perimeter = p;
            System.out.println("Correct Perimeter Entered");
        }
        else {
            System.out.println("Wrong Perimeter entered");
        }
    }
    public void setArea(float a) {
        if (a == 3*(radius*radius)){
            area = a;
            System.out.println("Correct Area Entered");
        }
        else {
            System.out.println("Wrong area entered");
        }
    }

    public float getRadius() {
        return radius;
    }
}

public class Ch09_40_AccessModifiers {
    public static void main(String[] args) {
        System.out.println();

        /* Access Modifiers - specifies where an Attributes or a method is accessible.
           That is whether if a file is inherited , will method from the earlier files be used or not.
           These are of four types - 1. Private
                                     2. Default
                                     3. Protected
                                     4. Public */

        //Private:
        schoolStudent Student1 = new schoolStudent();
        Student1.name = "Vedant";
        Student1.roll_no = 212096;
        System.out.println("Name of Student is: " + Student1.name);
        System.out.println("Roll No. of Student is: " + Student1.roll_no);

        System.out.println();

        // Note there are no error in this code but if we replicate with attributes being Private.

        schoolStudent1 Student2 = new schoolStudent1();
        //Student2.name = "Vedant";  // As the attributes are set to private
        //Student2.roll_no = 212096; // They Cannot be accessed directly, we need to use Getters and Setters method.

        //The use of Getter and Setters are that it helps the attributes to remain private and can only be accessed
        // using methods hence no breaching of data.
        // Shortcut to automatically make Getter and Setter is : Code>Generate>Getter and Setters

        Student2.setName("Vedant");
        Student2.setRoll_no(212096); // Data set without changing the original attributes

        System.out.println("Student's name: " + Student2.getName());
        System.out.println("Student's Roll No: " + Student2.getRoll_no()); // Data printed
        System.out.println();

                                                    // ******** \\

        // Quiz - Circle
        CircleProps Circle = new CircleProps();
        Circle.setRadius(6);
        System.out.println("Radius of Circle: " + Circle.getRadius());
        Circle.setPerimeter(36);
        Circle.setArea(107);


    }
}
