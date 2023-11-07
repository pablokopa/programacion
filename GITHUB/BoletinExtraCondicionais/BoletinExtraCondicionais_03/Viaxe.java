package boletinextracondicionais_03;
import java.util.Scanner;

public class Viaxe {
    Scanner sc=new Scanner(System.in);
    
    public void precioBus(){
        System.out.print("Introduce el número de alumnos que van al viaje: ");
        int alumnos=sc.nextInt();
        
        if (alumnos>=100)
            System.out.println("El precio del viaje será de "+ (alumnos*65)+"€ en total");
        else if(alumnos>=50 && alumnos<100)
            System.out.println("El precio del viaje será de "+ (alumnos*70)+"€ en total");
        else if(alumnos>=30 && alumnos<50)
            System.out.println("El precio del viaje será de "+ (alumnos*95)+"€ en total");
        else if(alumnos<30)
            System.out.println("El precio del viaje será de "+ 4000 +"€ en total");
    }
}
