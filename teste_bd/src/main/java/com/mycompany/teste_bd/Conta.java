package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conta{
    private boolean logoutJogo = false;
    private boolean logoutConta = false;
    private boolean logoutMenu = false;
        
    public Conta(boolean logoutJogo, boolean logoutConta, boolean logoutMenu){
        this.logoutJogo = false;
        this.logoutConta = false;
        this.logoutMenu = false;
    }
    
    //Entrar e sair do jogo
    public boolean setLogoutJogo(){
        return this.logoutJogo = true;
    }
    
    public boolean getLogoutJogo(){
        return logoutJogo;
    }
    
    //Entrar e sair da conta
    public boolean setLogoutConta(boolean varOkUm){
        return this.logoutConta = varOkUm;
    }
    
    public boolean getLogoutConta(){
        return logoutConta;
    }
    
    //Entrar e sair para menu principal
    public boolean setLogoutMenu(boolean varOkDois){
        return this.logoutMenu = varOkDois;
    }
    public boolean getLogoutMenu(){
        return logoutMenu;
    }

    public boolean inserirNomeJogador(String nome_jogador)throws Exception{
        String sql = "SELECT nome_jogador FROM Jogador"
        + "WHERE nome_jogador = ? ";
        
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

    public boolean inserirNomeTurma(int id_turma)throws Exception{
        String sql = "SELECT id_turma FROM Jogador"
        + "WHERE id_jogador = ? ";
        
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