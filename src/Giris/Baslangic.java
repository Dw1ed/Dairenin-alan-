
package Giris;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        int y,r;
        double pi=3.14;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r=inp.nextInt();
        double alan=pi*r*r;
        double çevre=2*pi*r;
        System.out.println("Dairenin Alanı: "+alan);
        System.out.print("Dairenin çevresi "+çevre);

    }
}
