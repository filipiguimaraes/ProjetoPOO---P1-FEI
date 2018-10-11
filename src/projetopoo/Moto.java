package projetopoo;
/**
 * Moto - Classe moto que herda de veiculos
 * @author Filipi Guimaraes
 * @see Veiculo
 * @version 1.0
 * 
 * Projeto P1 - Programacao Orientada a Objetos
 * Data: 13/10/2018
 */
/** Classe Moto que herda de Veiculo */
public class Moto extends Veiculo {
    /** Chama a classe super para criar uma moto
     * @param x
     * @param y
     * @param cor */
    public Moto(int x, int y, String cor) {
        super(x, y, 3, cor);
    }
}
