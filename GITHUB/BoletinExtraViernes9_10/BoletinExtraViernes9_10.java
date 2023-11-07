package boletinextraviernes9_10;

public class BoletinExtraViernes9_10 {
    public static void main(String[] args) {
        
        // Clase ProductoIVA
        System.out.println("========PRODUCTO========");
        ProductoIVA obxIva= new ProductoIVA(); 
        obxIva.aplicarIva();
        
        // Clase Ecuacion
        System.out.println("\n========ECUACIÓN========");
        Ecuacion obxEc= new Ecuacion();
        obxEc.hacerEcuacion();
    }
}