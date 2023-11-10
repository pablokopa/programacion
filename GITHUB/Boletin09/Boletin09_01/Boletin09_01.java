package boletin09_01;

public class Boletin09_01 {
    
    public static void main(String[] args) {
        int num;
        int contadorpos=0;
        int contadorneg=0;
        int contadorcero=0;
        
        for (int i=0; i<10; i++){
            num = Aleatorios.generaNumeros(-135,135);
            
            if (num>0)
                contadorpos++;
            else if (num==0)
                contadorcero++;
            else
                contadorneg++;
        }
                    
        System.out.println("Hay "+contadorpos+" números positivos");
        System.out.println("Hay "+contadorneg+" números negativos");
        System.out.println("Hay "+contadorcero+" ceros");
    } 
}
