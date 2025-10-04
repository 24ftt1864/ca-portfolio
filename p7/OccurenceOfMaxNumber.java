package Loops_p7;

import java.util.Scanner;

public class OccurenceOfMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers, the input ends with 0 entered:");
        int numb = input.nextInt();
        if (numb==0){
            System.out.println("No numbers entered");
        }
        int largest=numb;
        int count=1;

        while (true) {
            numb=input.nextInt();
            if (numb==0){
                break;
            }
            if (numb>largest){
                largest=numb;
                count=1;
            }
            else if (numb==largest){
                count++;
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The occurrence count of the largest number is"+count);
    }
}
