package javafundamental_p4;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        String filename="C:/data/QReceipt.txt";
        FileWriter qr=new FileWriter(filename);
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fdate=ldt.format(formatter);
        

        int qnum = (int)(Math.random()*100);

        System.out.print("Enter name: ");
        String name=input.nextLine();
        System.out.println("Receipt generated. Thank you.");

        qr.write(""+fdate+"\n"+"\n"+"Hi "+name.toUpperCase()+"\n"+"\n"+"Your Queue No is : "+qnum);

        qr.close();
    }
    
}
