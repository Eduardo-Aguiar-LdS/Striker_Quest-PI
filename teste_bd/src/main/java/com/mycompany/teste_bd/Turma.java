package com.mycompany.teste_bd;

public class Turma {
    private String nome_turma;
    private int id_professor;

    public Turma(String nome_turma, int id_professor){
        this.nome_turma = nome_turma;
        this.id_professor = id_professor;
    }

    public String getNome_turma(){
        return nome_turma;
    }
    public void setNome_turma(String nome_turma){
        this.nome_turma = nome_turma;
    }
    public int getId_professor(){
        return id_professor;
    }
    public void setId_professor(int id_professor){
        this.id_professor = id_professor;
    }
}
