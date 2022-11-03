package Method_ArrayList_Sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* TASK :
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *           ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *           ortalama kazançtan aşağıysa o günleri return yap.
 * */
public class Market {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        System.out.println(gunler.get(3));
        List<Integer> gunlukKazanclar = new ArrayList<>();
        int i = 0;
        while (i < 7) {
            System.out.println(gunler.get(i) + " gununun kazancini giriniz :");
            gunlukKazanclar.add(input.nextInt());
            i++;
        }
        System.out.println("Gunluk Kazanc   =" + gunlukKazanclar);
        System.out.println("Ortalama Kazanc   =" + getOrtalamaKazanc(gunlukKazanclar));
        System.out.println("Ortalamanin Ustunde Kazanc Gunleri  =" + getOrtalamaninUstundeKazancGunleri(gunler,gunlukKazanclar));
        System.out.println("Ortalamanin Altinda Kazanc Günleri  =" + getOrtalamaninAltindaKazancGunleri(gunler,gunlukKazanclar));
    }


//1.yol
    public static int getOrtalamaKazanc(List<Integer> gunlukKazanclar) {
        int sum = 0, ortalama = 0, counter = 0;
        for (Integer w : gunlukKazanclar) {
            sum = sum + w;
            counter++;
        }
        ortalama=sum / counter;
        return ortalama;
    }

    public static List<String> getOrtalamaninUstundeKazancGunleri(List<String> gunler,List<Integer> gunlukKazanclar) {
        List<String> ortalamaninUstunde = new ArrayList<>();
        int ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        int indx = 0;

        for (Integer k : gunlukKazanclar) {

            if (k <= ortalamaKazanc){
                indx++;
                continue;
            }
            ortalamaninUstunde.add(gunler.get(indx));
            indx++;
        }

        return ortalamaninUstunde;
    }

    public static List<String> getOrtalamaninAltindaKazancGunleri(List<String> gunler,List<Integer> gunlukKazanclar) {
        List<String> ortalamaninAltinda = new ArrayList<>();
        int ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        int indx = 0;

        for (Integer k : gunlukKazanclar) {

            if (k >= ortalamaKazanc){
                indx++;
                continue;
            }
            ortalamaninAltinda.add(gunler.get(indx));
            indx++;
        }

        return ortalamaninAltinda;
    }
//----------------------------------------------------------------------------------
 /*
 //2.yol
 public static int getOrtalamaKazanc(List<Integer> gunlukKazanclar) {
        int sum = 0, ortalama = 0, counter = 0;
        for (Integer w : gunlukKazanclar) {
            sum = sum + w;
            counter++;
        }
        return ortalama = sum / counter;
    }

    public static List<String> getOrtalamaninUstundeKazancGunleri(List<Integer> gunlukKazanclar) {
        List<String> ortalamaninUstunde = new ArrayList<>();
        int ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        int indx=0;
            for (Integer k : gunlukKazanclar) {
                if (k > ortalamaKazanc) {
                   switch (indx){
                       case 0:ortalamaninUstunde.add("Pazartesi");break;
                       case 1:ortalamaninUstunde.add("Sali");break;
                       case 2:ortalamaninUstunde.add("Carsamba");break;
                       case 3:ortalamaninUstunde.add("Persembe");break;
                       case 4:ortalamaninUstunde.add("Cuma");break;
                       case 5:ortalamaninUstunde.add("Cumartesi");break;
                       case 6:ortalamaninUstunde.add("Pazar");break;
                   }
                }
                indx++;
            }
          return ortalamaninUstunde;
        }

    public static List<String> getOrtalamaninAltindaKazancGunleri(List<Integer> gunlukKazanclar) {
        List<String> ortalamaninAltinda = new ArrayList<>();
        int ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        int indx=0;
        for (Integer k : gunlukKazanclar) {
            if (k < ortalamaKazanc) {
                switch (indx){
                    case 0:ortalamaninAltinda.add("Pazartesi");break;
                    case 1:ortalamaninAltinda.add("Sali");break;
                    case 2:ortalamaninAltinda.add("Carsamba");break;
                    case 3:ortalamaninAltinda.add("Persembe");break;
                    case 4:ortalamaninAltinda.add("Cuma");break;
                    case 5:ortalamaninAltinda.add("Cumartesi");break;
                    case 6:ortalamaninAltinda.add("Pazar");break;
                }
            }
            indx++;
        }
        return ortalamaninAltinda;
    }
*/
//--------------------------------------------------------------------------------





}
