package Loops_p7;

public class looplooploops {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Below is generated using while loop:");
        while (i<=20) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println("Below is generated using dowhile loop:");
        int x = 50;
        do{
        System.out.print(x+" ");
        x--;
        }
        while (x>=35); {
        }
        System.out.println();
        System.out.println("Below is generated using for loop:");
        for(char a ='a'; a<='z';a++){
            System.out.print(a+" ");
        }

    }
}
