package latihansoal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai pertama : ");
        int bilangan1 = input.nextInt();

        System.out.println("Masukkan nilai kedua : ");
        int bilangan2 = input.nextInt();

        if (bilangan1 > bilangan2) {
            System.out.println("Bilangan terbesar adalah : " + bilangan1);
        } else if (bilangan2 > bilangan1) {
            System.out.println("Bilangan terbesar adalah : " + bilangan2);
        } else {
            System.out.println("Bilangan tersebut sama");
        }
    }
}
