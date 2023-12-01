package boletin16;

public class Revistas extends Biblioteca{
    int numero;

    public Revistas(int numero, int codigo, String titulo, String ano) {
        super(codigo, titulo, ano);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revistas{" + "numero=" + numero + '}';
    }
}
