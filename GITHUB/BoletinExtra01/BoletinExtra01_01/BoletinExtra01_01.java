package com.mycompany.boletinextra01_01;
import java.util.Scanner;

public class BoletinExtra01_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome, datan;
        System.out.println("Introduce tu nombre: ");
        nome=sc.nextLine();
        System.out.println("Introduce tu fecha de nacimiento: ");
        datan=sc.nextLine();
        System.out.println("\nNome: "+nome);
        System.out.println("Data nacemento: "+datan);
    }
    
}

