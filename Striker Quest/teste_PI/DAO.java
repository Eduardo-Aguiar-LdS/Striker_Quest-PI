//package com.mycompany.striker_quest;
//Importações
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Classe DAO (Data Acess Object)
public class DAO {
    //Verificação de Existência do Jogador
    public boolean existeJogador(Jogador jogador)
            throws Exception{
        String sql = "SELECT * FROM Jogador"
        + "WHERE nome_jogador = ? AND id_turma = ?";
        
        try(Connection conn = 
                ConnectionFactory.obterConexao();
                PreparedStatement ps = 
                        conn.prepareStatement(sql)
        ){
            ps.setString(1,jogador.getNome_jogador());
            ps.setInt(2, jogador.getId_turma());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public boolean existeProfessor(Professor professor)
            throws Exception{
        String sql = "SELECT * FROM Jogador"
        + "WHERE nome_jogador = ? AND id_turma = ?";
        
        try(Connection conn = 
                ConnectionFactory.obterConexao();
                PreparedStatement ps = 
                        conn.prepareStatement(sql)
        ){
            ps.setString(1,professor.getEmail_professor());
            ps.setString(2, professor.getSenha_professor());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public boolean exibirPontuacao(boolean varExibirPontuacao)
            throws Exception{
        String sql = "SELECT nome_jogador, maior_pontuacao, id_turma FROM Jogador"
        + "WHERE nome_jogador = ? AND maior_pontuacao AND id_turma = ?";
        
        try(Connection conn = 
                ConnectionFactory.obterConexao();
                PreparedStatement ps = 
                        conn.prepareStatement(sql)
        ){
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}