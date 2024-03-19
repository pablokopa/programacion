import animais.Avestruz;
import animais.Gato;
import animais.Morcego;

public class Main {
    public static void main(String[] args) {
        Gato g = new Gato();
        Morcego m = new Morcego();
        Avestruz a = new Avestruz();

        g.caminar();
        m.caminar();
        m.voar();
        a.caminar();
    }
}