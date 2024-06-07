package com.mycompany.teste_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Resposta {
    private int id_resposta;
    private String resposta_correta;
    private String resposta_um;
    private String resposta_dois;
    private String resposta_tres;
    private int id_pergunta;

    public Resposta() {

    }

    public Resposta(int id_resposta) {
        this.id_resposta = id_resposta;
    }

    public Resposta(String resposta_correta, String resposta_um, String resposta_dois, String resposta_tres,
            int id_pergunta) {
        this.resposta_correta = resposta_correta;
        this.resposta_um = resposta_um;
        this.resposta_dois = resposta_dois;
        this.resposta_tres = resposta_tres;
        this.id_pergunta = id_pergunta;
    }

    public int getId_Resposta() {
        return id_pergunta;
    }

    public void setId_Resposta(int id_resposta) {
        this.id_resposta = id_resposta;
    }

    public String getRespostaCorreta() {
        return resposta_correta;
    }

    public void setRespostaCorreta(String resposta_correta) {
        this.resposta_correta = resposta_correta;
    }

    public String getRespostaUm() {
        return resposta_um;
    }

    public void setRespostaUm(String resposta_um) {
        this.resposta_um = resposta_um;
    }

    public String getRespostaDois() {
        return resposta_dois;
    }

    public void setRespostaDois(String resposta_dois) {
        this.resposta_dois = resposta_dois;
    }

    public String getRespostaTres() {
        return resposta_tres;
    }

    public void setRespostaTres(String resposta_tres) {
        this.resposta_tres = resposta_tres;
    }

    public int getId_Pergunta() {
        return id_pergunta;
    }

    public void setId_Pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    /*public String exibirRespostaCorreta(Pergunta perguntas) throws Exception {
        String sql = "SELECT resposta_correta FROM Resposta WHERE id_pergunta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perguntas.getId_Pergunta());
            return ps.execute(); // Pesquisar como retornar uma String
        }
    }*/

    /*public String exibirRespostaUm(Pergunta perguntas) throws Exception {
        String sql = "SELECT resposta_um FROM Resposta WHERE id_pergunta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perguntas.getId_Pergunta());
            return ps.execute(); // Pesquisar como retornar uma String
        }
    }*/

    /*public String exibirRespostaDois(Pergunta perguntas) throws Exception {
        String sql = "SELECT resposta_dois FROM Resposta WHERE id_pergunta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perguntas.getId_Pergunta());
            return ps.execute(); // Pesquisar como retornar uma String
        }
    }*/

    /*public String exibirRespostaTres(Pergunta perguntas) throws Exception {
        String sql = "SELECT resposta_tres FROM Resposta WHERE id_pergunta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perguntas.getId_Pergunta());
            return ps.execute(); // Pesquisar como retornar uma String
        }
    }*/

    public boolean selecionarResposta(Resposta resposta) throws Exception {
        String sql = "SELECT resposta_correta FROM Resposta WHERE id_resposta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, resposta.getId_Resposta());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
}
