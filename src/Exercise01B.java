import java.util.Scanner;

public class Exercise01B {
    public static void main(String[] args) {
        //Scaner
        Scanner dhiaz = new Scanner(System.in);
        double x;
        double r;
        double s,sTotal,sTurun,sNaik;
        String nama;
        System.out.println("masukan lintasan bola dari awal sampai akhir" );
        System.out.println("masukan nama anda");
        nama = dhiaz.nextLine();
        System.out.println("masukan ketinggian bola");
        x = dhiaz.nextDouble();
        System.out.println("masukan coef r");
        r = dhiaz.nextDouble();
        s = x/ (1-r);
        System.out.println("S naik dari sebuah bola : " +s);



    }
}
