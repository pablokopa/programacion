package partes;

public class Procesador {
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

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    public String marca;
    public String velocidad;

    public Procesador(float precio, String marca, String velocidad) {
        this.precio = precio;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" + "precio=" + precio + ", marca=" + marca + ", velocidad=" + velocidad + '}';
    }
}
