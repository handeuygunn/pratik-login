import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, pasword;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz:");
        username = input.nextLine();

        System.out.println("Sifrenizi Giriniz:");
        pasword = input.nextLine();

        if (username.equals("patika") && pasword.equals("java123")) {

            System.out.println("Basarili Bir Sekilde Giris Yaptiniz");
        } else {
            System.out.println("Hatalı Kullanici Adi veya Sifre");
        }


    }
}
