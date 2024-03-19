package animais;

import interfaz.IPodeCaminar;
import interfaz.IPodeVoar;
import superclase.Mamifero;

public class Morcego extends Mamifero implements IPodeVoar,IPodeCaminar{

    @Override
    public void voar(){
        System.out.println("O morcego camiña");
    }

    @Override
    public void caminar(){
        System.out.println("O morcego voa");
    }

}
