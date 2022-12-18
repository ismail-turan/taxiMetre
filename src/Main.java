import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taksi Metre Uygulamasına Hoş Geldiniz");
        Scanner imput=new Scanner(System.in);
        System.out.print("Lütfen Gidilen Toplam Mesafeyi Giriniz :");
        double gidilenYol=imput.nextDouble();
        double kmYol=2.20;
        double acilis=10;
        double hesap=acilis+gidilenYol*kmYol;
        double toplam=(hesap<20)? 20:hesap;
        System.out.println("Normalde ücret : "+hesap);
        System.out.println("Toplam Tutar : "+toplam);
    }
}