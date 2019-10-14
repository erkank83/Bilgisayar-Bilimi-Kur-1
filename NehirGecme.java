package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Hayvan{
    String ad;
    public boolean yemekYeme(Object yemek){
        return false;
    }
}

class Kiyi_A extends Kiyi{
    Kiyi_A(){
        super("A kıyısı");
    }

    public void elemanCikar(Object nesne){
        elemanCikar(nesne);
    }

}

class Kiyi_B extends Kiyi{

    Kiyi_B(){
        super("B kıyısı");
    }
    public void elemanCikar(Object nesne){
        elemanCikar(nesne);
    }

}

class Kiyi{
    private List elemanlar=new ArrayList();
    private Hayvan hayvan;
    private String kiyiAdi;

    public Kiyi(String _kadi){
        kiyiAdi=_kadi;
    }

    public void kontrolsüzElemanEkle(Object nesne){
        elemanEkle(nesne);
    }
    protected void elemanCikar(int index){
        elemanlar.remove(index);

        //gerideKalanlariKontrolEt();
    }
    public Object indextenNesneye(int index){
        return elemanlar.get(index);
    }
    public void elemanEkle(Object nesne){
        elemanlar.add(nesne);
    }


    public void gerideKalanlariKontrolEt(){
    try {
         if ((elemanlar.get(0) instanceof Tilki && elemanlar.get(1) instanceof Kaz)||(elemanlar.get(1) instanceof Tilki && elemanlar.get(0) instanceof Kaz)){
              throw new Exception("Tilki ve Kaz yan yana kalamaz!");
         }else if ((elemanlar.get(0) instanceof Kaz && elemanlar.get(1) instanceof MisirCuvali)||(elemanlar.get(1) instanceof Kaz && elemanlar.get(0) instanceof MisirCuvali)){
              throw new Exception("Mısır çuvalı ve Kaz yan yana kalamaz!");
        }
        }catch (Exception e){
            System.err.println("Uyarı :"+e.getLocalizedMessage());
        }

    }

    public void kontrolluElemanEkle(Object nesne){

        try {
            if (elemanlar.isEmpty()){
                elemanEkle(nesne);
            }else if (elemanlar.size()==1){
                if (elemanlar.get(0) instanceof Tilki && nesne instanceof Tilki)
                    throw new Exception("Tilkiden sadece bir tane var!\n");
                if (elemanlar.get(0) instanceof Kaz && nesne instanceof Kaz)
                    throw new Exception("Kazdan sadece bir tane var!\n");
                if (elemanlar.get(0) instanceof MisirCuvali && nesne instanceof MisirCuvali)
                    throw new Exception("Mısır çuvalından sadece bir tane var!\n");
                //eğer ilk eleman bir hayvan ise
                if (elemanlar.get(0) instanceof Tilki){
                    hayvan=new Tilki();
                }else if(elemanlar.get(0) instanceof Kaz){
                    hayvan=new Kaz();
                }
                //eğer ilk eleman yiyecek ise
                if (elemanlar.get(0) instanceof MisirCuvali){
                    if (nesne instanceof Kaz){
                        hayvan=new Kaz();
                        nesne=elemanlar.get(0);
                    }

                }
                if (hayvan.yemekYeme(nesne)){
                    throw new Exception(hayvan.ad +" ile "+nesne.toString()+" aynı kıyıda beraber bulunamaz!");

                }
                elemanEkle(nesne);
            }

        }catch (Exception e){
            System.err.println("Uyarı: "+e.getLocalizedMessage());
        }

    }
    public void elemanlariGoster(){
        System.out.print(kiyiAdi+" :");
        if (elemanlar.isEmpty())
            System.out.print("Boş");
        for (Object nesne:elemanlar) {
            System.out.print(nesne.toString()+"("+elemanlar.indexOf(nesne)+") ");
        }
        System.out.println();
    }
}

class Tilki extends Hayvan{

    Tilki(){ad="Kurnaz tilki";}

    @Override
    public String toString() {
        return ad;
    }

    @Override
    public boolean yemekYeme(Object yemek){

        if (yemek instanceof Kaz){
            return true;
        }else
            return false;
    }

}
class Kaz extends Hayvan{

    Kaz(){ ad="Gece bekçisi kaz";}
    @Override
    public boolean yemekYeme(Object yemek){

        if (yemek instanceof MisirCuvali){
            return true;
        }else if (yemek instanceof Tilki)
        {
            return true;
        }else
            return false;
    }
    @Override
    public String toString() {
        return ad;
    }
}
class MisirCuvali{
    String ad;
    MisirCuvali(){
        ad="Mısır Çuvali";
    }
    @Override
    public String toString() {
        return ad;
    }
}
class Tekne{
    String ad;
    List kapasite;
    Ciftci ciftci;

