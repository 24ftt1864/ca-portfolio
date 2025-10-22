package p8_onedimentionalarray;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i=0; i < 10; i++) arr[i] = i;
        for (int i=arr.length - 1; i > 0; i--) {
            int j=i / 2;
            int t=arr[i]; arr[i] = arr[j]; arr[j] = t;
        }
        int[] target = {arr[0], arr[1], arr[2], arr[3]};

        int chances = 10;
        while (chances > 0) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] g = new int[4];
            for (int i = 0; i < 4; i++) g[i] = in.nextInt();

            int score = 0;
            for (int i = 0; i < 4; i++) if (g[i] == target[i]) score++;

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                return;
            } else {
                chances--;
                if (chances == 0) {
                    System.out.print("\nThe actual number is ");
                    System.out.printf("%d %d %d %d. You Lose.\n", target[0], target[1], target[2], target[3]);
                    break;
                }
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            }




        }
    }
    
}
