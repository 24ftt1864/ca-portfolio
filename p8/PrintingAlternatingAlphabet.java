package p8_onedimentionalarray;

public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {

        String[] az = new String[26];

        for (int i=0; i<az.length; i++)az[i]=String.valueOf((char)('a'+i));
        for (int i=0, j=az.length-1; i<az.length;i++, j--) {
            System.out.print(az[i]+" "+az[j]+(i==az.length-1? " " : " "));
        }
    }


}

