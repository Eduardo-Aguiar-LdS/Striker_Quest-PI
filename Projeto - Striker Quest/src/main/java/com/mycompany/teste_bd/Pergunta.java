package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pergunta {

    private int id_pergunta;
    private String pergunta;
    private int id_professor;

    public Pergunta(String pergunta, int id_professor) {
        this.pergunta = pergunta;
        this.id_professor = id_professor;
    }

    public Pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public int getId_Pergunta() {
        return id_pergunta;
    }

    public void setId_Pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public int getId_Professor() {
        return id_professor;
    }

    public void setId_Profesor(int id_professor) {
        this.id_professor = id_professor;
    }
    /*
    public String exibirPergunta(Pergunta perguntas) throws Exception {
        String sql = "SELECT pergunta FROM Pergunta WHERE id_pergunta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perguntas.getId_Pergunta());
            return ps.execute(); // Pesquisar como retornar uma String
        }
    }*/
}
