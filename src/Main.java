
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ulang;

        do {
            System.out.println("==================");
            System.out.println("Menu Utama");
            System.out.println("==================");
            System.out.println("1. hitung balok");
            System.out.println("2. hitung tabbung");
            System.out.println("0.exit");

            System.out.print("pilih: ");
            int pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    float p,
                     l,
                     t;
                    System.out.print("Input panjang:");
                    p = in.nextFloat();
                    System.out.print("Input Lebar:");
                    l = in.nextFloat();
                    System.out.print("Input Tinggi:");
                    t = in.nextFloat();
                    Balok b = new Balok(p, l, t);

                    System.out.println("Luas Persegi Panjang = " + b.luas());
                    System.out.println("KelilingPwesegi Panjang = " + b.keliling());
                    System.out.println("volume Balok = " + b.volume());
                    System.out.println("Luas Permukan = " + b.luasPermukaan());
                    break;

                case 2:
                    float r;
                    System.out.print("input Tinggi: ");
                    t = in.nextInt();
                    System.out.print("input jari - jari: ");
                    r = in.nextInt();
                    Tabung tbg = new Tabung(t, r);

                    System.out.println("Luas Lingkarang = " + tbg.luas());
                    System.out.println("Keliling Lingkaran = " + tbg.keliling());
                    System.out.println("Volume tabung = " + tbg.volume());
                    System.out.println("Luas Permukaan Tabung =" + tbg.luasPermukaan());

            } 
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = in.nextInt();
        } while (ulang==1);

    }

}
