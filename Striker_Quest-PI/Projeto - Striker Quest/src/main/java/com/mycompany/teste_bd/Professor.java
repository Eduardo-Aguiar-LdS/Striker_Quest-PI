package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Esta classe armazena as informações do professor.
 */
public class Professor {
    
    // Atributos
    
    /**
     * O email do professor (armazenado no banco de dados).
     */
    private String emailProfessor;
    /**
     * A senha hasheada do professor (armazenado no banco de dados).
     */
    private String senhaProfessor;
    
    // Construtores
    
    /**
     * Construtor da instância Professor.
     * @param emailProfessor
     * @param senhaProfessor 
     */
    public Professor(String emailProfessor, String senhaProfessor) {
        this.emailProfessor = emailProfessor;
        this.senhaProfessor = senhaProfessor;
    }
    
   // Getters e Setter
    
    // campo emailProfessor
    /**
     * Getter do campo emailProfessor
     */
    public String getEmail_professor() {
        return emailProfessor;
    }
    /**
     * Setter do campo emailProfessor
     */
    public void setEmail_professor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }
    
    // campo senhaProfessor
    /**
     * Getter do campo senhaProfessor
     */
    public String getSenha_professor() {
        return senhaProfessor;
    }
    /**
     * Setter do campo senhaProfessor 
     */
    public void setSenha_professor(String senhaProfessor) {
        this.senhaProfessor = senhaProfessor;
    }
    
    // Métodos
    
    /**
     * Cadastra um novo aluno no banco de dados.
     * @param jogador
     * @throws Exception 
     */
    public void cadastrarAluno(Jogador jogador) throws Exception {
        String sql = "INSERT INTO Jogador(nome_jogador, rg, id_turma) VALUES (?, ?, ?);";
        try (Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, jogador.getNome_jogador());
            ps.setString(2, jogador.getRg());
            ps.setInt(3, jogador.getId_turma());
            ps.execute();
        }
    }
    
    /**
     * Cadastra uma nova turma no banco de dados.
     * @param turma
     * @throws Exception 
     */
    public void cadastrarTurma(Turma turma) throws Exception {
        String sql = "INSERT INTO Turma(nome_turma, id_professor)" +
                " VALUES (?, ?);";
        try (Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, turma.getNome_turma());
            ps.setInt(2, turma.getId_professor());
            ps.execute();
        }
    }
}