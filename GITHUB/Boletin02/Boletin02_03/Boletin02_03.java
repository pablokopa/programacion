package com.mycompany.boletin02_03;
import java.util.Scanner;

public class Boletin02_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float euro, dolar, cambio;
        System.out.println("Introduzca la cantidad de euros: ");
        euro = sc.nextFloat();
        System.out.println("Introduzca el valor del dolar frente al euro: ");
        cambio=sc.nextFloat();
        dolar = euro*cambio;
        System.out.println(euro+" euros, equivale a "+dolar+" dolares");
        
        /* double euro=10, cambio=1.0635;
        double dolar=euro*cambio;
        System.out.println(dolar); */
    }
}
