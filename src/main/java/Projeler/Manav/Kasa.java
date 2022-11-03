package Projeler.Manav;


import static Projeler.Manav.Urunler.toplam;


public class Kasa extends Yazdir {


    public static double kasa(String urunName, double a, double b) {

        toplam = toplam + (a * b);
        System.out.println(urunName + " == >" + a + " x " + b + " = " + (a * b));

        return toplam;
    }

}
