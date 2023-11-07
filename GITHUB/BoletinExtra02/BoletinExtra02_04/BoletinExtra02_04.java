package boletinextra02_04;

public class BoletinExtra02_04 {
    public static void main(String[] args) {
        /* Conta objCont = new Conta();
        objCont.setNome();
        objCont.setNum();
        objCont.setInteres();
        objCont.setSaldo();
        
        objCont.Ingreso();
        objCont.Reintegro(); */
        
        Conta cuentaOrigen = new Conta();
        cuentaOrigen.setSaldo();
        cuentaOrigen.tranferencia(100, 200);
    }
    
}
