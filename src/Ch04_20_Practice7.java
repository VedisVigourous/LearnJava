import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class Ch4_20_Practice7 {
    public static void main(String[] args) {

        // Output finder
        int a = 10;
        if (a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        } //Predicted output is I am not 11

        System.out.println("  ");

        //Student Result
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the following subjects marks: ");
        System.out.print("Physics:");
        int P = input.nextInt();
        System.out.print("Chemistry:");
        int C = input.nextInt();
        System.out.print("Maths:");
        int M = input.nextInt();

        float percentage = (float)(P+C+M)/(300)*100;
        System.out.printf("Your Percentage is %f\n" , percentage);
        if (percentage>=40.0f && P>=33 && C>=33 && M>=33){
            System.out.println("You Passed");
        }
        else {
            System.out.println("Failed! Better luck next time");
        }

        System.out.println("   ");

        // Tax Calculator , Income > 2.5L to 5L - 5% , 5-10 - 20% , above 10>30%
        System.out.print("Enter your Income(Lakhs): ");
        float Income = input.nextFloat();

        if (Income >= 10.0f){
            System.out.println("Income Tax - 30%");
            float Tax = (0.3f*Income);
            System.out.printf("Tax to be paid is: %f\n" , Tax);
            System.out.println("Amount in hand: " + (Income - Tax));
        }
        else if (Income >= 5.0f && Income<10.0f){
            System.out.println("Income Tax - 20%");
            float Tax = (0.2f*Income);
            System.out.printf("Tax to be paid is: %f\n" , Tax);
            System.out.println("Amount in hand: " + (Income - Tax));
        }
        else if(Income >=2.5f && Income<5.0f){
            System.out.println("Income Tax - 5%");
            float Tax = (0.05f*Income);
            System.out.printf("Tax to be paid is: %f\n" , Tax);
            System.out.println("Amount in hand: " + (Income - Tax));
        }
        else {
            System.out.println("Income Tax - 3%");float Tax = (0.03f*Income);
            System.out.printf("Tax to be paid is: %f\n" , Tax);
            System.out.println("Amount in hand: " + (Income - Tax));
        }

        System.out.println("  ");

        //Weekday teller
        System.out.print("Enter the serial no. of day: ");
        int Day = input.nextInt();
        switch (Day){
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid integer between 1 - 7");
        }

        System.out.println("   ");

        // Leap Year finder
        System.out.print("Enter the year you are riding right now: ");
        int Year = input.nextInt();

        if (Year%4 == 0){
            System.out.println("You are in Leap Year");
        }
        else{
            System.out.println("This is a normal year ! No extra Day");
        }
        System.out.println("   ");

        //Type of Website , .com - commercial , .org - organisation , .in - indian
        Scanner ws = new Scanner(System.in);
        System.out.print("Search your website: ");
        String website = ws.nextLine();

        if (website.indexOf(".com")>0){
            System.out.println("This is a commercial Website");
        } else if (website.indexOf(".org")>0) {
            System.out.println("This is an organisation website");
        } else if (website.indexOf(".in")>0) {
            System.out.println("This is an Indian Website");
        }
        else{
            System.out.println("Enter a valid URL");
        }

        System.out.println("*******");

    }
}


