package com.mycompany.boletin02_01;
import java.util.Scanner;

public class Boletin02_01 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce radio: ");
        float ra= sc.nextFloat();
        float lonxitude = (float) (2*Math.PI*ra);
        System.out.println("Lonxitude= "+lonxitude);
        
        // CON SCANN
        /* Scanner sc=new Scanner(System.in);
        float base, altura, area;
        System.out.println("Introduzca una base: ");
        base= sc.nextFloat();
        System.out.println("Introduzca una altura: ");
        altura= sc.nextFloat();
        area= base*altura/2;
        System.out.println("Área do triángulo= "+area); */
        
        
        // SIN SCANN
        /* float base=5, altura=3;
        float area= base*altura/2;
        System.out.println("Área do triángulo= "+area); */
    }
}
