package com.mycompany.boletinextra01_02;
import java.util.Scanner;

public class BoletinExtra01_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float parcial1, parcial2, nfinal;
        System.out.print("Introduce la nota del primer parcial: ");
        parcial1= sc.nextFloat();
        System.out.print("Introduce la nota del segundo parcial: ");
        parcial2= sc.nextFloat();
        nfinal=(parcial1+parcial2)/2;
        System.out.println("\nLa nota del primer parcial es: "+parcial1+"\nLa nota del segundo parcial es: "+parcial2+"\nLa media final es: "+nfinal);
    }
}