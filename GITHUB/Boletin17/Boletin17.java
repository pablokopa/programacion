package boletin17;

public class Boletin17 {
    public static void main(String[] args) {
        // CREACIÓN DE 2 CUENTAS
        Persoa Persoa1 = new Persoa("Pablo","Iglesias","17463454D");
        Conta Conta1 = new Conta(145672348, Persoa1);
        Conta Conta2 = new Conta(145672348, new Persoa("Juan","González","12485724A"));
        System.out.println(Conta1.toString());
        System.out.println(Conta2.toString());
    }
}
