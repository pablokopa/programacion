package com.mycompany.boletin03_02;
import java.util.Scanner;

public class Boletin03_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float celsius;
        System.out.println("Introduzca una temperatura en Celsius: ");
        celsius=sc.nextFloat();
        double fahrenheit= celsius*1.8+32;
        double kelvin= celsius+273.15;
        System.out.println(celsius+"ºC equivale a "+fahrenheit+"ºF y a "+kelvin+"K");
    } 
}
