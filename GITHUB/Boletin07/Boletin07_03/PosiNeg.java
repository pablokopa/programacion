package boletin07_03;
import java.util.Scanner;

public class PosiNeg {
    Scanner sc=new Scanner(System.in);
    
    public void posineg(){
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        
        if(num>0){
            System.out.println("+");
        }
        else if(num<0){
            System.out.println("-");
        }
        else{
            System.out.println("0");
        }

    }
}
