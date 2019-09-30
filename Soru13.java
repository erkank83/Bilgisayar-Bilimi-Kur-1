import java.util.Scanner;

public class Soru13 {

    static int sayac2=0,
        sayac2Toplam=0,
        sayac3=0,
        sayac3Toplam=0,
        sayac5=0,
        sayac5Toplam=0,
        not=0;
    static Scanner oku=new Scanner(System.in);



    public static void hesapla2(int not){
        if ((not%2==0) &&(not!=0)){
            sayac2++;
            sayac2Toplam+=not;
        }
    }
    public static void hesapla3(int not){
        if ((not%3==0)&&(not!=0)){
            sayac3++;
            sayac3Toplam+=not;
        }
    }
    public static void hesapla5(int not){
        if ((not%5==0) &&(not!=0)){
            sayac5++;
            sayac5Toplam+=not;
        }
    }

    public static void sayiAdetiHesapla1()throws Exception{
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i +". notu giriniz");
            not=oku.nextInt();
            if (!((not>=0) &&(not<=100))){
                throw new Exception("0 ile 100 arasında olmalıdır!");
            }
                hesapla2(not);
                hesapla3(not);
                hesapla5(not);
            }
    }

    public static void main(String[] args) {

        try {
            sayiAdetiHesapla1();
            System.out.printf("2 ile bölünebilen sayı %d tane ve toplam:%d%n" +
                              "3 ile bölünebilen sayı %d tane ve toplam:%d%n" +
                              "5 ile bölünebilen sayı %d tane ve toplam:%d%n",
                    sayac2,sayac2Toplam,sayac3,sayac3Toplam,sayac5,sayac5Toplam);


        }catch (Exception e){
            System.err.println("Hata :"+e);
        }
    }
}
