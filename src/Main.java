import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int enbuyuk=0, enkucuk=0;
        System.out.println("kaç sayı gireceksin?");
        n = scan.nextInt();
        int i=1;
        int sayi;

        while (i<=n){
            System.out.print(i+". sayı = ");
            sayi = scan.nextInt();
            if (i==1){
                enbuyuk=sayi;
                enkucuk=sayi;
            }
            if (sayi>enbuyuk){
                enbuyuk=sayi;
            }
            if (sayi<enkucuk){
                enkucuk=sayi;
            }
            i++;
        }
        System.out.println("enbüyük "+enbuyuk);
        System.out.println("enküçük "+enkucuk);
    }
}