package com.mycompany.boletin03_04;
import java.util.Scanner;

public class Boletin03_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un cantidad de dinero: ");
        int dinero=sc.nextInt();
        int bill100=dinero/100;
        dinero%=100;
        int bill20=dinero/20;
        dinero%=20;
        int bill5=dinero/5;
        dinero%=5;
        int mo1=dinero/1;
        System.out.println("Hay "+bill100+" billete/s de 100€, "+bill20+" billete/s de 20€, "+bill5+" billete/s de 5€, y "+mo1+" moneda/s de 1€");
    }   
}
