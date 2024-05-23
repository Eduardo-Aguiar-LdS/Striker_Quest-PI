package com.mycompany.striker_quest;

/**
 * Classe Goleiro
 *
 * Esta classe representa os atributos e métodos das instâncias goleiros.
 *
 * Cada instância goleiro é criada no ínicio da partida e dura até o seu fim. O
 * objeto goleiro deve ficar se movimentando horizontalmente na frente da trave
 * e, caso seja atingido pelo objeto bola, deve agarrá-la.
 */
public class Goleiro {
    // Atributos

    /**
     * Atributo tamanho
     *
     * Este atributo armazena o tamanho do goleiro.
     */
    double tamanho;

    /**
     * Atributo velocidade
     *
     * Este atributo armazena a velocidade com que o goleiro se movimenta
     * horizontalmente na frente da trave.
     *
     * O atributo começa com um valor fixo no início da partida e, conforme o
     * jogador vai respondendo perguntas, ela é incrementada, ou seja, a
     * velocidade do goleiro aumenta durante a execução da partida.
     */
    int velocidade;

    // Métodos
    /**
     * Método iniciarMovimento
     *
     * Este método, chamado no início de uma partida, inicia o movimento
     * horizontal e constante da instância goleiro na frente da trave.
     */
    public void iniciarMovimento() {
    }

    /**
     * Método aumentarVelocidade
     *
     * Este método, chamado no final de uma rodada, aumenta o valor do atributo
     * velocidade da instância para aumentar sua velocidade de movimento.
     */
    public void aumentarVelocidade() {
    }

    /**
     * Método serAtingidoPelaBola
     *
     * Este método, disparado quando um objeto da classe Bola atinge a instância
     * goleiro, retorna o valor 3 para que o sistema saiba que uma alternativa
     * foi atingida pela bola.
     *
     * @return O valor 3 é usado pela estrutura condicional presente no método
     * do caso de uso UC010 - Jogar e informa que a bola atingiu o goleiro e faz
     * o sistema entrar no estado Goleiro Pegando Bola.
     */
    public int serAtingidoPelaBola() {
        return 3;
    }

    /**
     * Método defender
     *
     * Este método exibe uma animação do goleiro agarrando a bola e também faz
     * com que o objeto bola seja destruído.
     */
    public void defender() {
    }

}
