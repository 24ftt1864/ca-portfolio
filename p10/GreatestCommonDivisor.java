package p10_methods;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = in.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = in.nextInt();

        int div = div1(num1, num2);
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + div);
    }

    public static int div1(int a, int b) {
        int div = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) div = i;
        }
        return div;
    }
}

