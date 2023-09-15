package day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P03_Scanner {

    //Bazen kod yazarken bazı variablelar için kullnıcıdan değer almak gerekir
    //Bu gibi durumlarda Sccanner classından faydalanılır.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz: ");
        String name= scan.nextLine();
        System.out.print("Lütfen Soyadınızı Giriniz: ");
        String surname= scan.next();

        System.out.println("Adınız: "+name+" "+surname+" olarak kaydedildi.");

    }

}
