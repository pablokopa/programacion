package boletinextracondicionais_01;
import java.util.Scanner;

public class Cifras {
    Scanner sc=new Scanner(System.in);

    public void verCifras(){
        System.out.print("Introduce un número: ");
        int num=sc.nextInt();
        
        if (num<10)
            System.out.println(num+" tiene 1 cifra");
        else if(num<100)
            System.out.println(num+" tiene 2 cifras");
        else if(num<1000)
            System.out.println(num+" tiene 3 cifras");
        else if(num<10000)
            System.out.println(num+" tiene 4 cifras");
        else if(num<100000)
            System.out.println(num+" tiene 5 cifras");
        else
            System.out.println(num+" tiene más de 5 cifras");
    }
}
