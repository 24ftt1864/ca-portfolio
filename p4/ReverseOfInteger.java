import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 100 and 999: ");
        int Integer=input.nextInt();
        int reverse1=Integer%10;
        int reverse2=Integer/10;
        int reverse3=reverse2%10;
        int reverse4=reverse2/10;
        
        


        System.out.println("The reverse of "+Integer+" is "+reverse1+reverse3+reverse4);
        
    }
    
}
