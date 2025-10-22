package p9_multiconditionalarray;

import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] answers = {
            {'A','B','C','D','A','B'},
            {'C','D','D','A','B','D'},
            {'D','D','A','B','B','A'},
            {'C','A','D','A','B','C'} 
        };

        System.out.println("Enter the key to the MCQ:");
        String line = in.nextLine().trim();
        while (line.isEmpty()) line = in.nextLine().trim();
        String[] tokens = line.split("\\s+");

        char[] key = new char[6];
        for (int i = 0; i < 6; i++) {
            char ch = (i < tokens.length && tokens[i].length() > 0) ? tokens[i].charAt(0) : ' ';
            key[i] = Character.toUpperCase(ch);
        }

        for (int i = 0; i < answers.length; i++) {
            int correct = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (Character.toUpperCase(answers[i][j]) == key[j]) correct++;
            }
            if (correct >= 3)
                System.out.println("Student "+i+"'s correct count is "+correct+". Therefore, he/she passed the test.");
            else
                System.out.println("Student "+i+"'s correct count is "+correct+". Therefore, he/she failed the test.");
        }
    }
}
