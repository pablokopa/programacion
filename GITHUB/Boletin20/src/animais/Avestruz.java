package animais;
import interfaz.IPodeCaminar;
import superclase.Ave;
public class Avestruz extends Ave implements IPodeCaminar{

    @Override
    public void caminar(){
        System.out.println("A avestruz camiña");
    }

}
