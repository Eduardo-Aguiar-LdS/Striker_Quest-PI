package com.mycompany.teste_bd;

import java.util.Random;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Pergunta {
    private int algarismo_um;
    private int algarismo_dois;
    private String operador;
    
    /**
     * 
     * @param pergunta
     * @return 
     */
    public String fazerPergunta(Pergunta pergunta) {
        Random rand = new Random();
        // Gerar aleatoriamente os números
        algarismo_um = rand.nextInt(1, 20);
        algarismo_dois = rand.nextInt(0, 20);
        
        // Escolher aleatoriamente uma operação (soma ou subtração)
        operador = "+-";
        char escolhaOperador = operador.charAt(rand.nextInt(operador.length()));
        
        // Garantir que o resultado nunca dê um número negativo
        if (algarismo_um >= algarismo_dois) {
            List<Integer> lista_alternativas = new ArrayList<Integer>();
            lista_alternativas.add(algarismo_um + algarismo_dois);
            lista_alternativas.add(algarismo_um - algarismo_dois);
            lista_alternativas.add(algarismo_um - algarismo_dois + 1);
            lista_alternativas.add(algarismo_um + algarismo_dois + 1);

            Map<Integer, Integer> ordem_alternativas = new HashMap<>();
            for (int i = 0; i < lista_alternativas.size() - 1; i++) {
                int valorAtual = lista_alternativas.get(i);
                int valorSeguinte = lista_alternativas.get(i + 1);
                ordem_alternativas.put(valorAtual, valorSeguinte);
            }
            for (int chave : ordem_alternativas.keySet()) {
                int valor = ordem_alternativas.get(chave);
                // System.out.println("Chave: " + chave + ", Valor: " + valor);
            }
            return "Quanto é " + algarismo_um + " " + escolhaOperador + " " + algarismo_dois + " ?";
        } else {
            return pergunta.fazerPergunta(pergunta);
        }
    }

    public static void main(String[] args) {
        Pergunta pergunta = new Pergunta();
        System.out.println(pergunta.fazerPergunta(pergunta));
    }
}

// label.setText(fazerPergunta(pergunta));
