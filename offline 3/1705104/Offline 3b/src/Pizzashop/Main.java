package Pizzashop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        System.out.println("1. Beef Pizza with French fry     Price:400tk");
        System.out.println("2. Veggi Pizza with onion rings      Price:300tk");
        System.out.println("3. A combo meal with Veggi Pizza, French Fry and Coke      Price:320tk");
        System.out.println("4. A combo meal with Veggi Pizza, Onion Rings and Coffee     Price:350tk");
        System.out.println("5. A Beef Pizza only      Price:300tk");
        System.out.println(" ");
        System.out.println("Choose your order please");
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        Order order=new Order(choice);
        order.showOrder();
        System.out.println("Bill to be paid: "+order.getBill());
    }
}
