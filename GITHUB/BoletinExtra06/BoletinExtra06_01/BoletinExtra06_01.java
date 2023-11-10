package boletinextra06_01;
import java.util.Scanner;

public class BoletinExtra06_01 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        final double cota=800d;
        System.out.print("Introduce tu edad: ");
        int edad=src.nextInt();
        double preciofinal;
        
        if (edad>=65){
            preciofinal= cota-(cota*0.4);
            System.out.println("A cota será de "+preciofinal+" €");
        } else if(edad<=21 && edad>0) {
            System.out.println("Pais socios:\n1-SI\n2-NO");
            int socios=src.nextInt();
            if (socios==1){
                preciofinal= cota-(cota*0.25);
                System.out.println("A cota será de "+preciofinal+" €");                
            } else if (socios==2){
                preciofinal= cota-(cota*0.45);
                System.out.println("A cota será de "+preciofinal+" €");
            }
        } else if(edad>21 || edad<65){
            System.out.println("A cota será de "+cota);
            }
    }
}
