import java.util.Scanner;

public class Soru15 {

    public static void main(String[] args) {
        System.out.print("Bir cümle giriniz:");
        Scanner oku=new Scanner(System.in);
        String cumle=oku.nextLine();
        System.out.print("Aranacak kelime giriniz:");
        String ara=oku.next();
        if (cumle.contains(ara)){
            System.out.println(ara+" kelimesi cümlede var!");
        }else {
            System.out.println(ara+" kelimesi cümlede yok!");
        }

    }

}
