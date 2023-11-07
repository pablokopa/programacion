package boletin08_01;
import java.util.Scanner;

public class Almacen {
    public void tipoProduto(){
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce a cantidade de vendas: ");
        int vendas=src.nextInt();
        
        if (vendas>0 && vendas<=100){
            System.out.println("Consumo baixo");
        } else if(vendas>100 && vendas<=500){
            System.out.println("Consumo medio");
        } else if(vendas>500 && vendas<=1000){
            System.out.println("Consumo alto");
        } else if(vendas>1000){
            System.out.println("Primeira necesidade");
        } else 
            System.out.println("Valor incorrecto");
    }
}
