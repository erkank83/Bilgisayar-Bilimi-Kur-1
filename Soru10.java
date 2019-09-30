import java.util.Scanner;

interface ICalisan{
  void tabanUcretiOde();
  void saatlikUcretiHesapla();
  void fazlaMesaiUcretiHesapla();
  void devamsizlikRaporuUretme();
}

abstract class Calisan implements ICalisan{
    String ad="personel";
    Calisan(){}
    @Override
    public void devamsizlikRaporuUretme() {
        System.out.println("Devamsızlık raporu üretildi.");
    }

    @Override
    public void fazlaMesaiUcretiHesapla() {
        System.out.println("Fazla mesai ücreti hesaplandı.");
    }

    @Override
    public void saatlikUcretiHesapla() {
        System.out.println("Saatlik ücret hesaplandı.");
    }

    @Override
    public void tabanUcretiOde() {
        System.out.println("Taban ücret ödendi.");
    }
    public abstract void maasHesapla(int saat);
}

class M extends Calisan{
    M(){ ad="Müdür";}

    @Override
    public void maasHesapla(int saat) {
        tabanUcretiOde();
        if (saat>40){
            fazlaMesaiUcretiHesapla();
        }
    }
}
class S extends Calisan{

    S(){ ad="Sekreter";}

    @Override
    public void maasHesapla(int saat) {
        saatlikUcretiHesapla();
        if (saat<40){
            devamsizlikRaporuUretme();
        }else if(saat>40){
            fazlaMesaiUcretiHesapla();
        }
    }
}


public class Soru10 {

    static Calisan calisan;
    static Scanner oku=new Scanner(System.in);
    static String okunan;
    static int saat;

    public static void main(String[] args) {

        try {
            System.out.print("Çalışan Tipi giriniz (M/S): ");
            okunan=oku.next();
            if (okunan.toUpperCase().equals("M")){ calisan=new M(); }else if (okunan.toUpperCase().equals("S")){
                calisan=new S();
            }
            System.out.print(calisan.ad+ " çalışma saatini giriniz :");
            saat=oku.nextInt();
            calisan.maasHesapla(saat);
        }catch (NullPointerException e){
            System.out.println("Lütfen doğru değerler girin!!");

        }catch (Exception e1){
            System.out.println("Hata :"+e1);
        }
    }
}
