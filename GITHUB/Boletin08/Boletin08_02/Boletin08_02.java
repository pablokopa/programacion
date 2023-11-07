package boletin08_02;
import java.util.Scanner;

public class Boletin08_02 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Escoge una opción\n1 - (Superficie Cuadrado)\n2 - (Superficie Triángulo)\n3 - (Superficie Circulo)\n");
        int num=src.nextInt();
        Superficie obx=new Superficie();
        
        switch(num){
            case 1:
                obx.superficieCuadrado();
                break;
            case 2:
                obx.superficieTriangulo();
                break;
            case 3:
                obx.superficieCirculo();
                break;
            default: 
                System.out.println("Opción no disponible");
        }
    }  
}
