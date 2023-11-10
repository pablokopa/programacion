package boletin09_05;
import java.util.Scanner;

public class Boletin09_05 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in); 
        double sumador1=0; // sumador entre 1000 y 1750
        double sumador2=0; // sumador menos de 1000
        System.out.println("Introduce una opción\n0- Parar\n1- Seguir");
        int opcion=src.nextInt();
        
        while (opcion==1){
            System.out.print("Introduce el sueldo: ");
            double sueldo=src.nextDouble();

            if (sueldo>=1000 && sueldo<=1750){
                sumador1++;
            } else if (sueldo<1000 && sueldo>0)
                sumador2++;
            else if (sueldo<0 && sueldo>1750)
                System.out.println("Cantidade non dispoñible");
            
            System.out.println("Trabajadores con sueldos entre 1000€ y 1750€: "+sumador1);
            System.out.println("Porcentaje de trabajadores con sueldos menores que 1000€: "+(sumador2*0.1)+" % de los trabajadores");
        } 
    }
}
