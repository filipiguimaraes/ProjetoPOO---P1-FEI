package projetopoo;
/**
 * Carro - Classe carro que herda de veiculos
 * @author Filipi Guimaraes
 * @see Veiculo
 * @version 1.0
 * 
 * Projeto P1 - Programacao Orientada a Objetos
 * Data: 13/10/2018
 */
/** Classe Carro que herda de Veiculo */
public class Carro extends Veiculo {
     /** Chama a classe super para criar um carro
     * @param x
     * @param y
     * @param cor
     * @param numPassageiros */
    public Carro(int x, int y, String cor, int numPassageiros) {
        super(x, y, 2, cor);
        this.numPassageiros = numPassageiros;
    }
    private final int numPassageiros;
}
