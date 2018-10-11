package projetopoo;
/**
 * Cores -  Classe que contém todas as cores utilizadas
 * @author Filipi Guimaraes
 *
 * @version 1.0
 * 
 * Projeto P1 - Programacao Orientada a Objetos
 * Data: 13/10/2018
 */

/** Classe que contém todas as cores utilizadas */
public class Cores {
    /** Retorna vermelho
     * @return  vermelho*/
    public static String getVermelho() {
        return "\033[41m";
    }
    /** Retorna preto
     * @return  preto*/
    public static String getPreto() {
        return "\033[40m";
    }
    /** Retorna verde
     * @return  verde*/
    public static String getVerde() {
        return "\033[42m";
    }
    /** Retorna amarelo
     * @return  amarelo*/
    public static String getAmarelo() {
        return "\033[43m";
    }
    /** Retorna azul
     * @return  azul*/
    public static String getAzul() {
        return "\033[44m";
    }
    /** Retorna roxo
     * @return  roxo*/
    public static String getRoxo() {
        return "\033[45m";
    }
    /** Retorna ciano
     * @return  ciano*/
    public static String getCiano() {
        return "\033[46m";
    }
    /** Retorna branco
     * @return  branco*/
    public static String getBranco() {
        return "\033[47m";
    }
}
