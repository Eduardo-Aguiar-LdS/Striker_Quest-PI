package com.mycompany.teste_bd;
import java.util.Random;

public class Pergunta {
<<<<<<< Updated upstream
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

    public String exibirPergunta(Pergunta perguntas) throws Exception {
        String sql = "SELECT pergunta FROM Pergunta WHERE id_pergunta = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, perguntas.getId_Pergunta());
            return ps.execute(); // Pesquisar como retornar uma String
        }
=======
    private int algarismo_um;
    private int algarismo_dois;
    private String operador;

    public Pergunta(){
        this.algarismo_um = algarismo_um;
        this.algarismo_dois = algarismo_dois;
        this.operador = operador;
    }

    public String fazerPergunta(Pergunta pergunta){
        Random rand = new Random();
        algarismo_um = rand.nextInt(1, 20);
        algarismo_dois = rand.nextInt(0, 20);
        String operador = "+-";
        char escolhaOperador = operador.charAt(rand.nextInt(operador.length()));
        if (algarismo_um>=algarismo_dois){
            return "Quanto é "+ algarismo_um +" "+escolhaOperador+" "+ algarismo_dois+" ?";
        }
        else{
            return pergunta.fazerPergunta(pergunta);
        }
    }

    public static void main (String[]args){
        Pergunta pergunta = new Pergunta();
        System.out.println(pergunta.fazerPergunta(pergunta));
>>>>>>> Stashed changes
    }
}

/*
 import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Pergunta {
    private int algarismo_um;
    private int algarismo_dois;
    private String operador;

    public String fazerPergunta(Pergunta pergunta){
        Random rand = new Random();
        algarismo_um = rand.nextInt(1, 20);
        algarismo_dois = rand.nextInt(0, 20);
        operador = "+-";
        char escolhaOperador = operador.charAt(rand.nextInt(operador.length()));
        if (algarismo_um>=algarismo_dois){
            List <Integer> lista_alternativas = new ArrayList<Integer>();
            lista_alternativas.add(algarismo_um+algarismo_dois);
            lista_alternativas.add(algarismo_um-algarismo_dois);
            lista_alternativas.add(algarismo_um-algarismo_dois+1);
            lista_alternativas.add(algarismo_um+algarismo_dois+1);

            Map<Integer, Integer> ordem_alternativas = new HashMap<>();
            for (int i = 0; i<lista_alternativas.size()-1; i++){
                int valorAtual = lista_alternativas.get(i);
                int valorSeguinte = lista_alternativas.get(i+1);
                ordem_alternativas.put(valorAtual, valorSeguinte);
            }
            for (int chave : ordem_alternativas.keySet()) {
                int valor = ordem_alternativas.get(chave);
                System.out.println("Chave: " + chave + ", Valor: " + valor);
            }
            return "Quanto é "+ algarismo_um +" "+escolhaOperador+" "+ algarismo_dois+" ?";
        }
        else{
            return pergunta.fazerPergunta(pergunta);
        }
    }

    
    public static void main (String[]args){
        Pergunta pergunta = new Pergunta();
        System.out.println(pergunta.fazerPergunta(pergunta));
    }
}

// label.setText(fazerPergunta(pergunta));
 */
