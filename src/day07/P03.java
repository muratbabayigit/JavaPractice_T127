package day07;

import java.util.Arrays;

public class P03 {
    public static void main(String[] args) {
        int [] arr={12,25,36,48,25};
        System.out.println(Arrays.toString(arr));

        /*
  "      ÖDEV:
    Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    olusturun. Eski array’i yeni haliyle kaydedin."
         */
     //   for (int i = 0; i < arr.length ; i++) {
     //       System.out.print(arr[i]+2+" ");//14 27 38 50 27

        for (int i : arr) {
            System.out.print(i + 2 + " ");
        }
        }
    }

