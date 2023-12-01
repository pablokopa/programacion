package boletin18_02;
import javax.swing.JOptionPane;

public class Transporte {
    private int localizacion;
    private double precio, peso;
    
    public void servizoTransporte(){
        peso =Double.parseDouble(JOptionPane.showInputDialog("Indique o peso do paquete: "));
        localizacion =Integer.parseInt(JOptionPane.showInputDialog("Escolle onde queres enviar o paquete:\n\n1. América do Norte\n2. América Central\n3. América do Sur\n4. Europa\n5. Asia\n "));
        
        if (peso>5){
            JOptionPane.showMessageDialog(null, "O peso excede o permitido");
        } else if (peso>0){
            switch (localizacion){
                case 1:
                    precio= peso*24;
                    JOptionPane.showMessageDialog(null, "O precio de envío sería de "+precio+"€");
                    break;
                case 2:
                    precio= peso*20;
                    JOptionPane.showMessageDialog(null, "O precio de envío sería de "+precio+"€");
                    break;
                case 3:
                    precio= peso*21;
                    JOptionPane.showMessageDialog(null, "O precio de envío sería de "+precio+"€");
                    break;
                case 4:
                    precio= peso*10;
                    JOptionPane.showMessageDialog(null, "O precio de envío sería de "+precio+"€");
                    break;
                case 5:
                    precio= peso*18;
                    JOptionPane.showMessageDialog(null, "O precio de envío sería de "+precio+"€");
                    break;
            }
        } else
            JOptionPane.showMessageDialog(null, "Opción no válida");
    }
}
