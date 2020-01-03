import java.util.Scanner;

public class Soru11 {

    static Scanner oku=new Scanner(System.in);
    static float not;

    public static String pozitifMantik1(float not){

        String notum="";
        if(not>=90){      notum="A";
        }else if(not>=80){notum="B";
        }else if(not>=70){notum="C";
        }else if(not>=60){notum="D";
        }else {           notum="F";}
        return notum;

    }

    public static String negatifMantik1(float not){

        String notum="";
        if (!(not<90))    notum="A";
        else if(!(not<80))notum="B";
        else if(!(not<70))notum="C";
        else if(!(not<60))notum="D";
        else notum="F";

        return notum;
    }
    public static String pozitifMantik2(float not){

        String notum="";
        if(not<60){      notum="F";
        }else if(not<70){notum="D";
        }else if(not<80){notum="C";
        }else if(not<90){notum="B";
        }else {          notum="A";}
        return notum;
    }

    public static String negatifMantik2(float not){
        String notum="";
        if(!(not>=60))notum="F";
        else if(!(not>=70))notum="D";
        else if(!(not>=80))notum="C";
        else if(!(not>=90))notum="B";
        else               notum="A";
        return notum;
    }

    public static void main(String[] args) {

        try {
            System.out.print("0 ile 100 arasında bir sayı giriniz :");
            not=oku.nextFloat();
            if (!((not>=0) &&(not<=100))){
          throw new Exception("Sayı 0 ile 100 arasında olmak zorundadır ");
            }

            String mesaj1=pozitifMantik1(not);
            String mesaj2=pozitifMantik2(not);
            String mesaj3=negatifMantik1(not);
            String mesaj4=negatifMantik2(not);

            System.out.println(mesaj1);
            System.out.println(mesaj2);
            System.out.println(mesaj3);
            System.out.println(mesaj4);



        }catch (Exception e){
            System.out.println("Hata:"+e+"\nLütfen tekrar deneyin");
        }



    }


}
