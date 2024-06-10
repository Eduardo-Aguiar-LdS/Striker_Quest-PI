package com.mycompany.teste_bd;

// Importações
import java.util.Map;       // Importação da classe do tipo de dado dicionário

import java.util.ArrayList; // Importação da classe do tipo de dado lista

/**
 * Classe Partida
 *
 * Esta classe é responsável por gerenciar a partida em andamento. Seus atributos e métodos descrevem as ações que o sistema deve realizar durante uma partida.
 *
 * As instâncias dessa classe são as partidas em andamento e armazenam
 * informações como a pontuação atual, os bontos Bônus.
 */
public class Partida {

    // Atributos
    /**
     * Este atributo deve armazenar o nome da partida.
     */
    private String nomePartida;

    /**
     * Atributo pontosGanhosAcertar
     *
     * Este atributo armazena o valor da pontuação que serão ganhos ao acertar
     * uma pergunta.
     */
    private static int pontosGanhosAcertar = 10;

    /**
     * Atributo pontosPerdidosErrar
     *
     * Este atributo armazena o valor da pontuação que serão perdidos ao errar
     * uma pergunta.
     */
    private static int pontosPerdidosErrar = -10;

    /**
     * Atributo pontosPerdidosGoleiro
     *
     * Este atributo armazena o valor da pontuação que serão perdidos quando o
     * goleiro conseguir pegar a bola.
     */
    private static int pontosPerdidosGoleiro = -5;

    /**
     * Atributo pontosPerdidosNaTrave
     *
     * Este atributo armazena o valor da pontuação que serão perdidos quando a
     * bola bater na trave.
     */
    private static int pontosPerdidosNaTrave = -7;

    /**
     * Atributo ponsotsPerdidosForaTrave
     *
     * Este atributo armazena o valor da pontuação que serão perdidos quando a
     * bola for pra fora da trave.
     */
    private static int pontosPerdidosForaTrave = -6;

    /**
     * Atributo ordemPerguntas
     *
     * Este atributo armazena, em forma de lista, as 15 perguntas que serão
     * realizadas na partida.
     *
     * Cada valor da lista deve ser uma string armazenando o texto da pergunta.
     */
    private ArrayList<String> ordemPerguntas;

    /**
     * Atributo perguntasDaPartida
     *
     * Este atributo armazena, em forma de dicionário, as perguntas e suas
     * respectivas alternativas.
     *
     * As chaves da perguntas deve ser uma string armazenando o texto da
     * pergunta (obtidas pelo atributo ordemPerguntas) e seus valores uma lista
     * com as 5 alternativas armazenadas como Strings.
     */
    private Map<String, ArrayList<String>> perguntasDaPartida;

    /**
     * Atributo perguntasFeitas
     *
     * Este atributo armazena a quantidade de perguntas que já foram realizadas
     * na partida.
     *
     * O valor do atributo é incrementado em 1 a cada pergunta que é exibida na
     * tela. Quanto o valor ultrapassa 15, o jogo acaba.
     */
    private int perguntasFeitas = 0;

    /**
     * Atributo chances
     *
     * Este atributo armazena a quantidade de chances restantes da partida.
     *
     * O valor do atributo é decrementado em 1 a cada erro (pergunta respondida
     * incorretamente, goleito pegando a bola, bola na trave e bola fora da
     * trave). Quando o valor chegar a 0, o jogo acaba.
     */
    private int chances = 3;

    /**
     * Este atributo armazena a quantidade de pontos que foram ganhos na
     * partida.
     */
    private int pontuacaoPartida = 0;

    /**
     * Este atributo diz se o bônus está ativo no jogo, sendo usado para definir
     * se o jogador ganhará (ou não) pontos bônus.
     *
     * No início de cada partida, o valor do bonusAtivo deve ser true.
     */
    private boolean bonusAtivo = true;

    /**
     * Este atributo armazena a quantidade de pontos bônus que foram ganhos na
     * partida.
     */
    private int pontuacaoBonus = 0;

    // Métodos
    
    /**
     * Método iniciarPartida
     *
     * Este método é responsável por realizar as ações que marcam o ínicio da
     * partida, como gerar as perguntas e iniciar o movimento do goleiro.
     */
    public void iniciarPartida() {

    }

    /**
     * Este método é responsável por realizar as ações que marcam o fim da
     * partida, como registrar a pontuação.
     */
    public void finalizarPartida() {

    }

    /**
     * Este método é responsável por alterar o atributo pontuacaoDaPartida,
     * adicionando/subtraindo pontos.
     *
     * Seu parâmetro geralmente são os atributos pontosGanhosAcertar,
     * pontosPerdidosErrar, pontosPerdidosGoleiro, pontosPerdidosNaTrave,
     * pontosPerdidosForaTrave.
     */
    public void somarPontos(int pontos) {
    }

    /**
     * Este método é responsável por alterar o atributo pontuacaoBonus,
     * adicionando pontos bônus caso o bônus esteja ativo.
     */
    public void somarBonus(int quantBonus) {
    }

    /**
     * Este método é responsável por definir o atributo bonusAtivo como false
     * caso o jogador erre alguma vez, desativando o bônus.
     */
    public void desativaBonus() {
    }
}
