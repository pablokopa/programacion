public class Libro {
    private String titulo,autor,isbn;
    private int numUnidades;
    private float precio;
    public Libro(String titulo, String autor, String isbn, int numUnidades, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numUnidades = numUnidades;
        this.precio = precio;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getNumUnidades() {
        return numUnidades;
    }
    @Override
    public String toString() {
        return String.format("%-28s%-23s%-22s%-10d%-10.2f", titulo, autor, isbn, numUnidades, precio);
    }
    public void actualizarUnidades(int cantidad){
        numUnidades -= cantidad;
    }
}
