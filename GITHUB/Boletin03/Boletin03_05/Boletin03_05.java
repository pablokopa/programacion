package boletin03_05;
import java.util.Scanner;

public class Boletin03_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Introduzca el sueldo bruto: ");
        double bruto=sc.nextFloat();
        System.out.print("Introduzca los kilometros realizados: ");
        double kms=sc.nextFloat();
        kms=kms*2;
        double comision= bruto*0.05;
        final int dietas=30*30;
        double irpf=bruto*0.18;
        final int ss=36;
        double total= (bruto-irpf-ss)-comision-kms-dietas;
        System.out.println(total);
    }
}
