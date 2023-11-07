package boletin07_02;
import java.util.Scanner;

public class SumRes {
    Scanner sc=new Scanner(System.in);
    short num1, num2;
    
        
    public void sumaresta(){
        System.out.print("Introduce el primer número: ");    
        num1= sc.nextShort();
        System.out.print("Introduce el segundo número: ");    
        num2= sc.nextShort();
        
        if (num1>=num2){
            System.out.println("Resta: "+(num1-num2));
        }
            System.out.println("Suma: "+(num1+num2));
    }
}
