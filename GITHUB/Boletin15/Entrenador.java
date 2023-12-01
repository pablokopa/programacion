package boletin15;

public class Entrenador extends SeleccionFutbol{  
    private String idFederacion;
    
    public static void dirixirPartido(){
    }
    
    public static void dirixirEntrenamiento(){
    }

    public Entrenador(String idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
}
