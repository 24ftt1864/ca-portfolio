package p10_methods;

import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int random=(int)(Math.random()*900)+100;

        System.out.print("Enter the reverse of "+random+": ");
        int num=in.nextInt();

        while (num<100 || num>999) {
            System.out.print("Please enter a 3-digit reverse number of "+random+": ");
            num=in.nextInt();
        }

        int reversed = reverse(random);
        boolean isPalindrome = isPalindrome(num, reversed);

        System.out.println("The digit "+num+" is palindrome of "+random+" is "+isPalindrome+".");
    }

    public static int reverse(int random) {
        int reversed=0;
        while (random!=0) {
            int digit=random%10;
            reversed=reversed*10+digit;
            random/=10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int input, int reversed) {
        return input==reversed;
    }
}


