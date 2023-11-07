package boletin06_01;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Coche {
    Scanner sc=new Scanner(System.in);
    private int velocidade, acelerar, frenar;

    public Coche(){
        velocidade =0 ;
    }
    
    public int getVelocidade(){
        JOptionPane.showMessageDialog(null, "La velocidad actual es de: "+velocidade+" km/h");
        return velocidade;
    }
    
    public void acelerar (){
        acelerar= Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad maxima en km/h"));
        velocidade+=acelerar;
    }

    public void frenar (){
        frenar= Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad frenada en km/h"));
        velocidade-=frenar;
    }
}