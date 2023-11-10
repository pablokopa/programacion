package boletin11_01;
import javax.swing.JOptionPane;

public class Boletin11_01 {
    public static void main(String[] args) {
        int num= Integer.parseInt(JOptionPane.showInputDialog("Xogador 1:\nIntroduce un número entre 1 e 50")); // Pedir numero aleatorio
        int contador=0;
        
        if (num>=0 && num<=50) {
            int intentos= Integer.parseInt(JOptionPane.showInputDialog("Xogador 1:\nIntroduce o número máximo de intentos")); // Pedir numero de intentos
            while (contador!=intentos){
                int seleccion= Integer.parseInt(JOptionPane.showInputDialog("Xogador 2:\nIntroduce un número"));
                if (seleccion>num){
                    JOptionPane.showMessageDialog(null,"El número es menor");
                } else if (seleccion<num){
                    JOptionPane.showMessageDialog(null,"El número es mayor");
                } else {
                    JOptionPane.showMessageDialog(null,"¡CORRECTO, HAS ADIVINADO!");
                    //break;
                }
                contador++;
            }

            if (contador==intentos) {
                JOptionPane.showMessageDialog(null,"Te has quedado sin intentos");    
                }
        } else {
            JOptionPane.showMessageDialog(null,"Opción incorrecta");    
        }
    }
}
