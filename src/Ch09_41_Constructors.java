class studentClass{
    private int roll_no;
    private String name;

    public studentClass(String username){
        roll_no = 43;
        name = username;
    }

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
public class Ch9_41_Constructors {
    public static void main(String[] args) {
        System.out.println();
        // Constructors helps in initialising an object while it is created.
        // That is no need to give values to attributes of object again and again.

        /* Constructor Syntax:
           access_modifier Class_name(){
                attribute = default value you want to give
            }
         */ // That is if attributes are not given a new value , default values will be considered.
//        studentClass ved = new studentClass();
//        System.out.println("Default Name: " + ved.getName());
//        System.out.println("Default Roll No.: " + ved.getRoll_no());
//
//        System.out.println();
//
//        // After setting attributes default value changes
//        ved.setName("Vedant");
//        ved.setRoll_no(45);
//        System.out.println("Name: " + ved.getName());
//        System.out.println("Roll No.: " + ved.getRoll_no());

        // Commented out to run different forms of Constructor

        System.out.println();

        // Giving argument to a constructor:
        studentClass ved = new studentClass("Yug");
        System.out.println(ved.getName()); // Note the argument is now printed in Get Name as default
        System.out.println(ved.getRoll_no());

        // Note just like a method it can also take up as many args u want to give.

        // Also Note: Constructor Overloading is same as Method Overloading
        // That is : Same name and different args

    }
}
