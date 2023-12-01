package boletin17;
import javax.swing.JOptionPane;

public class Conta {
    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    // CONTRUCTOR

    public Conta(long numeroConta, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }   

    // GET Y SET
    
    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    // INGRESAR, RETIRAR Y ACTUALIZAR SALDO
    
    public void ingresar(double saldo){
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidad que desea ingresar: "));
        this.saldo += saldo;
        System.out.println("Su saldo actual es: "+this.saldo+"€");
    }

    public void retirar(double saldo){
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidad que desea retirar: "));
        this.saldo += saldo;
        System.out.println("Su saldo actual es: "+this.saldo+"€");
    }

    public void actualizarSaldo(double saldo){
        System.out.println("Su saldo actual es: "+this.saldo+"€");
    }

    // TO STRING
    
    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
}
