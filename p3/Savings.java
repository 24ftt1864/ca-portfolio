import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int month=30;

        System.out.print("What is your target amount? $");
        double money=input.nextInt();
        System.out.print("How many month(s) to reach your goal? ");
        int inmonth=input.nextInt();
        int totalmonth=month*inmonth;
        System.out.printf("The amount you need to save per day is $%.2f",money/totalmonth);


    }
    
}
