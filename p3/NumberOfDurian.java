import java.util.Scanner;

public class NumberOfDurian {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double Durian=15.75;
        System.out.println("Each durian cost $15.75");
        System.out.print("How much money do you have? $");
        double money=input.nextDouble();

        double howmuch=money/Durian;
        int canbuy=(int)howmuch;
        

        System.out.println("The number of durian(s) you can buy is "+canbuy);


 
        
    }
    
}
