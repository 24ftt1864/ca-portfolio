package javafundamental_selections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        String ftime=ldt.format(formatter);

        
        System.out.println("Please enter your username:");
        String username=input.nextLine();
        System.out.println("Please enter your password:");
        String pass=input.nextLine();

        String realid="Ahmad Ali";
        String realpass="12345";

        if (username.equals(realid)){
            if (pass.equals(realpass)){

            System.out.println("Welcome Ahmad Ali. The time now is "+ftime);
            }
            else{
                System.out.println("Error: Invalid password.");
            }
        }
        else{
            System.out.println("Error: Invalid Username.");
        }
    }
    
}
// (username.equals(realid) && pass.equals(realpass)){
//             System.out.println("Welcome Ahamd Ali. The time now is "+fdate);
//         }