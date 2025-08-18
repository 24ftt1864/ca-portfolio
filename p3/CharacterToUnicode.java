import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character: ");

        char Char=input.next().charAt(0);
        int unicode=(int) Char;


        System.out.println("The unicode for character "+Char+" is "+unicode);
    }
    
}
