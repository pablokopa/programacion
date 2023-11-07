package boletin04_01;

public class Boletin04_01 {
    public static void main(String[] args) {
        Libro obxLib=new Libro();
        obxLib.setTitulo("Lazarillo");
        obxLib.setAutor("Juan");
        obxLib.setAno(1900);
        obxLib.setPaxina((short)7);
        obxLib.setValoracion(8.5f);
        
        obxLib.getLibro();
        
        Libro obxLib2 = new Libro("Lazarillo 2", "Manolo", 1900, (short)8);
        obxLib2.getLibro();
    }
    
}
