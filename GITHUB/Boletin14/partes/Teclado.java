package partes;

public class Teclado {
    public float precio;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String marca;
    public String tipo;

    public Teclado(float precio, String marca, String tipo) {
        this.precio = precio;
        this.marca = marca;
        this.tipo = tipo;
    }    

    @Override
    public String toString() {
        return "Teclado{" + "precio=" + precio + ", marca=" + marca + ", tipo=" + tipo + '}';
    }
}
