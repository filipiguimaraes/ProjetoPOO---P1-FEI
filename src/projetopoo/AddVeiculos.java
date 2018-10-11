package projetopoo;
/**
 * AddVeiculos - Classe que controla a criacao de veiculos
 * @author Filipi Guimaraes
 *
 * @version 1.0
 * 
 * Projeto P1 - Programacao Orientada a Objetos
 * Data: 13/10/2018
 */

/** Classe que controla a criacao de veiculos*/
public class AddVeiculos {
    /** Retorna um Caminhao
     * @return  Caminhao*/
    public static Caminhao getCaminhao() {
        return new Caminhao(((int) (1 + Math.random() * 58)), ((int) (1 + Math.random() * 28)), Cores.getAzul(), ((int) (1000 + Math.random() * 500)));
    }
    
    /** Retorna um carro
     * @return  Carro*/
    public static Carro getCarro() {/*Retorna um carro*/
        //Retorna um carro
        return new Carro(((int) (1 + Math.random() * 58)), ((int) (1 + Math.random() * 28)), Cores.getVerde(), ((int) (1 + Math.random() * 3)));
    }
    /**Retorna uma moto
     * @return Moto*/
    public static Moto getMoto() {
        return new Moto(((int) (1 + Math.random() * 58)), ((int) (1 + Math.random() * 28)), Cores.getCiano());
    }
    /** Retorna uma bicicleta
     * @return  Bicicleta*/
    public static Bicicleta getBicicleta() {
        return new Bicicleta(((int) (1 + Math.random() * 58)), ((int) (1 + Math.random() * 28)), Cores.getRoxo());
    }
}
