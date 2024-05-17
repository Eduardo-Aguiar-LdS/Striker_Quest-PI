package com.mycompany.striker_quest;
//Importações
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Classe DAO (Data Acess Object)
public class DAO {
    //Verificação de Existência do Jogador
    public boolean existe(Jogador jogador)
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
}
