package animais;

public class Tigre extends Felino{
    @Override
    public void caminar(){
        System.out.println("O tigre camiña");
    }

    @Override
    public void nadar(){
        System.out.println("O tigre nada");
    }
}