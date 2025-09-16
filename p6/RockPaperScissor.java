package javafundamental_selections;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random()*900);
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int enter=input.nextInt();
        int random1 =(int)(random%3);

        String stat1="";
        String stat="";
        String result="";
        

        if (random1==0){
            stat1="rock";
        }
        else if (random1==1){
            stat1="paper";
        }
        else {
            stat1="scissor";
        }

        if (enter==0){
            stat="rock";
        }
        else if (enter==1){
            stat="paper";
        }
        else {
            stat="scissor";
        }

        if (enter==random1){
            result="It is a draw";
        }
        else if ((enter==0 && random1==2) || (enter==1 && random1==0) || (enter==2 && random1==1)){
            result="You win";
        }
        else{
        result="You lose";
        }

        System.out.println("Your computer is "+stat1+". You are "+stat+". "+result);
    }
}
