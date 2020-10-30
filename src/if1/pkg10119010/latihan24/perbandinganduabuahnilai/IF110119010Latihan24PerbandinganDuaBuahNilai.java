/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk membandingkan 2 nilai
 */
public class IF110119010Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int nilaiPertama = 0, nilaiKedua = 0;
        String aktivitas;

        System.out.println("========Program Perbandingan Nilai========");
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            nilaiKedua = scanner.nextInt();

            System.out.print("Hasil : ");
            if (nilaiPertama > nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println(nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            aktivitas = scanner.next();
            aktivitas = aktivitas.toLowerCase();
            System.out.println();
        } while (aktivitas.equals("ya"));
    }
    
}
