package boletinextra05_01;
import java.util.Scanner;

public class BoletinExtra05_01 {
    public static void main(String[] args) {
        Empresa obxEmpresa = new Empresa();
        Scanner src=new Scanner(System.in);
        
        System.out.println("Escoja una opción de pago:\n-Efetivo (10% descuento)\n-Tarxeta de crédito (5% descuento)\n-Vale de regalo (15% descuento)\n");
        int num= src.nextInt();
        
        switch(num){
            case 1: obxEmpresa.pagoEfectivo();
            case 2: obxEmpresa.pagoTarxeta();
            case 3: obxEmpresa.pagoVale();
        }        
    }   
}
