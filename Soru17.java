import java.util.InputMismatchException;
import java.util.Scanner;

public class Soru17 {

    public static int maas=100;


    public static double artisHesapla(int mevcut){
        double artis=0.0;

        if ((mevcut>=20) && (mevcut<25)){
            artis=5.0/100.0;

        }else if ((mevcut>=25) && (mevcut<=30)){
            artis=10.0/100.0;
        }else if (mevcut>30){
            artis=15.0/100.0;
        }
        return maas*artis;
    }
    public static double dersSaatiHesapla(int saat){
        double artis=0.0;
        if ((saat>=15)&&(saat<20)){
            artis=5.0/100.0;
        }else if ((saat>=20)&&(saat<=25)){
            artis=10.0/100.0;
        }else if (saat>25){
            artis=15.0/100.0;
        }
        return maas*artis;
    }

    public static double maasHesapla(int mevcut,int saat){

        double ogrSayisiArtis=artisHesapla(mevcut);
        System.out.printf("Sınıf Mevcudu\t\t:₺%.0f %n",ogrSayisiArtis);
        double dersSaatiArtis=dersSaatiHesapla(saat);
        System.out.printf("Haftalık ders saati :₺%.0f%n",dersSaatiArtis);

        return maas+ogrSayisiArtis+dersSaatiArtis;

    }


    public static void main(String[] args) {
        System.out.println("Çıkmak için -1 yazın.");

        try {
            while (true) {
                Scanner oku = new Scanner(System.in);
                System.out.print("Sınıf mevcudunu giriniz:");
                int sinifMevcudu = oku.nextInt();
                if (sinifMevcudu==-1){
                    throw new Exception("Çıkış yaptınız");
                }
                System.out.print("Haftalık ders saatini giriniz:");
                int dersSaati = oku.nextInt();
                if (dersSaati==-1){
                    throw new Exception("Çıkış yaptınız");
                }
                double toplamMaas = maasHesapla(sinifMevcudu, dersSaati);
                System.out.printf("Toplam Maaş\t\t\t:₺%.0f%n", toplamMaas);

            }
            }catch (InputMismatchException e1){
            System.out.println("Doğru değerler girin!");
            }catch (Exception e2){
            System.out.println(e2.getMessage());
        }

        }

        }

