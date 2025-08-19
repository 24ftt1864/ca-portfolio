import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random1 = (int)(Math.random()*100);
        int random2 = (int)(Math.random()*100);

        System.out.println("What is "+random1+" + "+random2+" ?");
        int numinput=input.nextInt();
        int ans=random1+random2;

        System.out.println(random1+" + "+random2+" = "+numinput+" is "+(numinput==ans));

        System.out.println("");

        System.out.println("What is "+random1+" % "+random2+" ?");
        int numinput2=input.nextInt();
        int ans2=random1%random2;

        System.out.println(random1+" + "+random2+" = "+numinput2+" is "+(numinput2==ans2));



        


    }
    
}
