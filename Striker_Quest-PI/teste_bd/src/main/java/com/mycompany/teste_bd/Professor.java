package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Professor {
    private String emailProfessor;
    private String senhaProfessor;
    
    public Professor(String emailProfessor, String senhaProfessor) {
        this.emailProfessor = emailProfessor;
        this.senhaProfessor = senhaProfessor;
    }

    public String getEmail_professor(){
        return emailProfessor;
    }
    public void setEmail_professor(String emailProfessor){
        this.emailProfessor = emailProfessor;
    }
    public String getSenha_professor(){
        return senhaProfessor;
    }
    public void setSenha_professor(String senhaProfessor){
        this.senhaProfessor = senhaProfessor;
    }
    public void cadastrarAluno(Jogador jogador)throws Exception{
        String sql = "INSERT INTO Jogador(nome_jogador, rg, id_turma) VALUES (?, ?, ?);";
        try(Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1,jogador.getNome_jogador());
            ps.setString(2, jogador.getRg());
            ps.setInt(3, jogador.getId_turma());
            ps.execute();
        }
    }
    public void cadastrarTurma(Turma turma)throws Exception{
        String sql = "INSERT INTO Turma(nome_turma, id_professor)"+
        " VALUES (?, ?);";
        try(Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1,turma.getNome_turma());
            ps.setInt(2, turma.getId_professor());
            ps.execute();
        }
    }

    /*public String cadastrarPergunta(String pergunta, String resposta_certa, String resposta_um, String resposta_dois, String resposta_tres)throws Exception{
        String sql = "INSERT senha FROM Professor WHERE senha = ? ";
        
        try(Connection conn = 
                ConnectionFactory.obterConexao();
                PreparedStatement ps = 
                        conn.prepareStatement(sql)
        ){
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }*/
}