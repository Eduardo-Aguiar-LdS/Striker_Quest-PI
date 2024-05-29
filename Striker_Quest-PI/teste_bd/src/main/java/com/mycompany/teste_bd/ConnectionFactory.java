package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.DriverManager;

//Classe Connection Factory
public class ConnectionFactory {
    private static String host = "mysql-3077d70b-poo-imt-ap10-2024.k.aivencloud.com";
    private static String porta = "19862";
    private static String db = "teste";
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_DJ4ArJCcuL6fQgn2jdS";
    
    /*private static String host = DATABASE_HOST;
    private static String porta = DATABASE_PORTA;
    private static String db = DATABASE_DB;
    private static String usuario = DATABASE_USUARIO;
    private static String senha = DATABASE_SENHA;*/
    //Método para Obter Conexão
    public static Connection obterConexao()
            throws Exception{
        String url = String.format(
            "jdbc:mysql://%s:%s/%s", host, 
            porta, db
        );
        return DriverManager.getConnection(url,
                usuario, senha);
    }
}