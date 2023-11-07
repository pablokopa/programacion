package boletin05;

public class Boletin05 {
    public static void main(String[] args) {
        
        // constructor parametrizado
        Consumo consumo=new Consumo(100,50,120,(float)1.57);
        System.out.println("========PARAMETRIZADO========");
        consumo.consumoMedio();
        
        // constructor por defecto
        Consumo consume=new Consumo();
        
        System.out.println("\n========POR DEFECTO========");
        consume.setKms();
        consume.setLitros();
        consume.setVMed();
        consume.setPGas();
        
        consume.consumoMedio();
        consume.velocidadMedia();
    }
    
}