    Tekne(){
        ad="Küçük tekne";
        kapasite=new ArrayList();
        ciftci=new Ciftci();
        kapasite.add(ciftci);
    }

    public Object teknedekiniGetir(){
        Object nesne=kapasite.get(1);
        boşalt();
        return nesne;
    }

    public void boşalt(){
        kapasite.remove(1);
    }


    public void tekneyeBindir(Object nesne){
        try {

            if (nesne instanceof Ciftci){
                throw new Exception("Teknede zaten çiftçi var!");
            }if (nesne instanceof Tekne){
                throw new Exception("Tekneye tekne koyamazsın!");
            }


            if (kapasite.size()>1){
                throw new Exception("Tekneye ancak bir nesne sığabilir!");
            }else {
                kapasite.add(nesne);
            }


        }catch (Exception e){
            System.err.println("Hata: "+e.getLocalizedMessage());
        }

    }

    public void teknedeOlanlariYaz(){
        String ad="";
        System.out.print("Teknede olanlar: ");
        for (Object eleman:kapasite) {
            if (eleman instanceof Ciftci){
                ad="Çiftçi";
            }if (eleman instanceof Kaz){
                ad="kaz";
            }if (eleman instanceof Tilki){
                ad="tilki";
            }if (eleman instanceof MisirCuvali){
                ad="Mısır çuvalı";
            }
            System.out.print(" "+ad+" ");
        }
        System.out.println("");
    }
    @Override
    public String toString() {
        return ad;
    }
}
class Ciftci{
    String ad;
    Ciftci(){ad="Akıllı çiftçi";}
    @Override
    public String toString() {
        return ad;
    }
}

public class NehirGecme {

   static Tilki tilki=new Tilki();
   static Kaz kaz=new Kaz();
   static MisirCuvali misirCuvali=new MisirCuvali();
   static Tekne tekne=new Tekne();
   static Kiyi kiyiA=new Kiyi_A();
   static Kiyi kiyiB=new Kiyi_B();


   public static void goster(){

       kiyiA.elemanlariGoster();
       tekne.teknedeOlanlariYaz();
       kiyiB.elemanlariGoster();
   }

    public static void main(String[] args) {

        System.err.println("1. İşlem: Kazı nehrin karşı tarafına taşıyın.");
        System.out.println("1-) Önce");
        kiyiA.kontrolsüzElemanEkle(misirCuvali);
        kiyiA.kontrolsüzElemanEkle(tilki);
        kiyiA.kontrolsüzElemanEkle(kaz);
        goster();
        System.out.println("1-) Nehirden geçerken..");
        kiyiA.elemanCikar(2);
        tekne.tekneyeBindir(kaz);
        goster();
        System.out.println("1-) Sonra");
        kiyiB.kontrolluElemanEkle(tekne.teknedekiniGetir());
         goster();
        System.err.println("2. İşlem: Tekneyi bir kıyıdan diğerine götürün.");
        System.err.println("3. İşlem: Tilkiyi nehrin karşı tarafına taşıyın.");
        System.out.println("3-) Nehirden geçerken..");
        kiyiA.elemanCikar(1);
        tekne.tekneyeBindir(tilki);
        goster();
        System.out.println("3-) Sonra");
        kiyiB.kontrolluElemanEkle(tilki);
        tekne.boşalt();
        kiyiB.kontrolsüzElemanEkle(tilki);
        kiyiB.elemanCikar(0);
        tekne.tekneyeBindir(kaz);
        goster();
        System.err.println("4. İşlem: Kazı nehrin karşı tarafına taşıyın.");
        kiyiA.kontrolluElemanEkle(kaz);
        kiyiA.kontrolsüzElemanEkle(kaz);
        tekne.boşalt();
        goster();
        System.err.println("5. İşlem: Mısır çuvalını nehrin karşı tarafına taşıyın.");
        kiyiA.elemanCikar(0);
        System.out.println("5-) Nehirden geçerken");
        tekne.tekneyeBindir(misirCuvali);
        goster();
        System.out.println("5-) Sonra");
        kiyiB.kontrolluElemanEkle(tekne.teknedekiniGetir());
        goster();
        System.out.println("6. İşlem: Tekneyi bir kıyıdan diğerine götürün.");
        System.out.println("7. İşlem: Kazı nehrin karşı tarafına taşıyın.");
        System.out.println("7-) Nehirden geçerken");
        kiyiA.elemanCikar(0);
        tekne.tekneyeBindir(kaz);
        goster();
        System.out.println("7-) Sonra");
        kiyiB.kontrolsüzElemanEkle(kaz);
        tekne.boşalt();
        goster();

    }

}
