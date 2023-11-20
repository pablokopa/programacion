package boletin14;

import partes.Monitor;
import partes.Procesador;
import partes.Teclado;

public class Boletin14 {
    public static void main(String[] args) {
        Ordenador obj=new Ordenador(new Monitor(26, 200, "Samsung"), new Teclado(100, "Logitech", "Mecánico"), new Procesador(350, "Intel", "3.5GHz"), 1500);
    
        System.out.println("Características: "+obj.toString());
        System.out.println("Precio: "+obj.getPrecio()+"€");
        System.out.println("Marca Teclado: "+obj.getTe().marca);
        System.out.println("Velocidad CPU: "+obj.getPro().velocidad);
    }
}
