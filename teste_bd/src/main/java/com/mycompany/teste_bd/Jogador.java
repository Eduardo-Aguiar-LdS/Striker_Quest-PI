package com.mycompany.teste_bd;

public class Jogador {
    private String nome_jogador;
    private String rg;
    private int pontuacao;
    private int maior_pontuacao;
    private int id_turma;
    
    public Jogador(String nome_jogador){
        this.nome_jogador = nome_jogador;
    }

    public Jogador(String nome_jogador, String rg, int id_turma){
        this.nome_jogador = nome_jogador;
        this.rg = rg;
        this.id_turma = id_turma;
    }
    
    public String getNome_jogador(){
        return nome_jogador;
    }
    public void setNome_jogador(String nome_jogador){
        this.nome_jogador = nome_jogador;
    }
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public int getId_turma(){
        return id_turma;
    }
    public void setId_turma(int id_turma){
        this.id_turma = id_turma;
    }
}
