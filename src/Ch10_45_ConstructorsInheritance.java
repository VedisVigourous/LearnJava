class Animal{
    int Day;

    public Animal() {
        System.out.println("Animal Props:");
    }
    public Animal(int a){
        System.out.println("Sno. of Animal is: " + a);
    }
    Animal(int b , int c){
        System.out.println("Token No: " + b);
        System.out.println("Lot No: " + c);
    }

    public int getDay() {
        System.out.print("Day of animal check is: ");
        return Day;
    }

    public void setDay(int age) {
        this.Day = age;
    }
}

class Dog extends Animal{
    int age1;
    String lot;
    String Animal;

    public Dog(){
//        super(78); // Specifying the constructor to use in original Class
        super(54,3); // Only one super can be used hence commented the first one
        System.out.println("Animal here is a Dog");
    }
    Dog(int z){
        System.out.println("Lot No of Family is: " + z);
    }

    public int getAge1() {
        System.out.print("Animals age is: ");
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}

class Cat extends Dog{
    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    int Sno;
    Cat(){
        super(63); //Calling overloaded constructor of Dog class
        System.out.println("Animal here is a cat of the family of Dog");
    }
    Cat(int age){
        System.out.println("Age of New Cat from Dog's family is: " + age);
    }
}
public class Ch10_45_ConstructorsInheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(78);
        myAnimal.setDay(8);
        System.out.println(myAnimal.getDay());

        System.out.println();

        Dog myDawg = new Dog();
        myDawg.setAge1(7);
        System.out.println(myDawg.getAge1());

        // Note even on calling Inherited class , the constructor from the original class will be revoked.
        // If derived class also contains a constructor , it will run after the base class's constructor

        // If a base class has overloaded constructor , we will need to specify the constructor we want to use
        // We will specify this using super() keyword (Check line 33)

        // And to use Dog's overloaded constructor we will simply use variable in object making (check line 58)
        System.out.println();

        Cat myCat = new Cat(2); // Getting second constructor of Cat class
        myCat.setSno(53);
        System.out.println("Cat's Sno is: " + myCat.getSno());
        System.out.println("******");

        /* In a nutshell today's lecture is:
           1. If a parent class contains a constructor and we derive another class from it
           2. On running the daughter class , it will print constructor of the parent class
           3. But if a parent class contains overloaded constructor we will need to use the super() keyword
           4. Along with specified variables to help code choose which constructor to use
           5. Also on making object of a class we can specify the constructor by putting the right variables. */
    }
}
