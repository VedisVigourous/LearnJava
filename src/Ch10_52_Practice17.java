public class Ch10_52_Practice17 {
    
    static class Person{
        private String name;
        private int age;
        
        public Person(String name , int age){ // Constructor 1 initializes property
            this.name = name;
            this.age = age;
        }
        
        public void displayInfo(){ // First method of class
            System.out.println("Name of person: " + this.name);
            System.out.println("\nAge of person: " + this.age);
        }
    }
        
        static class Student extends Person{ // Inherited class 1
            private String studentId;
            
            public Student(String name1 , int age1 , String studentId){ // Constructor 2 to call and initialize new property
                super(name1 , age1); // Calls Constructor 1 
                this.studentId = studentId;
            }
            @Override
            public void displayInfo(){ // Overridden method calls original method and display new property
                super.displayInfo();  // calling original method
                System.out.println("\nStudent ID : " + this.studentId);
            }
        }
    
    // Upcoming inherited class contains the same DNA just a step more...
    
    static class Professor extends Student{ 
        private String department;
        
        Professor(String name2 , int age , String StudentId1 ,String department){
            super(name2,age,StudentId1);
            this.department = department;
        }
        @Override
        public void displayInfo(){
            super.displayInfo();
            System.out.println("\nProfessor In-Charge: " + this.department);
        }
    }
    
    //**************************
    
    public static void main(String[] args) {
        System.out.println();
        // Q - Basic heirarchy and super keyword
        Professor object = new Professor("VEDANT" , 18 , "VED897CSE" , "Mr. Sunil");
        object.displayInfo();
        
        System.out.println("\n***********");
        
    }
}