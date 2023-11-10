package boletin11_02;
import java.util.Scanner;

public class Boletin11_02 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int num = (int) (Math.random()*50+1);
        System.out.print("Introduce un número: ");
        int opcion=src.nextInt();
        
        while (opcion!=num){
            System.out.print("Introduce un número: ");
            opcion=src.nextInt();
            int diferencia=num-opcion;
            
            if (opcion>0 && opcion<50){
                if (diferencia>20){
                    System.out.println("Moi lonxe");
                } else if (diferencia<=20 && diferencia>=10){
                    System.out.println("Lonxe");
                } else if (diferencia>=10 && diferencia<5){
                    System.out.println("Preto");
                } else if (diferencia<=5){
                    System.out.println("Moi preto");
                } else if( num==opcion){
                    System.out.println("¡CORRECTO!");
                }              
            }
        }
    }
}