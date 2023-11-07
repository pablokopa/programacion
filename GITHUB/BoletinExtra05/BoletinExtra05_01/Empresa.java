package boletinextra05_01;
import java.util.Scanner;

public class Empresa {
    Scanner src=new Scanner(System.in);
    final double precio=78d;
    
    public void pagoEfectivo(){ 
        System.out.print("\nIntroduce la cantidad de impresoras: ");
        double impresoras=src.nextDouble();
        double preciosin= impresoras*precio;
        double desconto=impresoras*(precio*0.1);
        double preciofinal= impresoras*precio-desconto;
        
        System.out.println("\nA cantidade de impresoras a comprar é de: "+impresoras+"\nO precio unitario de cada impresora é de: "+precio+" €");
        System.out.println("La forma de pago escogida es: Efectivo");
        System.out.println("O desconto realizado é de: "+desconto+" €");
        System.out.println("El precio sin descuento es: "+preciosin+" €");       
        System.out.println("El precio con descuento es: "+preciofinal+" €");
    }
    
    public void pagoTarxeta(){ 
        System.out.print("\nIntroduce la cantidad de impresoras: ");
        double impresoras=src.nextDouble();
        double preciosin= impresoras*precio;
        double desconto=impresoras*(precio*0.05);
        double preciofinal= impresoras*precio-desconto;
        
        System.out.println("\nA cantidade de impresoras a comprar é de: "+impresoras+"\nO precio unitario de cada impresora é de: "+precio+" €");
        System.out.println("La forma de pago escogida es: Efectivo");
        System.out.println("O desconto realizado é de: "+desconto+" €");
        System.out.println("El precio sin descuento es: "+preciosin+" €");       
        System.out.println("El precio con descuento es: "+preciofinal+" €");
    }

    public void pagoVale(){ 
        System.out.print("\nIntroduce la cantidad de impresoras: ");
        double impresoras=src.nextDouble();
        double preciosin= impresoras*precio;
        double desconto=impresoras*(precio*0.15);
        double preciofinal= impresoras*precio-desconto;
        
        System.out.println("\nA cantidade de impresoras a comprar é de: "+impresoras+"\nO precio unitario de cada impresora é de: "+precio+" €");
        System.out.println("La forma de pago escogida es: Efectivo");
        System.out.println("O desconto realizado é de: "+desconto+" €");
        System.out.println("El precio sin descuento es: "+preciosin+" €");       
        System.out.println("El precio con descuento es: "+preciofinal+" €");
    }
}
