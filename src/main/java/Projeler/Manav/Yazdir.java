package Projeler.Manav;

import static Projeler.Manav.Urunler.yazdir;

public class Yazdir {

    public static String toplamYazdir(double a,double b,String urunName) {
        yazdir = yazdir + (urunName +"\t"+ " ==> " + a + " x " + b + " = " + (a * b)+"\n");
        return yazdir;
    }

}
