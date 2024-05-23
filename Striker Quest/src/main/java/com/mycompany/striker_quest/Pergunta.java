package com.mycompany.striker_quest;

// Importações
import java.util.Map;       // Importação da classe do tipo de dado dicionário
import java.util.ArrayList; // Importação da classe do tipo de dado lista

/**
 * Classe Pergunta
 *
 * As instâncias dessa classe são as perguntas que estão sendo exibidas na tela.
 *
 */
public class Pergunta {

    // Atributos
    /**
     * Atributo nomePergunta
     *
     * Este atributo armazena o nome (identificador) da pergunta.
     */
    private String nomePergunta;

    /**
     * Atributo textoPergunta
     *
     * Este atributo armazena o texto da pergunta que será exibido na tela.
     */
    private String textoPergunta;

    /**
     * Atributo alternativasDaPergunta
     *
     * Este atributo armazena, em forma de lista, as 5 alternativas relativas a
     * pergunta.
     */
    private ArrayList<String> alternativasDaPergunta;

    // Métodos
    /**
     * Método escolherPerguntas
     *
     * Este método é responsável por selecionar aleatoriamente no banco de dados
     * as 15 perguntas que serão feitas na partida e retornar, em forma de
     * lista. Esta lista será atribuída ao atributo ordemPerguntas da instância
     * Partida.
     */
    public ArrayList<String> escolherPerguntas() {
    }

    /**
     * Método listarAlternativas
     *
     * Este método é responsável por gerar o dicionário com as perguntas e suas
     * respectivas alternativas que serão utilizadas durante a partida.
     *
     * Recebendo a lista das perguntas que serão utilizadas na partida (o
     * atributo ordemPergunta da instância Partida), o método deve consultar o
     * banco de dados e obter as 5 alternativas que serão utilizadas.
     *
     * O método deve retornar um dicionário cuja chave será o texto da pergunta
     * e os valores uma lista com as 5 alternativas.
     */
    public Map<String, ArrayList<String>> listarAlternativas(
            ArrayList<String> listaPerguntas) {

    }

    /**
     * Método fazerPergunta
     *
     * Este método é responsável por exibir a pergunta na tela.
     *
     * Recebendo a lista das perguntas que serão utilizadas na partida (o
     * atributo ordemPergunta da instância Partida) e o número da pergunta em
     * que a partida está, o método deve exibir na tela (acima da trave) a
     * pergunta que deverá ser respondida pelo jogador.
     */
    public String fazerPergunta(
            Map<String, ArrayList<String>> pergunta, int ordem) {
    }

    /**
     * Método pararPergunta
     *
     * Este método é responsável por apagar a pergunta da tela após o jogador
     * concluir a jogada.
     */
    public void pararPergunta() {
    }
}
