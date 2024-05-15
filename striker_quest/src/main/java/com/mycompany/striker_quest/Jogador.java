package com.mycompany.striker_quest;

public class Jogador {
    private int id_jogador;
    private String nome_jogador;
    private String rg;
    private int pontuacao;
    private int maior_pontuacao;
    private int id_turma;
    
    public Jogador(String nome_jogador, int id_turma){
        this.nome_jogador = nome_jogador;
        this.id_turma = id_turma;
    }
    
    public String getNome_jogador(){
        return nome_jogador;
    }
    public void setNome_jogador(String nome_jogador){
        this.nome_jogador = nome_jogador;
    }
    public int getId_turma(){
        return id_turma;
    }
    public void setId_turma(int id_turma){
        this.id_turma = id_turma;
    }
}
