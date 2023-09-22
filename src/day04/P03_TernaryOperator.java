package day04;

import java.util.Scanner;

public class P03_TernaryOperator {
    public static void main(String[] args) {

       /*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
       */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen incelediğiniz üçgenin kenar uzunluklarını giriniz");
        System.out.print("1.Kenar: ");
        double kenar1= scan.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2= scan.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3= scan.nextDouble();
        //? --> ise :--> değilse
        System.out.println(kenar1>0&&kenar2>0&&kenar3>0?
                        kenar1==kenar2 && kenar2==kenar3 ? "Üçgen Eşkenar Üçgendir"
                        :"Üçgen Eşkenar Üçgen Değildir."
                        :"Yanlış değer girdiniz");







    }
}
