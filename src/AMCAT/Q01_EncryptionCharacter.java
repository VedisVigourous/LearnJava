package AMCAT;
import java.util.Scanner;

public class Q01_EncryptionCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringSent = input.nextLine();
        String stringRec = input.nextLine();

        boolean found = false;

        for (int i = 0; i < stringRec.length()-1; i++) {
            if (stringSent.charAt(i) != stringRec.charAt(i)) {
                System.out.println(stringSent.charAt(i));
                found = true;
                break;
            }
        }


        if (!found) {
            System.out.println(stringSent.charAt(stringSent.length() - 1));
        }
    }
}