import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    private static final String ARCHIVO = "libros.txt";
    int confirmacion;

    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        while(true){
            int opt = Integer.parseInt(JOptionPane.showInputDialog("""
                                    Menu de operaciones:
                                                                   
                                1 - Cargar datos desde fichero
                                2 - Guardar datos en fichero
                                3 - Mostrar libros
                                4 - Añadir libro
                                5 - Mostrar precio de un libro
                                6 - Cambiar precio de un libro 
                                7 - Vender libros (reducir unidades)                                     
                                0 - Cerrar programa
                                                                   
                                    Elija una operacion ha realizar:                                   
                                """));
            int confirmacion = 2;
            switch(opt){
                case 0:
                    JOptionPane.showMessageDialog(null, "Cerrando programa...");
                    System.exit(0);
                    break;
                case 1:
                    confirmacion = JOptionPane.showConfirmDialog(null,"Aviso: Esta accion sobrescribira los cambios aun no guardados\n¿Desea continuar?");
                    if (confirmacion == 0){
                        libros = OperacionesLecturaEscritura.cargarListadoLibros(ARCHIVO);
                    }
                    break;
                case 2:
                    confirmacion = JOptionPane.showConfirmDialog(null,"Aviso: Esta accion sobrescribira los datos guardados en archivo\n¿Desea continuar?");
                    if (confirmacion == 0){
                        OperacionesLecturaEscritura.guardarListadoLibros(libros, ARCHIVO);
                    }
                    break;
                case 3:
                    OperacionesArrayLibros.mostrarArrayListConsola(libros);
                    OperacionesArrayLibros.mostrarArrayListVentana(libros);
                    break;
                case 4:
                    libros = OperacionesArrayLibros.añadirLibro(libros);
                    break;
                case 5:
                    OperacionesArrayLibros.mostrarPrecioBuscado(libros, JOptionPane.showInputDialog("Teclee el titulo del libro que desea buscar"));
                    break;
                case 6:
                    OperacionesArrayLibros.modificarPrecio(libros, JOptionPane.showInputDialog("Teclee el titulo del libro que desea buscar"), Double.parseDouble(JOptionPane.showInputDialog("Teclee el nuevo precio")));
                    break;
                case 7:
                    OperacionesArrayLibros.venderLibro(libros, Integer.parseInt(JOptionPane.showInputDialog("Teclee cantidad de libros a vender")), JOptionPane.showInputDialog("Teclee el titulo del libro que desea buscar"));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion elegida no es valida. Pruebe otra vez");
                    break;
            }
        }
    }
}