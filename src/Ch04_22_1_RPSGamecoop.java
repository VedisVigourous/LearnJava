import java.util.Scanner;
public class Ch4_22_1_RPSGamecoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rules for Rock , Paper and Scissors:");
        System.out.println("Rock succeeds over scissors");
        System.out.println("Paper succeeds over rock");
        System.out.println("Scissors succeeds over Paper");
        System.out.println("1.Rock , 2.Paper and 3.Scissors");
        System.out.println("   ");
        System.out.println("********");
        System.out.println("   ");
        int a = 1;
        while (a<=5) {
            System.out.print("Player 1 - Enter your choice: ");
            int p1 = input.nextInt();
            if (p1 == 1) {
                System.out.println("Wait for P2");
            }
            else if (p1 == 2) {
                System.out.println("Wait for P2");
            }
            else if (p1 == 3) {
                System.out.println("Wait for P2");
            }
            else {
                System.out.println("Enter a valid choice");
                System.exit(1010);
            }
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("Player 2 - Enter your choice: ");
            int p2 = input.nextInt();
            if (p2 == 1){
                System.out.println("  ");
            } else if (p2 == 2) {
                System.out.println("  ");
            }
            else if (p2 == 3){
                System.out.println("  ");
            }
            else {
                System.out.println("Enter a valid choice");
                System.exit(1010);
            }
            if (p1 == 1 && p2 == 3) {
                System.out.println("   ");
                System.out.println("!!Player 1 wins!!");
                System.out.println("P1 - Rock and P2 - Scissors");
                System.out.println("+1 for Player 1");
            }
            else if (p1 == 2 && p2 == 1) {
                System.out.println("   ");
                System.out.println("Player 1 wins");
                System.out.println("P1 - Paper and P2 - Rock");
                System.out.println("+1 for Player 1");
            }
            else if (p1 == 3 && p2 == 2) {
                System.out.println("   ");
                System.out.println("!!Player 1 wins!!");
                System.out.println("P1 - Scissors and P2 - Paper");
                System.out.println("+1 for Player 1");
            }
            else if (p2 == 1 && p1 == 3){
                System.out.println("   ");
                System.out.println("!!Player 2 wins!!");
                System.out.println("P1 - Scissors and P2 - Rock");
                System.out.println("+1 for Player 2");
            }
            else if (p2 == 2 && p1 == 1) {
                System.out.println("   ");
                System.out.println("!!Player 2 wins!!");
                System.out.println("P1 - Rock and P2 - Paper");
                System.out.println("+1 for Player 2");
            }
            else if (p2 ==3 && p1 == 1){
                System.out.println("   ");
                System.out.println("!!Player 2 wins!!");
                System.out.println("P1 - Paper and P2 - Scissors");
                System.out.println("+1 for Player 2");
            }
            else {
                System.out.println("!!It's a Draw!!");
                System.out.println("+1 to both the players");
            }
            a++;
        }
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("Player with score 3 or greater than 3 wins the tournament");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("*******");
        System.out.println("Thanks for playing");
        System.out.println("Made by Vedant - 2025");
    }
}
