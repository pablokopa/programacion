package com.mycompany.boletin02_02;
import java.util.Scanner;

public class Boletin02_02 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        float lado, area;
        System.out.println("Introduzca o lado: ");
        lado= sc.nextFloat();
        area= lado*lado;
        System.out.println("Área do cadrado= "+area);
        
        /* float lado=5;
        float area1=lado*lado;
        System.out.println("Área do cadrado= "+area1); */
    }
}
