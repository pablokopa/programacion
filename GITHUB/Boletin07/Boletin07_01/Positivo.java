package boletin07_01;
import java.util.Scanner;

public class Positivo {
    Scanner sc= new Scanner(System.in);
    int num;
    
    public void numPositivo(){
        System.out.print("Introduce un número: ");
        num=sc.nextInt();
        if (num>=0){
            System.out.println("El número es positivo");
        }
        else{
            System.out.println("El número es negativo");
        }
    }
}
