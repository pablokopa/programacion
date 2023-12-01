package boletin17;

public class CuentaCorriente extends Conta {
    private final double INTERESE_FIXO=1.5;

    public CuentaCorriente(long numeroConta, Persoa cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "INTERESE_FIXO=" + INTERESE_FIXO + '}';
    }      
}
