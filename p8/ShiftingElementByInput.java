package p8_onedimentionalarray;

import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("How many numbers are there?");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the "+n+" numbers:");
        for (int i=0; i<n; i++) a[i]=in.nextInt();
        System.out.println("Enter number of left shift:");
        int k=in.nextInt();
        if (n>0) k%=n;
        for (int s=0; s<k; s++) {
            int first=a[0];
            for (int i=0; i<n-1; i++) a[i]=a[i+1];
            a[n - 1] = first;
        }



        System.out.println("\nThe shifted arrangement is:");
        for (int i=0; i<n; i++)
        System.out.print(a[i]+(i==n-1? "" : " "));
    }
}



