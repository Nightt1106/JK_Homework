package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ticket tk = new Ticket();

        while(true){
            System.out.println("Please enter number of tickets: ");
            int num = scanner.nextInt();
            System.out.println("How many round_trip tickets: ");
            int numRound = scanner.nextInt();
            System.out.println("Total tickets: " + num);
            System.out.println("Round-trip: " + numRound);
            System.out.println("Total: " + tk.totalOf_price(num,numRound));
            System.out.println("Continue?(y/n)");
        }
    }
}
