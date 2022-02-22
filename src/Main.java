import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        if (tutar <= 1000) {
            kdvOran = 0.18;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar :" + tutar);
            System.out.println("KDV Oranı :" + kdvOran);
            System.out.println("KDV Tutar :" + kdvTutar);
            System.out.println("KDV'li Tutarı :" + kdvliTutar);
        }
        else if (tutar > 1000) {
            kdvOran = 0.08;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'siz Tutar :" + tutar);
            System.out.println("KDV Oranı :" + kdvOran);
            System.out.println("KDV Tutar :" + kdvTutar);
            System.out.println("KDV'li Tutarı :" + kdvliTutar);
        }


    }
}
