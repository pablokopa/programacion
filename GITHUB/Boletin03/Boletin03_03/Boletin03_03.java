package com.mycompany.boletin03_03;
import java.util.Scanner;

public class Boletin03_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la cantidad de billetes de 5€: ");
        int bill5=sc.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 20€: ");
        int bill20=sc.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 100€: ");
        int bill100=sc.nextInt();
        System.out.println("Introduzca la cantidad de monedas de 1€: ");
        int mo1=sc.nextInt();
        
        bill5=bill5*5; bill20=bill20*20; bill100=bill100*100;
        
        int total=bill5+bill20+bill100+mo1;
        System.out.println("La cantidad total es de "+total+"€");
    }  
}
