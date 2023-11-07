package boletin08_02;
import java.util.Scanner;

public class Superficie {
    Scanner src=new Scanner(System.in);
    
    public void superficieCuadrado(){
        System.out.print("Introduce el valor del lado: ");
        float lado=src.nextFloat();
        float superficie=lado*lado;
        System.out.println("La superficie es: "+superficie);
    }
    
    public void superficieTriangulo(){
        System.out.print("Introduce el valor de la base: ");
        float base=src.nextFloat();
        System.out.print("Introduce el valor de la altura: ");
        float altura=src.nextFloat();
        float superficie=base*altura/2;
        System.out.println("La superficie es: "+superficie);
    }

    public void superficieCirculo(){
        System.out.print("Introduce el valor del radio: ");
        double radio=src.nextFloat();
        double superficie=Math.PI*(radio*radio);
        System.out.println("La superficie es: "+superficie);
    }    
}
