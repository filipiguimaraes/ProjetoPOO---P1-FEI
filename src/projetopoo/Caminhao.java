package projetopoo;
/**
 * Caminhao - Classe caminhao que herda de veiculos
 * @author Filipi Guimaraes
 * @see Veiculo
 * @version 1.0
 * 
 * Projeto P1 - Programacao Orientada a Objetos
 * Data: 13/10/2018
 */
/** Classe Caminhao que herda de Veiculo */
public class Caminhao extends Veiculo {
    /** Chama a classe super para criar um caminhao
     * @param x
     * @param y
     * @param cor
     * @param capacidadeCarga */
    public Caminhao(int x, int y, String cor, int capacidadeCarga) {
        super(x, y, 1, cor);
        this.capacidadeCarga = capacidadeCarga;
    }
    private final int capacidadeCarga;
}
