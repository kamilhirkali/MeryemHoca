package Method_ArrayList_Sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */
public class Manav {
    static List<String> urunIsim = new ArrayList<>();
    static List<Integer> urunFiyat = new ArrayList<>();
    static double toplam;
    static String yazdir="";

    public static void main(String[] args) {

        urunIsim.add("Elma");
        urunIsim.add("Armut");
        urunIsim.add("Erik");
        urunIsim.add("Domates");
        urunIsim.add("Patates");

        urunFiyat.add(15);
        urunFiyat.add(25);
        urunFiyat.add(40);
        urunFiyat.add(20);
        urunFiyat.add(10);
        musteriSecimi();
        System.out.println(yazdir);
        System.out.println("Alisverisinizin toplam tutari =" + toplam);

    }

    public static void musteriSecimi() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi urunden almak istiyorsunuz Elma,Armut,Erik,Domates,Patates");
            String urunName = input.next();
            int indx = 0;
            double secilenUrunFiyat = 0;
            for (String w : urunIsim) {
                if (w.equalsIgnoreCase(urunName)) {
                    secilenUrunFiyat = urunFiyat.get(indx);
                    break;
                }
                indx++;
            }
            System.out.println("Kac kilo almak istiyorsunuz");
            double kilo = input.nextDouble();
            kasa(urunName, secilenUrunFiyat, kilo);
            toplamYazdir(urunName, secilenUrunFiyat, kilo);
            System.out.println("Alisverisi tamamlamak icin 'Q' harfine devam etmek icin herhangi bir tusa basiniz");
            if (input.next().equalsIgnoreCase("q")) break;
        }
    }

    public static double kasa(String urunName, double a, double b) {
        toplam = toplam + (a * b);
        System.out.println(urunName + " == >" + a + " x " + b + " = " + (a * b));
        return toplam;
    }

    public static String toplamYazdir(String urunName, double a, double b) {
        yazdir = yazdir + (urunName +"\t"+ " ==> " + a + " x " + b + " = " + (a * b)+"\n");
        return yazdir;
    }
}
