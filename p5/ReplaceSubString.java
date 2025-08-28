package javafundamental_p4;

import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message=input.nextLine();

        System.out.print("Enter the substring to replace: ");
        String sub=input.nextLine();
        
        

        System.out.print("Enter the replacement string: ");
        String replace=input.nextLine();
        String mes=message.replace(sub,replace);


        System.out.print(mes);

    }
}
