package boletin16;

public class Biblioteca {
    int codigo;
    String titulo;
    String ano;

    public Biblioteca(int codigo, String titulo, String ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + '}';
    }
}
