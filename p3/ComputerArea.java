public class ComputerArea {
    public static void main(String[] args) {
        double base=4.0, height=6.0, radius=8.0 ;
        final double pi=3.14;
        
        double AoS=base*base;
        double AoT=0.5*base*height;
        double AoC=pi*radius*radius;

        System.out.printf("The area of square is %.1f%n"+
        "The area of triangle is %.1f%n"+ 
        "The area of circle is %.2f%n", AoS, AoT, AoC);

    }
}
