package boletin07_04;
import java.util.Scanner;

public class Peso {
    Scanner sc=new Scanner(System.in);
    
    double peso1, peso2;
    String nom1, nom2;
    
    public void nomePeso(){
        System.out.print("Introduce el peso del primer paciente: ");
        peso1=sc.nextDouble();
        
        System.out.print("Introduce el peso del segundo paciente: ");
        peso2=sc.nextDouble();
        
        System.out.print("Introduce el nombre del primer paciente: ");
        nom1=sc.nextLine();
        
        sc.nextLine();
        System.out.print("Introduce el nombre del segundo paciente: ");
        nom2=sc.nextLine();
        
        if (peso1>peso2){
            System.out.println("El paciente que más pesa es "+nom1+" con una diferencia de peso de "+(peso1-peso2)+"kg");
        } else if (peso1==peso2){
            System.out.println("Los pacientes pesan lo mismo");
        } else{
            System.out.println("El paciente que más pesa es "+nom2+" con una diferencia de peso de "+(peso2-peso1)+"kg");
        }
    }
}
