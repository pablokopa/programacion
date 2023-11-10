package boletin09_02;

public class Boletin09_02 {
    public static void main(String[] args) {
        int suma=0;
        double producto=1;
        for (int i=10; i<91; i++){
            suma=suma+i;
            producto=i*producto;
        }
        
        System.out.println(suma);
        System.out.println(producto);
    }
}
