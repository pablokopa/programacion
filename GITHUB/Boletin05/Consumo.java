package boletin05;
import java.util.Scanner;

public class Consumo {
    
    // variables
    Scanner sc=new Scanner(System.in);
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    private float tempo;
    private float consumo;
    private float precio;
    
    // constructor defecto
    public Consumo(){         
    }
            
    // constructor parametrizado
    public Consumo(float km, float litros, float vMed, float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }

    // metodos de acceso 
    public void setKms(){
        System.out.print("Indica los kilometros realizaos: ");
        km=sc.nextFloat();
    }
     
    public void setLitros(){
        System.out.print("Indica los litros consumidos: ");
        litros=sc.nextFloat();
    }
     
    public void setVMed(){
        System.out.print("Indica la velocidad media en km/h: ");
        vMed=sc.nextFloat();
    }
     
    public void setPGas(){
        System.out.print("Indica el precio de la gasolina:");
        pGas=sc.nextFloat();
    }
     
    public void Tempo(){
        tempo= km/vMed;
        System.out.println("- El viaje ha durado: "+tempo+ " horas");
    }
     
    public void consumoMedio(){
        consumo= (litros/km)*100;
        System.out.println("- El consumo del coche ha sido de "+consumo+ " litros");
    }
    
    public void consumoEuros(){
        precio= ((litros/km)*100)*pGas;
        System.out.println("- El precio medio de la gasolina es de "+precio+ "€");
    }
    
    public void velocidadMedia(){
        System.out.println("- La velocidad media es de "+vMed+" km/h");
    }
    
    
    
    
















}
