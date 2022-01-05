package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        int number = 0;
//        int count = 0;
//        while (count < 20) {
//            if (number < 2) {
//                number++;
////                continue;
//            } else if (number == 2) {
//                System.out.println(number);
//                count++;
//            } else {
//                boolean isPrime = true;
//                for (int i = 2; i <= Math.sqrt(number); i++) {
//                    if (number % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if (isPrime) {
//                    count++;
//                    System.out.println(number);
//                }
//            }
//            number++;
//        }
//
//        while (number < 100) {
//            if (number < 2) {
//                number++;
////                continue;
//            } else if (number == 2) {
//                System.out.println(number);
//                count++;
//            } else {
//                boolean isPrime = true;
//                for (int i = 2; i <= Math.sqrt(number); i++) {
//                    if (number % i == 0) {
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if (isPrime) {
//                    count++;
//                    System.out.println(number);
//                }
//            }
//            number++;
//        }


	int number;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of prime you want to show");
        number = scanner.nextInt();
        int count = 0;
        int checkNumber = 0;
        while(count < number){
            if (checkNumber < 2) {
//                checkNumber++;
//                continue;
            } else
                if (checkNumber == 2) {
                System.out.println(checkNumber);
                count++;
//                checkNumber++;
                } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(checkNumber); i++) {
                    if (checkNumber % i == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime){
                    count++;
                    System.out.println(checkNumber);
                }
//                checkNumber++;
        }
            checkNumber++;
        }
        }
}
