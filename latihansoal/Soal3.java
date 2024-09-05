package latihansoal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-- KALKULATOR SEDERHANA --");
        System.out.println();

        System.out.println("Masukkan angka pertama : ");
        double angka1 = input.nextDouble();

        System.out.println("Masukkan angka kedua : ");
        double angka2 = input.nextDouble();

        System.out.println("-- Pilihan Operasi --");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Pembagian (/)");
        System.out.println("4. Perkalian (*)");
        System.out.println("5. Modulus (%)");
        System.out.println("Masukkan angka Operasi : ");
        int hasil = input.nextInt();

        switch (hasil) {
            case 1:
                System.out.println("Hasilnya adalah " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasilnya adalah " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasilnya adalah " + (angka1 / angka2));
                break;
            case 4:
                System.out.println("Hasilnya adalah " + (angka1 * angka2));
                break;
            case 5:
                System.out.println("Hasilnya adalah " + (angka1 % angka2));
                break;
            default:
                System.out.println("Pilih 1 - 5");
                break;

        }

    }
}
