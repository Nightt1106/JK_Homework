package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ticket tk = new Ticket();

        while(true){
            System.out.println("Please enter number of tickets: ");
            int num = scanner.nextInt();
            if (num == -1) break;
            System.out.println("How many round_trip tickets: ");
            int numOfRound = scanner.nextInt();
            System.out.println("Total tickets: " + num);
            System.out.println("Round-trip: " + numOfRound);
            System.out.println("Total: " + tk.totalOfPrice(num, numOfRound));
        }
    }
}
