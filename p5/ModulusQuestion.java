package javafundamental_p4;

import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException{
        System.out.println("A new question added");
        int random1 = (int)(Math.random()*100);
        int random2 = (int)(Math.random()*100);
        String filename="C:/data/ModulusQuestion.txt"; 
        FileWriter question=new FileWriter(filename,true);
        question.write(random1+" % "+random2+" = ?\n");

        question.close();
    }
    
}

