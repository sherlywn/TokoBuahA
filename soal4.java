/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahbeli = 0;
        int menit = 0;
        int stok = 150;
        int hasilbeli = 0;
        int semangka = 100000;
        int potongan;

        System.out.println("===== TOKO BUAH A == == =");
        System.out.print("Jumlah pembelian : ");
        jumlahbeli = input.nextInt();

        if (jumlahbeli <= 0 || jumlahbeli > stok) {
            System.err.println("ERROR - Masukkan jumlah pembelian yang valid!");
        } else {
            System.out.print("Menit : ");
            menit = input.nextInt();

            if (menit <= 0) {
                System.err.println("ERROR - Inputan invalid!");
            } else if (menit > 420) {
                System.err.println("Toko Tutup!");
            } else {
                potongan = (menit / 40) * 5;

                hasilbeli = jumlahbeli * semangka;
                potongan = (hasilbeli * potongan) / 100;
                hasilbeli -= potongan;

                stok -= jumlahbeli;

                System.out.println("===============================");
                System.out.println("Jumlah Pembelian : " + jumlahbeli);
                System.out.println("Stok Tersisa : " + stok);
                System.out.println("Hasil Pembelian : Rp" + hasilbeli);

            }
        }
    }
}
