package boletin16;

public class Libros extends Biblioteca{
    boolean prestado;

    public Libros(boolean prestado, int codigo, String titulo, String ano) {
        super(codigo, titulo, ano);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libros{" + "prestado=" + prestado + '}';
    }
}
