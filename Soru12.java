import java.util.Scanner;

public class Soru12 {

    static int not=0,toplamNot=0;
    static float ortalama=0;
    static Scanner oku=new Scanner(System.in);

    static float notHesapla1(int ogrSayi){
        int sayac=0;
        toplamNot=0;
        while (sayac<ogrSayi){
           sayac++;
           System.out.print(sayac+". notu giriniz :");
           not=oku.nextInt();
           toplamNot+=not;

        }
        ortalama=toplamNot/ogrSayi;

        return ortalama;
    }

    static float notHesapla2(int ogrSayi){
        int sayac=0;
        toplamNot=0;
        do {
            sayac++;
            System.out.print(sayac+". notu giriniz :");
            not=oku.nextInt();
            toplamNot+=not;
        }while (!(sayac>=ogrSayi));
        ortalama=toplamNot/ogrSayi;

        return ortalama;
    }

     static float notHesapla3(int ogrSayi){
        toplamNot=0;
        for (int i = 1; i <=ogrSayi ; i++) {
            System.out.print(i+". notu giriniz :");
            not=oku.nextInt();
            toplamNot+=not;
        }
        ortalama=toplamNot/ogrSayi;

        return ortalama;
    }


    public static void main(String[] args) {


            try {
                System.out.println("Çıkmak için -1 giriniz!!");
                System.out.print("Öğrenci sayısı giriniz");
                int ogrSayisi = oku.nextInt();
               if(ogrSayisi==-1)return;
                if (ogrSayisi>0) {

                    float ort1 = notHesapla1(ogrSayisi);
                    System.out.println("Ortalama 1 :" + ort1);
                    float ort2 = notHesapla2(ogrSayisi);
                    System.out.println("Ortalama 2 :" + ort2);
                    float ort3 = notHesapla3(ogrSayisi);
                    System.out.println("Ortalama 3 :" + ort3);
                }else{
                    System.err.println("Öğrenci sayısı 0'dan büyük olmalı!");
                }

                } catch (Exception e) {
                System.err.println("Lütfen doğru değerler girin!");
            }

    }
}
