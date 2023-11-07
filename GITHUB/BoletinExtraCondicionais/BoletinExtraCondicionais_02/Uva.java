package boletinextracondicionais_02;
import java.util.Scanner;

public class Uva {
    Scanner sc=new Scanner(System.in);
    
    public void precioUva(){
        // Declaración de variables
        double total;
        System.out.print("Introduce los kilogramos de uva: ");
        double kg=sc.nextDouble();
        System.out.print("Introduce el precio €/kg de la uva: ");
        double precio=sc.nextDouble();
        System.out.print("Introduce el tipo de uva (A/B): ");
        char tipo=sc.next().charAt(0);
        System.out.print("Introduce el tamaño de la uva (1/2): ");
        int tamaño=sc.nextInt();
        
        
        // Inicio condicional
        if(tipo=='A' || tipo=='a'){ // Opción tipo e uva A
            if(tamaño==1){ // Opción tamaño de uva A-1
                System.out.println("El precio sin carga/rebaja: "+ kg*precio+"€");
                total= (kg*(precio+0.2));
                System.out.println("El precio con carga/rebaja: "+ total+"€");
            } else if (tamaño==2){ // Opción tamaño de uva A-2
                System.out.println("El precio sin carga/rebaja: "+ kg*precio+"€");
                total= (kg*(precio+0.3));
                System.out.println("El precio con carga/rebaja: "+ total+"€");   
            } else if (tamaño!=1 || tamaño!=2) // Opciones distintas de 1 y 2
                System.out.println("Opción "+ tamaño+" no disponible");
        } else if(tipo=='B' || tipo=='b'){ // Opción tipo de uva B
            if(tamaño==1){ // Opción tamaño de uva B-1
                System.out.println("El precio sin carga/rebaja: "+ kg*precio+"€");
                total= (kg*(precio-0.3));
                System.out.println("El precio con carga/rebaja: "+ total+"€");
            } else if (tamaño==2){ // Opción tamaño de uva B-2
                System.out.println("El precio sin carga/rebaja: "+ kg*precio+"€");
                total= (kg*(precio-0.5));
                System.out.println("El precio con carga/rebaja: "+ total+"€");   
            } else if (tamaño!=1 || tamaño!=2) // Opciones distintas de 1 y 2
                System.out.println("Opción "+ tamaño+" no disponible");
        } else if(tipo!='A' || tipo!='a' || tipo!='B' || tipo!='b') // Opciones distintas de A y B
            System.out.println("Opción "+ tipo+" no disponible");
    }
}
