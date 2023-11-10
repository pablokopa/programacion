package boletin09_04;
import java.util.Scanner;

public class Boletin09_04 {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=src.nextInt();
        
        for (int i=1; i<11; i++){
            int multi= num*i;
            System.out.println(multi);
        }
    }  
}
