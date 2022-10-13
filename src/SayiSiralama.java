import java.sql.SQLOutput;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {

        double a, b, c, enbuyuk, ikincibuyuk, enkucuk;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz:");
        a = input.nextDouble();

        System.out.println("İkinci sayiyi giriniz:");
        b = input.nextDouble();

        System.out.println("Üçüncü sayiyi giriniz:");
        c = input.nextDouble();

        if(a > b && a > c){
            enbuyuk = a;
        }else if(b > a && b > c){
            enbuyuk = b;
        }else{
            enbuyuk = c;
        }


        if(enbuyuk > a && enbuyuk > b ){
            if(a > b){
                ikincibuyuk = a;
                enkucuk = b;
                System.out.println("En buyuk sayi" + enbuyuk);
                System.out.println("Ortanca sayi" + ikincibuyuk);
                System.out.println("En kücük sayi" + enkucuk);

            }else{
                ikincibuyuk = b;
                enkucuk = a;
                System.out.println("En buyuk sayi" + enbuyuk);
                System.out.println("Ortanca sayi" + ikincibuyuk);
                System.out.println("En kücük sayi" + enkucuk);
            }

        }
        if(enbuyuk > c && enbuyuk > b ) {
            if (c > b) {
                ikincibuyuk = c;
                enkucuk = b;
                System.out.println("En buyuk sayi" + enbuyuk);
                System.out.println("Ortanca sayi" + ikincibuyuk);
                System.out.println("En kücük sayi" + enkucuk);

            } else {
                ikincibuyuk = b;
                enkucuk = c;
                System.out.println("En buyuk sayi" + enbuyuk);
                System.out.println("Ortanca sayi" + ikincibuyuk);
                System.out.println("En kücük sayi" + enkucuk);
            }
        }
        if(enbuyuk > a && enbuyuk > c ) {
            if (a > c) {
                ikincibuyuk = a;
                enkucuk = c;
                System.out.println("En buyuk sayi" + enbuyuk);
                System.out.println("Ortanca sayi" + ikincibuyuk);
                System.out.println("En kücük sayi" + enkucuk);

            } else {
                ikincibuyuk = c;
                enkucuk = a;
                System.out.println("En buyuk sayi" + enbuyuk);
                System.out.println("Ortanca sayi" + ikincibuyuk);
                System.out.println("En kücük sayi" + enkucuk);
            }
        }
    }
}
