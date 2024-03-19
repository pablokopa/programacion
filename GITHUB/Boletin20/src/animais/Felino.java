package animais;
import interfaz.IPodeCaminar;
import interfaz.IPodeNadar;
public class Felino implements IPodeNadar,IPodeCaminar{

    @Override
    public void caminar(){
        System.out.println("O camiña");
    }

    @Override
    public void nadar(){
        System.out.println("O felino nada");
    }
}
