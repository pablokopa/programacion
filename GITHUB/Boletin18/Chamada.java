package boletin18;
import javax.swing.JOptionPane;

public class Chamada { 
    private int minutos, seleccion;
    private double precio;
    
    public void realizarChamada(){
        seleccion =Integer.parseInt(JOptionPane.showInputDialog("Calcular prezo da chamada:\n\n1. Si\n2. No\n "));
        do {
                minutos =Integer.parseInt(JOptionPane.showInputDialog("Introduce os minutos de chamada: "));
                double preciodescuento;
                
                if (minutos<=5){
                    precio= 1;
                } else if (minutos>5 && minutos<=8){
                    precio= 1.8;
                } else if (minutos>8 && minutos<=10){
                    precio= 2.5;
                } else if (minutos>10){
                    precio= (minutos-10)*0.5+2.5;
                }  

                int dia =Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n1. Luns a Sábado (mañá)\n2. Luns a Sábado (tarde)\n3. Domingo"));
                switch(dia){
                    case 1: 
                        preciodescuento=(0.15*precio)+precio;
                        JOptionPane.showMessageDialog(null, "O precio na quenda de mañá é de "+preciodescuento+"€");
                        break;
                    case 2:
                        preciodescuento=(0.10*precio)+precio;
                        JOptionPane.showMessageDialog(null, "O precio na quenda de tarde é de "+preciodescuento+"€");
                        break;
                    case 3:
                        preciodescuento=(0.03*precio)+precio;
                        JOptionPane.showMessageDialog(null, "O precio o Domingo é de "+preciodescuento+"€");
                        break;
                } 
                seleccion =Integer.parseInt(JOptionPane.showInputDialog("Calcular prezo da chamada:\n\n1. Si\n2. No\n "));
        } while (seleccion==1);
    }
}
