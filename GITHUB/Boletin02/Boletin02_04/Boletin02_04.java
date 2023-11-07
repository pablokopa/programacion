package com.mycompany.boletin02_04;
import java.util.Scanner;

public class Boletin02_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double num1, num2;
        System.out.println("Introduce el primer número: ");
        num1=sc.nextFloat();
        System.out.println("Introduce el segundo número: ");
        num2=sc.nextFloat();
        double  suma=num1+num2, resta=num1-num2, multi=num1*num2, div=num1/num2;
        System.out.println("Suma= "+suma+ "\nResta= "+resta+ "\nMultiplicación= "+multi+ "\nDivisión= "+div);
        
        /* float num1=5, num2=3;
        float suma=num1+num2, resta=num1-num2, multi=num1*num2, div=num1/num2;
        System.out.println("Suma= "+suma+ "\nResta= "+resta+ "\nMultiplicación= "+multi+ "\nDivisión= "+div); */
    }
}
