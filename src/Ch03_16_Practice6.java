import java.util.Scanner;
public class Ch03_16_Practice6 {
    public static void main(String[] args) {
        //Name Formatter
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        String CapName = name.toUpperCase();
        String CurName = name.toLowerCase();
        System.out.printf("Name in capitals is %s\n" , CapName);
        System.out.printf("Name in lowercase is %s\n" , CurName);

        System.out.println("  ");

        //Password Maker
        System.out.println("Enter Your Password: ");
        String Pass = input.nextLine();
        String maskedpass = Pass.charAt(0) + "*******" + Pass.charAt(Pass.length()-1);
        System.out.printf("Entered Pass: %s\n" , maskedpass);

        System.out.println("  ");

        //Vowel Detector
        System.out.print("Enter Your Statement: ");
        String statement = input.nextLine();
        int a = statement.indexOf('a');
        int e = statement.indexOf('e');
        int o = statement.indexOf('o');
        int i = statement.indexOf('i');
        int u = statement.indexOf('u');
        System.out.println("Index of 'a' if any in statement: " + a);
        System.out.println("Index of 'e' if any in statement: " + e);
        System.out.println("Index of 'i' if any in statement: " + i);
        System.out.println("Index of 'o' if any in statement: " + o);
        System.out.println("Index of 'u' if any in statement: " + u);

        System.out.println("  ");

        //Spam Detector
        System.out.print("Enter your received message: ");
        String spam = input.nextLine();
        System.out.print("Spam message:" + spam.contains("money"));

        System.out.println("*********");




    }
}
