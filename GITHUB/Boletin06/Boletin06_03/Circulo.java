package boletin06_03;
import javax.swing.JOptionPane;

public class Circulo {
    private double radio, area, longitud;
    final double PI=3.14;
    
    // cons parametrizado
    public Circulo(double radio){
        this.radio=radio;
    }
    
    //cons por defecto
    public Circulo(){
    }    
    
    //metodos acceso
    public void setRadio(){
        radio= Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
    }
    
    public void calcularArea(){
        area= PI*(Math.pow(radio, 2));
        JOptionPane.showMessageDialog(null, "El area es: "+area);
    }
    
    public void calcularLonxitude(){
        longitud= 2*PI*radio;
        JOptionPane.showMessageDialog(null, "La longitud es: "+longitud);
    }
}
