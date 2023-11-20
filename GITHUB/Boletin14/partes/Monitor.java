package partes;

public class Monitor {
    public int pulgadas;
    public float precio;
    public String marca;

    public Monitor(int pulgadas, float precio, String marca) {
        this.pulgadas = pulgadas;
        this.precio = precio;
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

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

    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + ", precio=" + precio + ", marca=" + marca + '}';
    }
}
