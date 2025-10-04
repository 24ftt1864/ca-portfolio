package Loops_p7;

import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rounds=0;
        int score=0;
        int cscore=0;
        int random = (int)(Math.random()*2);
        String stat1="";
        String stat="";
        String result="";
        String yn="";

        do{

        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int choice=input.nextInt();
        int cchoice=random;

    

        if (cchoice==0){
            stat1="rock";
        }
        else if (cchoice==1){
            stat1="paper";
        }
        else {
            stat1="scissor";
        }

        if (choice==0){
            stat="rock";
        }
        else if (choice==1){
            stat="paper";
        }
        else {
            stat="scissor";
        }

        if (choice==cchoice){
            result="It is a draw";
        }
        else if ((choice==0 && cchoice==2) || (choice==1 && cchoice==0) || (choice==2 && cchoice==1)){
            result="You win";
            score++;
        }
        else{
        result="You lose";
        cscore++;
        }
        System.out.println("Your computer is "+stat1+". You are "+stat+". "+result);
        rounds++;
        input.nextLine();
        System.out.print("Enter y to play again: ");
        yn=input.nextLine();
        }
        while (yn.equalsIgnoreCase("y"));

        System.out.println("In the total of "+rounds+" round(s), You scored "+score+", Computer scored "+cscore);

        if (score<cscore){
            System.out.println("You lose the game");
        }
        else if (score>cscore){
            System.out.println("You won the game");
        }
        else{
            System.out.println("It is a draw game.");
        }




        
    }
}
