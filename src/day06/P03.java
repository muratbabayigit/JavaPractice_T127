package day06;

public class P03 {
    /*
    2 basamaklı 7 ile bölünebilen pozitif tam sayıları while Loop ile yazdırınız.
     */

    public static void main(String[] args) {

        int sayi=10;
        String sayilar="";

        while(sayi<100){
            if (sayi%7==0){
                //System.out.print(sayi+" ");
                sayilar+=sayi+",";
            }
            sayi++;

        }
        System.out.println(sayilar.substring(0,sayilar.length()-1));




    }
}
