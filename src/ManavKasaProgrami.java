import java.util.Scanner;
public class ManavKasaProgrami {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double armutkg=2.14,elmakg=3.67,patlicankg=5.0,muzkg=1.1,tutar=0;
        int armutkilo,elmakilo,patlicankilo,muzkilo;
        System.out.println("Armut kaç kilo?");
        armutkilo=scan.nextInt();
        System.out.println("Elma Kaç kilo");
        elmakilo=scan.nextInt();
        System.out.println("Patlican Kaç kilo");
        patlicankilo=scan.nextInt();
        System.out.println("Muz Kaç Kilo");
        muzkilo=scan.nextInt();
        tutar=armutkg*armutkilo+elmakg*elmakilo+patlicankilo*patlicankg+muzkilo*muzkg;
        System.out.println("Tutar"+tutar);
    }
}
