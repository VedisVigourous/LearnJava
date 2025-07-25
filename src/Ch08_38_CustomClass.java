// Similar syntax to Scanner module etc.
                                /* Class can be made by :- class class_name(){
                                                              Attributes
                                                              Custom methods
                                                           }

                                      Can be accessed by Class_name variable = new Class_name();
                                      and then calling the attributes or directly the custom method
                                      Attributes can be later on allocated by:
                                      variable.attribute = allocation   */

class Student{      //Note: Public is not added because a code can have only one public class
    String name; // Custom Attribute 1
    int Roll_No; // Custom Attribute 2
    int fees_due; // Custom Attribute 3
    // Writing a method in our custom class
    public void stud_detail(){
        System.out.println("Student's name is: " + name);
        System.out.println("Student's Roll No. is: " + Roll_No);
    }
    public int get_fees_dues(){
        return fees_due;
    }
}
public class Ch8_38_CustomClass {
    public static void main(String[] args) {
        System.out.println(" "); // Main Attribute 1
        System.out.println("Below mentioned is Student's Detail:"); // Main Attribute 2

        // Any real world object consist of two things - 1. Properties (Specifications) and 2.Behaviour (Work done)
        //Similarly An object in a class consist of - 1.Attributes (Properties) and 2.Methods (Behaviour)

        // Accessing Class and setting Attributes
        Student Stud1 = new Student();
        Stud1.name = "Vedant";
        Stud1.Roll_No = 212096;
        Stud1.fees_due = 0;

        // Printing the Attributes
        System.out.println(Stud1.name);
        System.out.println(Stud1.Roll_No);
        System.out.println(" ");

        // Accessing the custom method
        Stud1.stud_detail();
        System.out.println(Stud1.get_fees_dues());
        System.out.println();

        // We can make as many variables we want:
        Student Stud2 = new Student();
        Stud2.name = "Rahul";
        Stud2.Roll_No = 212085;
        Stud2.fees_due = 12000;
        Stud2.stud_detail();
        System.out.println(Stud2.get_fees_dues());
        System.out.println();

        Student Stud3 = new Student();
        Stud3.name = "Roshni";
        Stud3.Roll_No = 212188;
        Stud3.fees_due = 80000;
        Stud3.stud_detail();
        System.out.println(Stud3.get_fees_dues());
        System.out.println();
    }
}

