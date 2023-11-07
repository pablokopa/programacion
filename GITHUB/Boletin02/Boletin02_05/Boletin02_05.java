package com.mycompany.boletin02_05;
import java.util.Scanner;

public class Boletin02_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        final int VALOR=1852;
        System.out.println("Introduzca el numero de millas: ");
        double millas=sc.nextInt();
        double metros=millas*VALOR;
        System.out.println(millas+ " millas equivalen a " +metros+ " metros"); 
        
        
        /* int millas=30, VALOR=1852;
        int metros=millas*VALOR;
        System.out.println(millas+ " millas equivalen a " +metros+ " metros"); */
    }
}

