package boletinextraviernes9_10;
import java.util.Scanner;

public class Ecuacion {
    Scanner sc=new Scanner(System.in);
    
    // Declaracion de variables
    private double a, b, c, raiz, resultado1, resultado2;
    
    //Método ecuación           
    public void hacerEcuacion(){
        
        // Leer y pedir valores
        System.out.print("Introduce el primer número: ");
        a=sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        b=sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        c=sc.nextDouble();
        
        // Calcular raiz
        raiz= Math.sqrt(Math.pow(b, b)-(4*a*c));
        
        // Resultados
        resultado1=-b+raiz/(2*a);
        resultado2=-b-raiz/(2*a);
        
        // Mostrar resultados
        System.out.println("Los resultados de la ecuacion son: "+resultado1+" y "+resultado2);
    }
}
