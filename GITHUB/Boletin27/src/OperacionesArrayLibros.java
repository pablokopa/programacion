import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperacionesArrayLibros {
    public static void mostrarArrayListConsola(ArrayList<Libro> libros){
        System.out.println("\nListado:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    public static void mostrarArrayListVentana(ArrayList<Libro> libros){
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro);
        }
        JOptionPane.showMessageDialog(null, "Listado\n"+sb);
    }
    public static ArrayList<Libro> añadirLibro(ArrayList<Libro> libros){
        libros.add(new Libro(JOptionPane.showInputDialog("Titulo"),
                JOptionPane.showInputDialog("Autor"),
                Double.parseDouble(JOptionPane.showInputDialog("Precio por unidad")),
                Integer.parseInt(JOptionPane.showInputDialog("Unidades en stock"))));

        return libros;
    }
    public static void mostrarPrecioBuscado(ArrayList<Libro> libros,String titulo){
        Libro libMostrar = OperacionesArrayLibros.encontraLibro(libros, titulo);
        if(libMostrar==null){
            JOptionPane.showMessageDialog(null, "Error: Libro no escontrado");
        }else{
            JOptionPane.showMessageDialog(null, libMostrar.getTitulo() + " tiene un precio de " + libMostrar.getPrecio() + "€/unidad");
        }
    }
    public static void modificarPrecio(ArrayList<Libro> libros,String titulo, Double precioNuevo){
        Libro libro = OperacionesArrayLibros.encontraLibro(libros, titulo);
        if(libro==null){
            JOptionPane.showMessageDialog(null, "Error: Libro no escontrado");
        }else{
            Double precioViejo = libro.getPrecio(); // Guarda rl sntigo precio para luego
            libro.setPrecio(precioNuevo);
            JOptionPane.showMessageDialog(null, "El precio de " +libro.getTitulo()+ "a sido cambiado de " +precioViejo+ "€ a " +libro.getPrecio()+ "€");
        }
    }
    public static void venderLibro(ArrayList<Libro> libros, int cant, String titulo){
        Libro libro = OperacionesArrayLibros.encontraLibro(libros, titulo);
        if(libro==null){
            JOptionPane.showMessageDialog(null, "Error: Libro no escontrado");
        }else{
            libro.setUnidades(libro.getUnidades()-cant);
            darBajaLibro(libros, libro, titulo); // Comprobacion de unidades restantes
        }
    }
    private static Libro encontraLibro(ArrayList<Libro> libros, String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    private static void darBajaLibro(ArrayList<Libro> libros,Libro libro,String titulo){ /// Pendiente de revision
        if (libro.getUnidades()==0){
            libros.removeIf(i -> i.getTitulo()==titulo);
            JOptionPane.showMessageDialog(null, "Aviso: El libro ha sido dado de baja");
        }else{
            JOptionPane.showMessageDialog(null, "El numero de unidades en stock restantes es de "+libro.getUnidades());
        }
    }
}
