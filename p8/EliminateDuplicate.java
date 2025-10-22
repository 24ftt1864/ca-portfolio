package p8_onedimentionalarray;

import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) a[i] = in.nextInt();
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] != 0 && a[i] == a[j]) a[j] = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[min]) min = j;
            int t = a[i]; a[i] = a[min]; a[min] = t;
        }



        System.out.print("The distinct numbers are: ");
        boolean first = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (!first) System.out.print(" ");
                System.out.print(a[i]);
                first = false;
            }

        }
        System.out.println();
    }



}





