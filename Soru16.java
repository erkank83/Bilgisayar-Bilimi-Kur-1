import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Ogrenci{

    List<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
    String ad;

    Ogrenci(String ad){

        this.ad=ad;
    }

    Ogrenci(){
        setOgrenciler();
    }


    public void setOgrenciler(){

        ogrenciler.add(new Ogrenci("A"));
        ogrenciler.add(new Ogrenci("B"));
        ogrenciler.add(new Ogrenci("C"));
        ogrenciler.add(new Ogrenci("Ç"));
        ogrenciler.add(new Ogrenci("D"));
        ogrenciler.add(new Ogrenci("E"));
        ogrenciler.add(new Ogrenci("F"));
        ogrenciler.add(new Ogrenci("G"));
        ogrenciler.add(new Ogrenci("H"));
        ogrenciler.add(new Ogrenci("I"));
    }


    public void ogrYaz(){

            for (Ogrenci ogrenci : ogrenciler) {

                System.out.print(ogrenci.ad + " ");

            }
    }
    public void ogrKaristir(){
        System.err.println("\tÖğrenciler karıştırılıyor...");
        Collections.shuffle(ogrenciler);
    }
    public void ogrEle(){

        for (int i = 0; i <ogrenciler.size() ; i++) {
            if (!(i==0)){
            if ((i%2==0)){
                ogrenciler.remove(i);
            }
            }
        }
        System.out.println();
    }
    public void coz(){

        ogrYaz();
        System.out.println("-->İlk hali");
        ogrKaristir();

        while (ogrenciler.size()!=2){
            ogrYaz();
            ogrEle();
        }
        ogrYaz();
    }
}


public class Soru16 {
    public static void main(String[] args) {
    new Ogrenci().coz();
    }
}
