package com.mycompany.boletin03_01;
import java.util.Scanner;

public class Boletin03_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float preciorig, precioreb;
        System.out.print("Introduce el precio original: ");
        preciorig=sc.nextFloat();
        System.out.print("Introduce el precio rebajado: ");
        precioreb=sc.nextFloat();
        float rebaja= 100-((precioreb*100)/preciorig);
        System.out.println("La rebaja es del "+rebaja+"%");
    }   
}
