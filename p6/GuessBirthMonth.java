package javafundamental_selections;

import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        
        int month=0;
        System.out.println("Is your birth month in Set 1?");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int set=input.nextInt();
        if (set==1){
            month=month+1;
        }

        System.out.println("Is your birth month in Set 2?");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        set=input.nextInt();
        if (set==1){
            month=month+2;
        } 
        System.out.println("Is your birth month in Set 3?");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        set=input.nextInt();
        if (set==1){
            month=month+4;
        } 
        System.out.println("Is your birth month in Set 4?");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        set=input.nextInt();
        if (set==1){
            month=month+8;
        } 
        else{
            month=month+0;
        }
        String month1="";
        switch (month) {
            case 1: month1="January";
            break;
            case 2: month1="February";
            break;
            case 3: month1="March";
            break;
            case 4: month1="April";
            break;
            case 5: month1="May";
            break;
            case 6: month1="June";
            break;
            case 7: month1="July";
            break;
            case 8: month1="August";
            break;
            case 9: month1="September";
            break;
            case 10: month1="October";
            break;
            case 11: month1="November";
            break;
            case 12: month1="December";
            break;
        }
        System.out.println("You are born in "+month1);

        
        


        
    }
}

    

