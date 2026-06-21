package AMCAT;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q02_VeganandMeatPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int orderSize = input.nextInt();

        int [] orders = new int[orderSize];

        for(int i = 0 ; i < orderSize ; i++){
            int pizza = input.nextInt();
            orders[i] = pizza;
        }

        int windowSize = input.nextInt();

        Queue<Integer> meatOrders = new LinkedList<>();

        for(int i = 0 ; i < windowSize ; i++){
            if(orders[i] < 0){
                meatOrders.add(i);
            }
        }

        if (!meatOrders.isEmpty()){
            System.out.println(orders[meatOrders.peek()]+ " ");
        }
        else {
            System.out.println("0 ");
        }

        for(int i = windowSize ; i < orderSize ; i++){
            while(!meatOrders.isEmpty() && meatOrders.peek() <= i-windowSize){
                meatOrders.poll();
            }

            if(orders[i] < 0){
                meatOrders.add(i);
            }

            if(!meatOrders.isEmpty()){
                System.out.println(orders[meatOrders.peek()] + " ");
            }
            else {
                System.out.println("0 ");
            }
        }
    }
}