package boletin17;
import javax.swing.JOptionPane;

public class CuentaAhorro extends Conta{
    private double intereseVariable;
    private double saldoMinimo=1000;
    
    public CuentaAhorro(double intereseVariable, double saldoMinimo, long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
        this.intereseVariable = intereseVariable;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "intereseVariable=" + intereseVariable + ", saldoMinimo=" + saldoMinimo + '}';
    }
    
    public void cambiarInterese(double intereseVariable){
        intereseVariable= Float.parseFloat(JOptionPane.showInputDialog("Indique el interés establecido: "));
    }
}
