package p8_onedimentionalarray;

import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=in.nextInt();
        int[] scores=new int[n];
        char[] grades=new char[n];


        System.out.println("\nEnter the "+n+" scores");
        int best=Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            scores[i]=in.nextInt();
            if (scores[i]>best) best=scores[i];
        }


        for (int i =0; i<n; i++) {
            int s = scores[i];
            if (s >= best - 10) grades[i] = 'A';
            else if (s >= best - 20) grades[i] = 'B';
            else if (s >= best - 30) grades[i] = 'C';
            else if (s >= best - 40) grades[i] = 'D';
            else grades[i] = 'F';
        }



        for (int i = 0; i < n; i++)
            System.out.println("Student " +(i + 1)+" score is "+scores[i]+ " and grade is "+grades[i]);
    }


}




