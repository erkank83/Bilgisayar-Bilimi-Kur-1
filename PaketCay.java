package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class PaketCay {

    public static void main(String[] args) {
        int paketCay=10;
        int paketSayisi;
        float indirim;
        System.out.print("Paket sayısı giriniz: ");
        Scanner oku=new Scanner(System.in);
        paketSayisi=oku.nextInt();
        if ((paketSayisi>=10)&&(paketSayisi<50)){
            indirim=(float)0.05;
        }else  if ((paketSayisi>=50)&&(paketSayisi<100)){
            indirim=(float)0.10;
        }else {
            indirim=(float)0.15;
        }
        double toplam=paketCay*paketSayisi;
        double kdv=toplam*0.08;
        double satis=(toplam+kdv)-(toplam+kdv)*indirim;
        System.out.printf("Toplam:\t%+10.2f TL%nKDV: \t%+10.2f TL%nİndirim:%10.2f TL%nSatiş:\t%+10.2f TL",toplam,kdv,-1*(toplam+kdv)*indirim,satis);
    }

}
