package Projeler.Manav;

import java.util.Scanner;
import static Projeler.Manav.Urunler.urunFiyati;
import static Projeler.Manav.Urunler.urunList;
public class Musteri extends Kasa {
    public void musteriSec() {
       Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hangi urunden almak istiyorsunuz Elma,Armut,Erik,Domates,Patates");
            String urunName = input.next();
            int indx = 0;
            double secilenUrunFiyat = 0;

            for (String w : urunList) {
                if (w.equalsIgnoreCase(urunName)) {
                    secilenUrunFiyat = urunFiyati.get(indx);
                    break;
                }
                indx++;
            }
            System.out.println("Kac kilo almak istiyorsunuz");
            double kilo = input.nextDouble();

            kasa(urunName,secilenUrunFiyat, kilo);
            toplamYazdir(secilenUrunFiyat,kilo,urunName);
            System.out.println("Alisverisi tamamlamak icin 'Q' harfine devam etmek icin herhangi bir tusa basiniz");
            if (input.next().equalsIgnoreCase("q")) break;
        }
    }
}