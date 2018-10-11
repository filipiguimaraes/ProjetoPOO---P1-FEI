package projetopoo;

/**
 * Veiculos - Classe que cria todos os veiculos
 *
 * @author Filipi Guimaraes
 *
 * @version 1.0
 *
 * Projeto P1 - Programacao Orientada a Objetos Data: 13/10/2018
 */
public class Veiculo {

    /** Construtor dos veiculos
     * @param x
     * @param y
     * @param velocidade
     * @param cor */
    public Veiculo(int x, int y, int velocidade, String cor) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.cor = cor;
    }
    /** Move os veiculos aleatoriamente*/
    public void move() {
        int xMax = 58;
        int yMax = 28;
        int numRandomico = (int) (Math.random() * 4);
        switch (numRandomico) {
            case 0:
                if (this.y - this.velocidade <= 0) {
                    this.y = yMax;
                } else {
                    this.y -= this.velocidade;
                }
                break;
            case 1:
                if (this.x + this.velocidade >= xMax) {
                    this.x = 1;
                } else {
                    this.x += this.velocidade;
                }
                break;
            case 2:
                if (this.x - this.velocidade <= 0) {
                    this.x = xMax;
                } else {
                    this.x -= this.velocidade;
                }
                break;
            case 3:
                if (this.y + this.velocidade >= yMax) {
                    this.y = 1;
                } else {
                    this.y += this.velocidade;
                }
                break;
            default:
                break;
        }
    }

    /** Retorna x do veiculo
     * @return  X*/
    public int getX() {
        return x;
    }

    /** Atribui o valor x ao veiculo
     * @param x */
    public void setX(int x) {
        this.x = x;
    }

    /** Retorna y do veiculo
     * @return  Y*/ 
    public int getY() {
        return y;
    }

    /** Atribui o valor x ao veiculo
     * @param y */
    public void setY(int y) {
        this.y = y;
    }
    /** Retorna a velocidade do veiculo
     * @return  Velocidade*/
    public int getVelocidade() {
        return velocidade;
    }
    /** Atribui uma velocidade ao veiculo
     * @param velocidade */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    /** Retorna a cor do veiculo
     * @return  Cor*/
    public String getCor() {
        return cor;
    }
    /** Atribui uma cor ao veiculo
     * @param cor */
    public void setCor(String cor) {
        this.cor = cor;
    }
    /** Retorna se o veiculo está em uma fabrica
     * @return  */
    public boolean isFabrica() {
        return fabrica;
    }
    /** Atribui um valor booleano para a fabrica
     * @param fabrica */
    public void setFabrica(boolean fabrica) {
        this.fabrica = fabrica;
    }
    /** Variaveis privadas dos veiculos */
    private int x, y, velocidade;
    private String cor;
    private boolean fabrica = false;
}
