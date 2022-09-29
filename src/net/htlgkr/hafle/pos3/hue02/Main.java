package net.htlgkr.hafle.pos3.hue02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose calculator");
        System.out.println("1 - Relational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
        int line = sc.nextInt();
        switch(line){
            case 1:
                System.out.println("Enter number a");
                int line1 = sc.nextInt();
                System.out.println("Enter number b");
                int line2 = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter number x a");
                int line3 = sc.nextInt();
                System.out.println("Enter number x b");
                int line4 = sc.nextInt();
                System.out.println("Enter number y a");
                int line5 = sc.nextInt();
                System.out.println("Enter number x b");
                int line6 = sc.nextInt();
                break;
            case 4:
                System.out.println("Ending program");
                return;
            default:
                System.out.println("Check your input");
            }
        }
    }
}
