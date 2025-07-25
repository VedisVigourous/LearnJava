import java.util.Scanner;
public class Ch04_19_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Else - If Ladder  //Note to avoid entering max value = put highest value first , Example written below;
        System.out.print("Enter your engine displacement: ");
        int EngDispl = input.nextInt();
        if (EngDispl > 0 && EngDispl < 1000) {
            System.out.println("Tax is 15%");
        } else if (EngDispl >= 1000 && EngDispl < 1200) {
            System.out.println("Tax = 18%");
        } else if (EngDispl >= 1200 && EngDispl < 1500) {
            System.out.println("Tax = 22%");
        } else if (EngDispl >= 1500 && EngDispl < 2000) {
            System.out.println("Tax = 28%");
        } else {
            System.out.println("Tax = 30%");
        }

        System.out.println("************");

        //Example of decreasing value
        // Opposite doesn't work because java goes step by step downwards i.e. lower value above will stick to the result
        System.out.print("Enter your engine displacement: ");
        int EngDispl1 = input.nextInt();
        if (EngDispl1 > 2000) {
            System.out.println("Tax is 30%");
        } else if (EngDispl > 1500) {
            System.out.println("Tax = 28%");
        } else if (EngDispl > 1200) {
            System.out.println("Tax = 22%");
        } else if (EngDispl > 1000) {
            System.out.println("Tax = 18%");
        } else {
            System.out.println("Tax = 15%");
        }

        System.out.println("***********");

        //Switch Case - used when we have to make choice from alternative codes in a program
        System.out.print("Enter your engine displacement: ");
        int EngDispl2 = input.nextInt();
        // Switch variable can be an in , char or a String and can be a whole code inside a Case
        switch (EngDispl2) {      //Break helps to get out of the switch case , if not used all case will be executed
            case 2000:
                System.out.println("You have to pay a tax of 30%");
                System.out.println("But you will get a lease of 10%");
                break;
            case 1500:
                System.out.println("You have to pay a tax of 28%");
                break;
            case 1200:
                System.out.println("You have to pay a tax of 22%");
                break;
            case 1000:
                System.out.println("You have to pay a tax of 18%");
                break;
            default:
                System.out.println("You have to pay a tax of 15%");
                break;
        }
        //Switch also has an enhanced version which is
        System.out.println("********");
        System.out.println("Enhanced Switch statement's code:");

        switch (EngDispl2) {
            case 2000 -> {    // Doesn't require a break statement
                System.out.println("You have to pay a tax of 30%");
                System.out.println("But you will get a lease of 10%");
            }
            case 1500 -> System.out.println("You have to pay a tax of 28%");
            case 1200 -> System.out.println("You have to pay a tax of 22%");
            case 1000 -> System.out.println("You have to pay a tax of 18%");
            default -> System.out.println("You have to pay a tax of 15%");
        }

    }
}


