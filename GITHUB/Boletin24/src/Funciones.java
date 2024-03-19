import com.lucia.excepciones.ExcepcionNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Funciones {
    static ArrayList<Libro> listado = new ArrayList<>();
    public static void inicializarArrayList(){
        listado.add(new Libro("1","A","111-11-111-1111-1",11,11.1f));
        listado.add(new Libro("2","B","222-22-222-2222-2",22,22.2f));
        listado.add(new Libro("3","C","333-33-333-3333-3",33,33.3f));
        listado.add(new Libro("4","D","444-44-444-4444-4",44,44.4f));
    }
    public static void añadirLibro(String titulo, String autor, String isbn, int num, float precio){
        listado.add(new Libro(titulo,autor,isbn,num,precio));
    }
    public static void venderLibro(int cant, String isbn){
        try{
            Libro libVender = Funciones.encontraLibro(listado, isbn);
            if(libVender==null){
                throw new ExcepcionNull("ISBN no encontrado");
            }else{
                libVender.actualizarUnidades(cant);
                Funciones.darBajaLibros(libVender, isbn);
            }

        }catch (ExcepcionNull e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void mostrarListado(){
        Collections.sort(listado, (t1,t2) -> t1.getTitulo().compareTo(t2.getTitulo()));
        System.out.printf("%-28s%-23s%-22s%-10s%-10s%n", "Titulo", "Autor", "ISBN", "Unidades", "Precio");
        for(Libro l: listado) {
            System.out.println(l);
        }
    }
    public static void mostrarLibro(String isbn){
        try{
            Libro libVender = Funciones.encontraLibro(listado, isbn);
            if(libVender==null){
                throw new ExcepcionNull("ISBN no encontrado");
            }else{
                JOptionPane.showMessageDialog(null, libVender);
            }

        }catch (ExcepTionNull e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void darBajaLibros(Libro lib,String isbn){
        if (lib.getNumUnidades()==0){
            listado.removeIf(i -> i.getIsbn()==isbn);
            JOptionPane.showMessageDialog(null, "El libro ha sido dado de baja");
        }else{
            JOptionPane.showMessageDialog(null, "El numero de unidades en stock restantes es de "+lib.getNumUnidades());
        }
    }
    public static Libro encontraLibro(List<Libro> listado, String isbn) {
        for (Libro l : listado) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }
}
