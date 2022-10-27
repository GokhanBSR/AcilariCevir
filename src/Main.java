import javax.swing.*;
import java.util.Scanner;

/**
//* Kullanıcıdan açı ölcüleri alan (360dan büyük girer ise tam açı ölcüsü) ve
 kaç tane alacagını nöbetci bir deger ile durduran
 //bu acıların sinuslerini hesaplayıp sinusleri ortalamasını bulan program yazınız.
 //
 //özel acıların (90,180,360) isimlerini ve sayıları ekrana basan
 //90-> "2tane dik açı"
 //180 -> "3 tane düz açı"
 //360 -> "4 tane tam açı"
 //ekrana testen basan program
//*
//*  //while (sayi,sayi1,sayi2 >0 && sayi,sayi1,sayi2<=360);
 //        //public static double sin(double sayi);
 //        // if (acilar > 0 && acilar <= 360);
 //System.out.println("Sayının Sinüs Değeri:" + Math.sin(reader.nextDouble())  );
// **/

public class Main {

    int dikAci =90;
    int duzAci =180;
    int tamAci=360;
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);

        System.out.println("ilk açıyı giriniz");
        double sayi =reader.nextInt();
        System.out.println("Sinüs:"+Math.sin (sayi));

        System.out.println("ikinci açıyı giriniz");
        double sayi1 =reader.nextInt();
        System.out.println("Sinüs:"+Math.sin (sayi1));

        System.out.println("üçüncü açıyı giriniz");
        double sayi2 =reader.nextInt();
        System.out.println("Sinüs:"+Math.sin (sayi2));

        if (sayi+sayi1+sayi2 == 90);
        System.out.println("Dikaçı:");
        if (sayi+sayi1+sayi2 ==360);
        System.out.println("Tam Açı:");
        if (sayi+sayi1+sayi2 ==180);
        System.out.println("Düz Açı:");{
        if (sayi+sayi1+sayi2 <90 && sayi+sayi1+sayi2 >360 );

            System.out.println("Açıların toplamı 90'dan Küçük veya 360'dab Büyük Olamaz"+ "Tekrar Deneyin");
        }

    }
}
