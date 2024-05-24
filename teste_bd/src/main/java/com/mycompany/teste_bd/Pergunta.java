package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pergunta {
    private String pergunta;
    private int id_professor;

    public Pergunta(String pergunta, int id_professor){
        this.pergunta = pergunta;
        this.id_professor = id_professor;
    }

    public String getPergunta(){
        return pergunta;
    }

    public void setPergunta(String pergunta){
        this.pergunta = pergunta;
    }

    public int getId_Professor(){
        return id_professor;
    }

    public void setId_Profesor(){
        this.id_professor = id_professor;
    }

    
    //public exibirPergunta()
}
