package boletinextra02_04;
import javax.swing.JOptionPane;

public class Conta {
    
    // atributos
    private String nomec, numc;
    private double interes, saldo, ingreso, reintegro;
    
    // const. por defecto y parametrizado
    public Conta(){
    }
    
    public Conta(String nomec, String numc, double interes, double saldo){
        this.nomec=nomec;
        this.numc=numc;
        this.interes=interes;
        this.saldo=saldo;
    }
    
    // setters/ getters
    public void setNome(){
        nomec=JOptionPane.showInputDialog("Introduce el nombre del cliente");
    }

    public void setNum(){
        numc=JOptionPane.showInputDialog("Introduce el número de cuenta");
    }

    public void setInteres(){
        interes=Double.parseDouble(JOptionPane.showInputDialog("Introduce el tipo de interes aplicado"));
    }

    public void setSaldo(){
        saldo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo disponible"));
    }
    
    // metodos
    public void Ingreso(){
        ingreso=Double.parseDouble(JOptionPane.showInputDialog("Introduce el ingreso que quieres realizar"));
        saldo+=ingreso;
        JOptionPane.showMessageDialog(null, "El saldo disponible es de "+saldo+"€");
    }

    public void Reintegro(){
        reintegro=Double.parseDouble(JOptionPane.showInputDialog("Introduce el reintegro que quieres realizar"));
        saldo-=reintegro;
        JOptionPane.showMessageDialog(null, "El saldo disponible es de "+saldo+"€");
    }
    
    public void tranferencia(double cuentaDestino, double importe){
        saldo= saldo-importe;
        cuentaDestino= cuentaDestino+importe;
        JOptionPane.showMessageDialog(null, "El saldo disponible en la cuenta de origen es "+saldo+"€");
        JOptionPane.showMessageDialog(null, "El saldo disponible en la cuenta destino es "+cuentaDestino+"€");
    }
}
