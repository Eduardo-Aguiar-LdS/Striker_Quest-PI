//Importações
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conta{
    private boolean logoutJogo = false;
    private boolean logoutConta = false;
        
    public Conta(boolean logoutJogo, boolean logoutConta){
        this.logoutJogo = false;
        this.logoutConta = false;
    }
    
    public boolean setLogoutJogo(){
        return this.logoutJogo = true;
    }
        
    public boolean setLogoutConta(boolean varOk){
        return this.logoutConta = varOk;
    }
    
    public boolean getLogoutJogo(){
        return logoutJogo;
    }
    
    public boolean getLogoutConta(){
        return logoutConta;
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