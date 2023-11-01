import java.util.Scanner;

public class App {
    /*
     Proje Konusu 
    #Java ile girilen sayıya kadar olan, n değerininde kullacıdan alındığı n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.

    Örnek Çıktı
    N Değerini Giriniz : 2
    Sınır Değerini Giriniz : 20
    1
    2
    4
    8
    16
     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number;
        int border;
        int i;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        System.out.print("Sınır değeri giriniz: ");
        border = input.nextInt();

        for(i = 1; i <= border; i *= number) {
            System.out.println(i);
        }
        
    }
}
