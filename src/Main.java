//Formül: Kilo (kg) / Boy(m) * Boy(m)

import java.util.Scanner;

public class Main{
    public static void main(String[]src){

        double boy, kilo, vki;

        Scanner inp=new Scanner(System.in);

        System.out.println("Boyunuzu giriniz: ");
        boy= inp.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo= inp.nextDouble();

        boy=boy/100;

        vki=(kilo/(boy*boy));
        System.out.println("Vücut kitle indeksiniz:"+vki);

    }
}