package boletin09_01;

public class Aleatorios {
    static int generaNumeros(int desde, int hasta) {
	return (int)(Math.random()*(hasta-desde+1)+desde);
    }
}