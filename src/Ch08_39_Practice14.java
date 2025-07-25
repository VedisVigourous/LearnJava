import java.util.Scanner;
class Employee{
    int salary;
    String name;

    public void getSalary(){
        System.out.println(salary);
        System.out.println();
    }
    public void getname(){
        System.out.println(name);
    }
    public void changesalary(int a){
        salary = a;
    }
    public void setname(String newname){
        name = newname;
    }
}

class Cellphone{
    public void state(String state){
        switch (state){
            case "Available" -> System.out.println("Ringing...");
            case "Busy" -> System.out.println("Can't reach at this moment...");
            case "Off" -> System.out.println("Phone's Switch off...");
            default -> System.out.println("Number Doesn't exist!!!");
        }
    }
}

class Square {
    int side;

    public void perimeter(int side) {
        int perimeter = 4 * side;
        System.out.println("Perimeter is :" + perimeter + "m");
    }

    public void area(int side) {
        int area = side * side;
        System.out.println("Area is :" + area + "m²");
    }
}

class GTACharacter{
    String playerName = "Carl Johnson";

    public void CharMovement(String movement){
        switch (movement) {
            case "W" -> System.out.println("Walking forward...");
            case "S" -> System.out.println("Walking Backwards...");
            case "A" -> System.out.println("Walking Left...");
            case "D" -> System.out.println("Walking Right...");
            case "F" -> System.out.println("Hijacking A Vehicle...");
            case "Shift" -> System.out.println("Running...");
            case "Space" -> System.out.println("Jumping...");
            default -> System.out.println("Enter Valid Movement Key");
        }
    }
}
public class Ch08_39_Practice14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Problem 1
        Employee Emp1 = new Employee();
        Emp1.setname("Vijay");
        Emp1.changesalary(55000);

        Employee Emp2 = new Employee();
        Emp2.setname("Rahul");
        Emp2.changesalary(55300);

        Employee Emp3 = new Employee();
        Emp3.setname("Shikha");
        Emp3.changesalary(65000);

        Employee Emp4 = new Employee();
        Emp4.setname("Mrityunjay");
        Emp4.changesalary(86000);

        Employee Emp5 = new Employee();
        Emp5.setname("Bilal");
        Emp5.changesalary(35000);

        // Accessing Employee list
        System.out.println();
        System.out.println("Employee List: ");

        Emp1.getname();
        Emp1.getSalary();

        Emp2.getname();
        Emp2.getSalary();

        Emp3.getname();
        Emp3.getSalary();

        Emp4.getname();
        Emp4.getSalary();

        Emp5.getname();
        Emp5.getSalary();

        System.out.println();

        // Problem 2
        Scanner callState = new Scanner(System.in);
        Cellphone Vishal = new Cellphone();
        System.out.print("Vishal Connection state: ");String Vishal_State = callState.nextLine();
        Vishal.state(Vishal_State);
        System.out.println();


        Cellphone Ram = new Cellphone();
        System.out.print("Ram Connection state: ");String Ram_State = callState.nextLine();
        Ram.state(Ram_State);
        System.out.println();

        Cellphone Khushi = new Cellphone();
        System.out.print("Khushi Connection state: ");String Khushi_State = callState.nextLine();
        Khushi.state(Khushi_State);
        System.out.println();

        // Square properties
        Square mySquare = new Square();
        System.out.print("Enter the side of Square: "); int givenSide = input.nextInt();
        mySquare.side = givenSide;
        System.out.println("Confirming the side of Square given is: " + mySquare.side);
        mySquare.perimeter(givenSide);
        mySquare.area(givenSide);

        System.out.println();

        // GTA Character Movement
        GTACharacter Char = new GTACharacter();
        System.out.println("Welcome to GTA Character Movement Keys Checker");
        System.out.println("Character name is: " + Char.playerName);
        System.out.print("Enter the desired movement key: "); String key = input.next();
        Char.CharMovement(key);
    }
}
