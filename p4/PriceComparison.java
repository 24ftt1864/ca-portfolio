import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the 1st package: $");
        double amount1=input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        int weight1=input.nextInt();

        System.out.println("");

        System.out.print("Enter the price of the 2nd package: $");
        double amount2=input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        int weight2=input.nextInt();

        double firstpack=weight1/amount1;
        double secpack=weight2/amount2;
        System.out.println("");

        String whichbetter=firstpack>secpack? "It is worth more to buy the 1st package":"It is worth more to buy the 2nd package";
        System.out.println(whichbetter);





    


    }
    
}
