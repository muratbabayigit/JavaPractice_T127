package day05;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;

        for (int i = 0; i <5 ; i++) {
            System.out.print(i+1 +". sayıyı giriniz: ");
            sayi= scan.nextInt();
          if(sayi>=5 && sayi<=10){
              continue;
          }
          toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
