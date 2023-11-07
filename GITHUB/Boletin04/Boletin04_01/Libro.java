package boletin04_01;

public class Libro {

// Atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    // Constructor por defecto
    public Libro(){
        }
    
    // Constructor para inicializar título, autor, ano, páxinas
    public Libro(String tit, String aut, int an, short pax){        
        titulo=tit;
        autor=aut;
        ano=an;
        numPaginas=pax;
        }
    
    // Método de acceso para las variables
    public void setTitulo (String tit){
        titulo=tit;
        }
    public void setAutor (String aut){
        autor=aut;
        }
    public void setAno (int an){
        ano=an;
        }
    public void setPaxina (short pax){
        numPaginas=pax;
        }
    public void setValoracion (float val){
        valoracion=val;
        }
    
    // Método amosar 
    public void getLibro (){
        System.out.println("\nTitulo: "+titulo+"\nAutor: "+autor+"\nAno de publicacion: "+ano+"\nPáxinas: "+numPaginas+"\nValoración: "+valoracion);
        }    
}
