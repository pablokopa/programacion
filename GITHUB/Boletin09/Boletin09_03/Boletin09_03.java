package boletin09_03;
import java.util.Scanner;

public class Boletin09_03 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        float base, altura;
        System.out.print("Introduza la base: ");
        base=src.nextFloat();
        System.out.print("Introduza la altura: ");
        altura=src.nextFloat();
        
        if (base>0 && altura>0){
            float resultado=base*altura/2;
            System.out.print("El área del triángulo es de: "+resultado);
        } else
            System.out.println("Área no disponible con números negativos");
    }
}
