package javafundamental_selections;

import java.util.Scanner;

public class AddFourNumberr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random1 = (int)(Math.random()*99);
        int random2 = (int)(Math.random()*99);
        int random3 = (int)(Math.random()*99);
        int random4 = (int)(Math.random()*99);
        System.out.println("What is "+random1+" + "+random2+" + "+random3+" + "+random4+"?");
        int myans=input.nextInt();
        int ans1 = random1+random2+random3+random4;

        if (myans==ans1){
            System.out.println("Well done, you are correct!");
        }
        else{
            System.out.println("Nice try, the sum should be "+ans1);
        }
    }
    
}
