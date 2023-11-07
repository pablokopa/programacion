package boletinextraviernes9_10;
import java.util.Scanner;

public class ProductoIVA {
    
    Scanner sc= new Scanner(System.in);
    private float precio, valoriva, preciofinal;
    private String producto;
    private final float IVA=0.21f;
    
    public void aplicarIva(){ 
        // Pedir precio sin IVA y nombre del producto
        System.out.print("Introduce el nombre del producto: ");
        producto=sc.nextLine();
        
        System.out.print("Introduce el precio sin IVA: ");
        precio=sc.nextFloat();

        // Aplicar IVA al precio
        valoriva= precio*IVA;
        
        // Precio final con IVA aplicado
        preciofinal=precio+valoriva;
        
        // Mostrar en pantalla el resultado
        System.out.println("\nProducto: "+producto);
        System.out.println("Precio: "+preciofinal+"€");
        }
}
