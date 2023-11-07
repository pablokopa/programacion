package boletin07_05;
import java.util.Scanner;

public class Maior {
    Scanner sc=new Scanner(System.in);
    int num1, num2, num3;
    
    public void maiorTres(){
        System.out.print("Introduce el primer número: ");
        num1=sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2=sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3=sc.nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println(num1+" es el mayor");
        } else if (num2>num1 && num2>num3){
            System.out.println(num2+" es el mayor");
        } else {
            System.out.println(num3+" es el mayor");
        }
    }
}

