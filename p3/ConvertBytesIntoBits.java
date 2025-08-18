import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bits =8;

        System.out.print("Enter the number of byte(s) to be converted: ");
        int bytes=input.nextInt();

        System.out.println(bytes+ " byte(s) is "+bytes*bits+ " bits");

    }
    
}
