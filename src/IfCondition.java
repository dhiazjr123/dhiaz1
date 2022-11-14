import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner Shirlizlee = new Scanner(System.in);
        System.out.println("Input password");
        String password = Shirlizlee.nextLine();
        if (password.equals("abcdf")) {
            System.out.println("Password benar");
        }else {
            System.out.println("Password salah");
        }
    }
}
