package com.mycompany.striker_quest;

/**
 * Classe Alternativa
 *
 * As instâncias dessa classe representam as alternativas que serão exibidas pro
 * jogador responder dentro do objeto trave.
 *
 * Para cada pergunta, há 5 alternativas, sendo uma delas correta e as outras
 * incorretas. Toda vez que uma pergunta é exibida na tela, suas 5 alternativas
 * são exibidas e, quando deixa de ser exibida, suas alternativas também.
 */
public class Alternativa {

    // Atributos
    /**
     * Atributo textoResposta
     *
     * Este atributo armazena o texto da alternativa que é exibido pro jogador.
     */
    private String textoResposta;

    /**
     * Atributo respostaCorreta
     *
     * Este atributo armazena o valor que diz se a alternativa é correta ou não.
     * Se o valor for true, a alternativa é correta, se for false, a alternativa
     * é incorreta.
     */
    private boolean respostaCorreta;

    // Métodos
    /**
     * Método exibirAlternativa
     *
     * Recebendo o número da pergunta, a ordem da alternativa dentro da pergunta
     * e o valor que diz se a alternativa é correta ou não, este método deve
     * exibir uma instância alternativa dentro da trave para que o jogador possa
     * responder a pergunta chutando a bola.
     *
     * @param pergunta informa em qual pergunta o jogo está.
     * @param ordem diz qual posição da alternativa deve ser gerada.
     * @param correta armazena o valor booleano dizendo se a alternativa está
     * correta ou não.
     *
     */
    public void exibirAlternativa(int pergunta, int ordem, boolean correta) {
    }

    /**
     * Método serAtingidaPelaBola
     *
     * Este método, disparado quando um objeto da classe Bola atinge um objeto
     * da classe Alternativa, retorna o valor 4 para que o sistema saiba que uma
     * alternativa foi atingida pela bola.
     *
     * @return O valor 4 é usado pela estrutura condicional presente no método
     * do caso de uso UC010 - Jogar e informa que a bola atingiu uma
     * alternativa.
     */
    public int serAtingidaPelaBola() {
        return 4;
    }

    /**
     * Método analisarAlternativa
     *
     * Este método, chamado quando a bola atinge uma alternativa, recebe como
     * parâmetro o número da alternativa que a bola atingiu e retorna, em valor
     * booleano, se ela estava correta ou não.
     *
     * @param alternativa informa qual alternativa a bola atingiu.
     *
     * @return deve ser true se a alternativa estava correta ou false se estiver
     * incorreta.
     */
    public boolean analisarAlternativa(int alternativa) {
    }

    /**
     * Método apagarAlternativa
     *
     * Este método, chamado após o fim da rodada, deve apagar a instância
     * Alternativa que estiver sendo exibida dentro do objeto trave.
     */
    public void apagarAlternativa() {

    }

}
