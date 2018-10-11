package projetopoo;
/**
 * Bicicleta - Classe bicicleta que herda de veiculos 
 * @author Filipi Guimaraes
 * @see Veiculo
 * @version 1.0
 * 
 * Projeto P1 - Programacao Orientada a Objetos
 * Data: 13/10/2018
 */
/** Classe Bicicleta que herda de veiculos */
public class Bicicleta extends Veiculo{
    /** Chama a classe super para criar uma bicicleta
     * @param x
     * @param y
     * @param cor */
    public Bicicleta(int x, int y, String cor) {
        super(x, y, 1, cor);
    }
    private String tipo;
}
