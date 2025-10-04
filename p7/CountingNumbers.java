package Loops_p7;

import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos=0;
        int neg=0;
        double total=0;
        int no=0;
        int num=0;
        double avg=0;

        System.out.println("Enter an interger, the input ends if it is 0: ");
        

        while (true) {
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) pos++;
            else neg++;

            total += num;
            no++;
        }
        if (no == 0) {
            System.out.println("No numbers are entered except for 0 to end the program.");
        }

            else{
                avg=total/no;
                System.out.println("The number of positive is "+pos);
                System.out.println("The number of negative is "+neg);
                System.out.println("The total is "+total);
                System.out.printf("The average is %.2f",+avg);

            }

        
            
        }
    }

