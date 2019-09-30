import java.util.Scanner;

public class Soru14 {

    static Scanner oku=new Scanner(System.in);
    static String sifre="";
    static boolean karakterKontrol,simgeKontrol,sayiKontrol;
    static int sifreGucuSayaci=0;
    static String uyariMesaji="";

    public static void simgeKotrolEt(){
        if (!((sifre.contains("*")||sifre.contains("+")||sifre.contains("&")))){
            uyariMesaji+="*.+,& simgelerinden ez az biri içermelidir!\n";
        }else {
            simgeKontrol=true;
            sifreGucuSayaci++;
        }

    }

    public static void sayiKontrolEt(){
        if (!(sifre.contains("1")||
              sifre.contains("2")||
              sifre.contains("3")||
              sifre.contains("4")||
              sifre.contains("5")||
              sifre.contains("6")||
              sifre.contains("7")||
              sifre.contains("8")||
              sifre.contains("9")||
              sifre.contains("0") )){

            uyariMesaji+="0-9 arası sayı içermelidir!!\n";

        }else {
            sayiKontrol=true;
            sifreGucuSayaci++;
        }

    }


    public static void karakterKontrolEt(){
        System.out.print("Şifre giriniz :");
        sifre= oku.next();
        if (sifre.length()<8){
            uyariMesaji+="8 ve daha yukarı karakter giriniz!\n";
        }else {
            karakterKontrol=true;
            sifreGucuSayaci++;
        }


    }
    public static String sifreGucu(){

        String mesaj="";
        switch (sifreGucuSayaci){

            case 3: mesaj="Güçlü Şifre";
            break;
            case 2: mesaj="Kabul Edilebilir";
            break;
            case 1: mesaj="Zayıf";
            break;
            case 0: mesaj="Asla Kullanılamaz";
            break;

        }
        return mesaj;

    }


    public static void main(String[] args) {
            karakterKontrolEt();
            simgeKotrolEt();
            sayiKontrolEt();
            if (sifreGucuSayaci!=3){
                System.err.println("Uyarı :\n"+uyariMesaji);
            }
            System.out.println("Şifre gücü:"+sifreGucu());

    }

}
