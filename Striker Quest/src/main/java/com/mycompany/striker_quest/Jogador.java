package com.mycompany.striker_quest;

// Importações
import java.util.Map;   // Importação da classe do tipo de dado dicionário

/**
 * Classe Jogador
 *
 * Esta classe é responsável por armazenar os atributos e métodos utilizados
 * pelas instâncias jogadores, como métodos de autenticação e calculo da
 * pontuação.
 *
 * Cada instância dessa classe representa a conta de um jogador e suas
 * informações, como nome e pontuação.
 */
public class Jogador {

    // Atributos
    private int id_jogador;
    private String nome_jogador;
    private String rg;

    /**
     * Atributo pontuacaoAtual
     *
     * Este atributo armazena a pontuação atual da instância aluno. Por padrão
     * (quando a conta é criada), o valor da pontuação é igual a 0. O valor da
     * pontuação é atualizado em cada partida.
     */
    public int pontuacao = 0;

    /**
     * Atributo maiorPontuacao
     *
     * Este atributo armazena qual foi a maior pontuação já registrada (o
     * recorde) pela instância aluno. Por padrão (quando a conta é criada), o
     * valor da pontuação é igual a 0. O valor da maior pontuação é atualizado
     * após cada partida se o valor da nova pontuação ultrapassar o recorde.
     */
    private int maior_pontuacao = 0;

    /**
     * Atributo turmaDoAluno
     *
     * Este atributo armazena a turma em que a instância aluno está vinculada.
     */
    private int id_turma;

    // Métodos Getters e Setters
    public Jogador(String nome_jogador, int id_turma) {
        this.nome_jogador = nome_jogador;
        this.id_turma = id_turma;
    }

    public String getNome_jogador() {
        return nome_jogador;
    }

    public void setNome_jogador(String nome_jogador) {
        this.nome_jogador = nome_jogador;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    // Métodos
    /**
     * Método autenticarJogador
     *
     * Este método é responsável por realizar a autenticação do jogador.
     *
     * Recebendo o nome do jogador e sua turma como parâmetros, o método deve
     * consultar o banco de dados e verificar se o nome e a turma informados
     * correspondem a algum jogador cadastrado.
     *
     * Se for encontrado uma correspondência no banco de dados, o método deve
     * retornar o valor true, caso contrário, deve retornar o valor false.
     */
    public boolean autenticarJogador(String nome, String turma) {

    }

    /**
     * Método consultarJogadorPorRG
     *
     * Este método é responsável por verificar a existência de um rg de jogador
     * no sistema para, por exemplo, evitar duplicidade de cadastro.
     *
     * Recebendo o rg como parâmetro, o método deve consultar a tabela no banco
     * de dados de alunos cadastrados em busca do rg informado.
     *
     * Se o rg for encontrado, o método deve retornar true, caso contrário, deve
     * retornar false.
     */
    public boolean consultarJogadorPorRG(String RG) {

    }

    /**
     * Método criarContaJogador
     *
     * Este método é responsável por realizar o cadastro de um novo aluno no
     * sistema.
     *
     * Recebendo como parâmetro o nome, RG e a turma do novo aluno, este método
     * deve realizar o registro do aluno no banco de dados utilizando os
     * parâmetros informados.
     *
     * Se o registro no banco de dados for realizado com sucesso, deverá ser
     * retornado o valor true, mas se ocorrer algum erro no processo, deverá ser
     * retornado false.
     */
    private boolean criarContaJogador(String nome, String rg, String turma) {
    }

    /**
     * Método listarAlunosDaTurma
     *
     * Este método é responsável por listar os nomes dos alunos pertencentes a
     * uma determinada turma, incluindo suas respectivas pontuações.
     *
     * Recebendo a turma como parâmetro, o método deve buscar no banco de dados
     * os alunos correspondentes a turma informada e retornar um dicionário cuja
     * chave seja o nome do aluno e os valores a pontuação do aluno.
     */
    public Map<String, Integer> listarAlunosDaTurma(String Turma) {

    }

    /**
     * Método atualizarPontuacao
     *
     * Este método é responsável por atualizar a pontuação do aluno no final de
     * cada partida.
     *
     * Recebendo os pontos ganhos na partida e os pontos bônus recebidos como
     * parâmetros, o método deve somar esses dois valores ao atributo
     * pontuacaoAtual da instância jogador correspondente.
     */
    public void atualizarPontuacao(int pontosPartida, int pontoBonus) {

    }

    /**
     * Método verificarRecorde
     *
     * Este método é responsável por verificar se um novo recorde de pontuação
     * foi quebrado pelo jogador.
     *
     * Recebendo como parâmetro a nova pontuação do jogador, após a soma com a
     * pontuação ganha na partida, este método deve verificar se a nova
     * pontuação superou o antigo recorde.
     *
     * Em caso afirmativo, o método deve retornar true, caso contrário, deve
     * retornar false.
     */
    public boolean verificarRecorde(int novaPontuacao) {

    }

    /**
     * Método atualizarRecorde
     *
     * Este método é responsável por atualizar o recorde do jogador quando a
     * nova pontuação do jogador ultrapassar a maior pontuação registrada.
     *
     * Recebendo a nova pontuação como parâmetro, o método deve definir o
     * atributo maiorPontuacao da instância jogador correspondente com o valor
     * informado.
     */
    public void atualizarRecorde(int novaPontuacao) {

    }
}
