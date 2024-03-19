package animais;

import superclase.Ave;
import interfaz.IPodeCaminar;
import interfaz.IPodeVoar;

public class Papagaio extends Ave implements IPodeCaminar,IPodeVoar{

    @Override
    public void voar(){
        System.out.println("O papagaio camiña");
    }

    @Override
    public void caminar(){
        System.out.println("O papagaio voa");
    }

}