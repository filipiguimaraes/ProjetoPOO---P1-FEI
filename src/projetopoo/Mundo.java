package projetopoo;

import java.util.ArrayList;

/**
 * Mundo - Classe que controla o mundo
 *
 * @author Filipi Guimaraes
 *
 * @version 1.0
 *
 * Projeto P1 - Programacao Orientada a Objetos Data: 13/10/2018
 */

/** Classe Mundo que contém os veiculos */
public class Mundo {

    // Instanciando variaveis e ArrayLists globais
    /** ArrayList que contem os objetos Carros */
    private final ArrayList<Carro> alCarro = new ArrayList<>();
    /** ArrayList que contem os objetos Caminhoes */
    private final ArrayList<Caminhao> alCaminhao = new ArrayList<>();
    /** ArrayList que contem os objetos Motos */
    private final ArrayList<Moto> alMoto = new ArrayList<>();
    /** ArrayList que contem os objetos Bicicletas */
    private final ArrayList<Bicicleta> alBicicleta = new ArrayList<>();
    /** Tamanho x do Mundo*/
    private static final int tamanhoX = 60;
    /** Tamanho y do Mundo*/
    private static final int tamanhoY = 30;
    /** Mundo de grades */
    private static final int MAPAINICIAL[][] = {
        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0, 0, 0, 0, 0, 6,},
        {6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6,},
        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,}
    };

    /** Funcao que controla os "frames" */
    private void update() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
        }
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    /** Percorre todos os ArrayLists e os move */
    private void moveVeiculos(boolean moveBike) {

        for (int i = 0; i < alCarro.size(); i++) {
            alCarro.get(i).move();
        }
        for (int i = 0; i < alCaminhao.size(); i++) {
            alCaminhao.get(i).move();
        }
        for (int i = 0; i < alMoto.size(); i++) {
            alMoto.get(i).move();
        }
        if (moveBike) { // Variavel de controle de movimento das Bicicletas
            for (int i = 0; i < alBicicleta.size(); i++) {
                alBicicleta.get(i).move();
            }
        }
    }

    /** Adiciona os primeiros veiculos */
    private void veiculosIniciais(int vInicial) {
        for (int i = 0; i < vInicial; i++) {
            alCarro.add(AddVeiculos.getCarro());
            alCaminhao.add(AddVeiculos.getCaminhao());
            alMoto.add(AddVeiculos.getMoto());
            alBicicleta.add(AddVeiculos.getBicicleta());
        }
    }

    /** Verifica se os veiculos estão em uma fabrica ou se acabaram de sair
       caso estejam, outro veiculo do mesmo tipo é criado
     */
    private void verificaFabrica() {

        for (int i = alCarro.size() - 1; i >= 0; i--) {
            if (MAPAINICIAL[alCarro.get(i).getY()][alCarro.get(i).getX()] == 5
                    && !alCarro.get(i).isFabrica()) {
                alCarro.add(AddVeiculos.getCarro());
                alCarro.get(i).setFabrica(true);
            } else if (MAPAINICIAL[alCarro.get(i).getY()][alCarro.get(i).getX()] != 5
                    && alCarro.get(i).isFabrica()) {
                alCarro.get(i).setFabrica(false);
            }
        }
        for (int i = alCaminhao.size() - 1; i >= 0; i--) {
            if (MAPAINICIAL[alCaminhao.get(i).getY()][alCaminhao.get(i).getX()] == 5 && !alCaminhao.get(i).isFabrica()) {
                alCaminhao.add(AddVeiculos.getCaminhao());
                alCaminhao.get(i).setFabrica(true);
            } else if (MAPAINICIAL[alCaminhao.get(i).getY()][alCaminhao.get(i).getX()] != 5
                    && alCaminhao.get(i).isFabrica()) {
                alCaminhao.get(i).setFabrica(false);
            }
        }
        for (int i = alMoto.size() - 1; i >= 0; i--) {
            if (MAPAINICIAL[alMoto.get(i).getY()][alMoto.get(i).getX()] == 5 && !alMoto.get(i).isFabrica()) {
                alMoto.add(AddVeiculos.getMoto());
                alMoto.get(i).setFabrica(true);
            } else if (MAPAINICIAL[alMoto.get(i).getY()][alMoto.get(i).getX()] != 5
                    && alMoto.get(i).isFabrica()) {
                alMoto.get(i).setFabrica(false);
            }
        }
        for (int i = alBicicleta.size() - 1; i >= 0; i--) {
            if (MAPAINICIAL[alBicicleta.get(i).getY()][alBicicleta.get(i).getX()] == 5 && !alBicicleta.get(i).isFabrica()) {
                alBicicleta.add(AddVeiculos.getBicicleta());
                alBicicleta.get(i).setFabrica(true);
            } else if (MAPAINICIAL[alBicicleta.get(i).getY()][alBicicleta.get(i).getX()] != 5
                    && alBicicleta.get(i).isFabrica()) {
                alBicicleta.get(i).setFabrica(false);
            }
        }
    }

    /** Verifica se os objetos estão na mesma posicao
       se sim remove de acordo a matriz de confusao
     */
    private void verificaColisao() {

        for (int i = 0; i < alCaminhao.size() && !alCaminhao.isEmpty(); i++) {
            for (int j = i + 1; j < (alCaminhao.size()); j++) {
                if (alCaminhao.get(i).getY() == alCaminhao.get(j).getY()
                        && alCaminhao.get(i).getX() == alCaminhao.get(j).getX()) {
                    alCaminhao.remove(j);
                    alCaminhao.remove(i);
                    
                    j = i;
                }
            }
            for (int k = 0; k < alCarro.size() && !alCarro.isEmpty(); k++) {
                if (alCaminhao.get(i).getY() == alCarro.get(k).getY()
                        && alCaminhao.get(i).getX() == alCarro.get(k).getX()) {
                    alCarro.remove(k);
                    k--;
                }
            }
            for (int l = 0; l < alMoto.size() && !alMoto.isEmpty(); l++) {
                if (alCaminhao.get(i).getY() == alMoto.get(l).getY()
                        && alCaminhao.get(i).getX() == alMoto.get(l).getX()) {
                    alMoto.remove(l);
                    l--;
                }
            }
            for (int m = 0; m < alBicicleta.size() && !alBicicleta.isEmpty(); m++) {
                if (alCaminhao.get(i).getY() == alBicicleta.get(m).getY()
                        && alCaminhao.get(i).getX() == alBicicleta.get(m).getX()) {
                    alBicicleta.remove(m);
                    m--;
                }
            }
        }

        for (int i = 0; i < alCarro.size() && !alCarro.isEmpty(); i++) {
            for (int j = i + 1; j < (alCarro.size()); j++) {
                if (alCarro.get(i).getY() == alCarro.get(j).getY()
                        && alCarro.get(i).getX() == alCarro.get(j).getX()) {
                    alCarro.remove(j);
                    alCarro.remove(i);
                    j = i;
                }
            }
            for (int l = 0; l < alMoto.size() && !alMoto.isEmpty(); l++) {
                if (alCarro.get(i).getY() == alMoto.get(l).getY()
                        && alCarro.get(i).getX() == alMoto.get(l).getX()) {
                    alMoto.remove(l);
                    l--;
                }
            }
            for (int m = 0; m < alBicicleta.size() && !alBicicleta.isEmpty(); m++) {
                if (alCarro.get(i).getY() == alBicicleta.get(m).getY()
                        && alCarro.get(i).getX() == alBicicleta.get(m).getX()) {
                    alBicicleta.remove(m);
                    m--;
                }
            }
        }
        for (int i = 0; i < alMoto.size() && !alMoto.isEmpty(); i++) {
            for (int j = i + 1; j < (alMoto.size()); j++) {
                if (alMoto.get(i).getY() == alMoto.get(j).getY()
                        && alMoto.get(i).getX() == alMoto.get(j).getX()) {
                    alMoto.remove(j);
                    alMoto.remove(i);
                    j = i;
                }
            }
            for (int m = 0; m < alBicicleta.size() && !alBicicleta.isEmpty(); m++) {
                if (alMoto.get(i).getY() == alBicicleta.get(m).getY()
                        && alMoto.get(i).getX() == alBicicleta.get(m).getX()) {
                    alBicicleta.remove(m);
                    m--;
                }
            }
        }
        for (int i = 0; i < alMoto.size() && !alMoto.isEmpty(); i++) {
            for (int j = i + 1; j < (alMoto.size()); j++) {
                if (alMoto.get(i).getY() == alMoto.get(j).getY()
                        && alMoto.get(i).getX() == alMoto.get(j).getX()) {
                    alMoto.remove(j);
                    alMoto.remove(i);
                    j = i;
                }
            }
        }
    }

    /** Imprime o Mundo*/
    public void desenhaMundo() {
        //Roda o programa
        boolean moveBike = true;
        veiculosIniciais(10); /** Cria 10 veiculos */
        Boolean print;
        while (true) { // Loop infinito
            verificaFabrica(); // Chama a funcao verificaFabrica
            verificaColisao(); // Chama a funcao verificaColisao
            // Imprime a quantidade de veiculos atuais
            System.out.println("Carros: " + alCarro.size() + " - Verdes");
            System.out.println("Caminhoes: " + alCaminhao.size() + " - Azuis");
            System.out.println("Motos: " + alMoto.size() + " - Cianos");
            System.out.println("Bicicletas: " + alBicicleta.size() + " - Roxos");
            // Imprime o mapa de acordo com o que tem naquela posição
            for (int i = 0; i < tamanhoY; i++) {
                for (int j = 0; j < tamanhoX; j++) {
                    print = false;
                    for (int k = 0; k < alCarro.size(); k++) {
                        if (j == alCarro.get(k).getX() && i == alCarro.get(k).getY()) {
                            System.out.print(alCarro.get(k).getCor() + " ");
                            print = true;
                            break;
                        }
                    }
                    if (print) {
                        continue;
                    } else {
                        for (int k = 0; k < alCaminhao.size(); k++) {
                            if (j == alCaminhao.get(k).getX() && i == alCaminhao.get(k).getY()) {
                                System.out.print(alCaminhao.get(k).getCor() + " ");
                                print = true;
                                break;
                            }
                        }
                    }
                    if (print) {
                        continue;
                    } else {
                        for (int k = 0; k < alMoto.size(); k++) {
                            if (j == alMoto.get(k).getX() && i == alMoto.get(k).getY()) {
                                System.out.print(alMoto.get(k).getCor() + " ");
                                print = true;
                                break;
                            }
                        }
                    }
                    if (print) {
                        continue;
                    } else {
                        for (int k = 0; k < alBicicleta.size(); k++) {
                            if (j == alBicicleta.get(k).getX() && i == alBicicleta.get(k).getY()) {
                                System.out.print(alBicicleta.get(k).getCor() + " ");
                                print = true;
                                break;
                            }
                        }
                    }
                    if (print) {
                        continue;
                    } else {
                        switch (MAPAINICIAL[i][j]) {
                            case 6:
                                System.out.print(Cores.getVermelho() + " ");
                                break;
                            case 5:
                                System.out.print(Cores.getAmarelo() + " ");
                                break;
                            default:
                                System.out.print(Cores.getBranco() + " ");
                                break;
                        }
                    }
                }
                System.out.println();
            }
            // Chama a funcao mover passando como parametro se deve ou nao mover as bicicletas
            moveBike = !moveBike; //moveVeiculos(moveBike);
            moveVeiculos(moveBike);
            update();
        }
    }
}
