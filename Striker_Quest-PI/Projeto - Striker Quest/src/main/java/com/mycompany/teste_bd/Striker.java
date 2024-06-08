package com.mycompany.teste_bd;

// import java.lang.classfile.TypeAnnotation.TypeArgumentTarget;
import javax.swing.JOptionPane;

public class Striker {

    public static void main(String[] args) throws Exception {
        // Criação de Objetos
        Conta conta = new Conta(false, false, false, false);
        // Iniciou o sistema
        while (conta.getLogoutJogo() == false) {
            // Seleção de aluno ou professor
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Aluno\n2-Professor\n3-Sair do Jogo"));
            conta.setLogoutConta(false);
            while (conta.getLogoutConta() == false) {
                // Seleção de opções do Aluno
                if (opcao == 1) {
                    // verificar existência de Jogador
                    String nome_jogador = JOptionPane.showInputDialog(null, "Insira o nome do Jogador");
                    String nome_turma = JOptionPane.showInputDialog(null, "Insira a turma do Jogador");
                    Jogador jogador = new Jogador(nome_jogador);
                    Turma turma = new Turma(nome_turma);
                    DAO dao = new DAO();
                    if (dao.existeJogador(jogador, turma)) {
                        JOptionPane.showMessageDialog(null, "Bem vindo!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário inválido!!");
                        break;
                    }
                    conta.setLogoutVerificacao(false);
                    while (conta.getLogoutVerificacao() == false) {
                        int opcoes = Integer
                                .parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Exibir pontuação\n3-Sair"));
                        conta.setLogoutMenu(false);
                        while (conta.getLogoutMenu() == false) {
                            if (opcoes == 1) { // Jogar
                                System.out.println("Aluno Iniciando Partida");
                                int contador = 0;
                                int num_perguntas = 1;
                                while (contador <= 2 || num_perguntas <= 15) {
                                    String p1 = JOptionPane.showInputDialog(null, "Quanto é 5 + 3?");
                                    String p2 = JOptionPane.showInputDialog(null, "Quanto é 15 - 7?");
                                    String p3 = JOptionPane.showInputDialog(null, "Quanto é 8 + 12?");
                                    String p4 = JOptionPane.showInputDialog(null, "Quanto é 20 - 9?");
                                    String p5 = JOptionPane.showInputDialog(null, "Quanto é 14 + 6?");
                                    String p6 = JOptionPane.showInputDialog(null, "Quanto é 18 - 4?");
                                    String p7 = JOptionPane.showInputDialog(null, "Quanto é 9 + 9?");
                                    String p8 =JOptionPane.showInputDialog(null, "Quanto é 22 - 13?");
                                    String p9 =JOptionPane.showInputDialog(null, "Quanto é 11 + 7?");
                                    String p10 =JOptionPane.showInputDialog(null, "Quanto é 16 - 8?");
                                    String p11 =JOptionPane.showInputDialog(null, "Quanto é 7 + 5?");
                                    String p12 =JOptionPane.showInputDialog(null, "Quanto é 13 - 6?");
                                    String p13 =JOptionPane.showInputDialog(null, "Quanto é 4 + 4?");

                                    String p14 =JOptionPane.showInputDialog(null, "Quanto é 19 - 11?");
                                    String p15 =JOptionPane.showInputDialog(null, "Quanto é 39 + 2?");
                                    // Jogo mostra pergunta e resposta
                                    //int id_pergunta = Integer.parseInt("Colocar um numero aleatorio"); // Colocar um
                                    // numero
                                    // aletorio
                                    //Pergunta perguntas = new Pergunta(id_pergunta);
                                    //perguntas.exibirPergunta(perguntas);
                                    Resposta resposta = new Resposta();
                                    //resposta.exibirRespostaCorreta(perguntas);
                                    //resposta.exibirRespostaUm(perguntas);
                                    //resposta.exibirRespostaDois(perguntas);
                                    //resposta.exibirRespostaTres(perguntas);
                                    // Jogador escolhe a resposta
                                    int id_resposta = Integer.parseInt("Selecionar id da resposta"); // Colocar o id da
                                    // pergunta
                                    Resposta respondendo = new Resposta(id_resposta);
                                    // Validação de respostas
                                    if (respondendo.selecionarResposta(respondendo) == true) {
                                        num_perguntas++;
                                        System.out.println("Acertou " + num_perguntas + " perguntas!!!");
                                        // Receber ponto
                                    } else {
                                        contador++;
                                        System.out.println("Errou " + contador + " perguntas!!!");
                                        num_perguntas++;
                                        System.out.println("Já foram feitas " + num_perguntas + " perguntas!!!");
                                    }
                                } // Final do while do contador
                                // dao.exibirPontuacao(true);
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 2) { // Exibir pontuação
                                // dao.exibirPontuacao(true);
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 3) { // Sair da conta
                                conta.setLogoutMenu(true);
                                conta.setLogoutVerificacao(true);
                                conta.setLogoutConta(true);
                            } else {
                                System.out.println("Opcao inválida");
                            }
                        } // Fim do While do menu aluno
                    } // Fim do While da verificação aluno
                } // Fim da seleção aluno
                else if (opcao == 2) {
                    // verificar existência de Professor
                    String email = JOptionPane.showInputDialog(null, "Insira seu email");
                    String senha = JOptionPane.showInputDialog(null, "Insira sua senha");
                    Professor professor = new Professor(email, senha);
                    DAO dao = new DAO();
                    if (dao.professorExiste(professor)) {
                        JOptionPane.showMessageDialog(null, "Bem vindo!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário inválido!!");
                        break;
                    }
                    conta.setLogoutVerificacao(false);
                    while (conta.getLogoutVerificacao() == false) {
                        int opcoes = Integer.parseInt(JOptionPane.showInputDialog(
                                "1-Jogar\n2-Cadastrar turma\n3-Cadastrar aluno\n4-Cadastrar pergunta\n5-Exibir pontuação\n6-Sair"));
                        conta.setLogoutMenu(false);
                        while (conta.getLogoutMenu() == false) {
                            if (opcoes == 1) {
                                System.out.println("Professor Iniciando Partida");
                                int contador = 0;
                                int num_perguntas = 1;
                                while (contador <= 2 || num_perguntas <= 15) {
                                    // Jogo mostra pergunta e resposta
                                    int id_pergunta = Integer.parseInt("Colocar um numero aleatorio"); // Colocar um
                                    // numero
                                    // aletorio
                                    Pergunta perguntas = new Pergunta(id_pergunta);
                                    //perguntas.exibirPergunta(perguntas);
                                    Resposta resposta = new Resposta();
                                    //resposta.exibirRespostaCorreta(perguntas);
                                    //resposta.exibirRespostaUm(perguntas);
                                    //resposta.exibirRespostaDois(perguntas);
                                    //resposta.exibirRespostaTres(perguntas);
                                    // Jogador escolhe a resposta
                                    int id_resposta = Integer.parseInt("Selecionar id da resposta"); // Colocar o id da
                                    // pergunta
                                    Resposta respondendo = new Resposta(id_resposta);
                                    // Validação de respostas
                                    if (respondendo.selecionarResposta(respondendo) == true) {
                                        num_perguntas++;
                                        System.out.println("Acertou " + num_perguntas + " perguntas!!!");
                                        // Receber ponto
                                    } else {
                                        contador++;
                                        System.out.println("Errou " + contador + " perguntas!!!");
                                        num_perguntas++;
                                        System.out.println("Já foram feitas " + num_perguntas + " perguntas!!!");
                                    }
                                } // Final do while do contador
                                // dao.exibirPontuacao(true);
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 2) {
                                // Entrada de dados da turma
                                String nome_turma = JOptionPane.showInputDialog(null, "Insira o nome da turma");
                                int id_professor = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Insira seu id de professor"));
                                Turma turma = new Turma(nome_turma, id_professor);
                                // Validando turma
                                try {
                                    if (dao.turmaExiste(turma)) {
                                        JOptionPane.showMessageDialog(null, "Turma existente");
                                    } else {
                                        professor.cadastrarTurma(turma);
                                        JOptionPane.showMessageDialog(null, "Turma cadastrada");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Problemas Técnicos em Cadastrar Turma");
                                }
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 3) {
                                String nome_jogador = JOptionPane.showInputDialog(null, "Insira o nome do Jogador");
                                String rg = JOptionPane.showInputDialog(null, "Insira o RG do Jogador");
                                int id_turma = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Insira o id da turma do Jogador"));
                                Jogador jogador = new Jogador(nome_jogador, rg, id_turma);
                                // Validando aluno
                                try {
                                    if (dao.existeCadastroJogador(jogador)) { // Não está funcionando
                                        JOptionPane.showMessageDialog(null, "Aluno existente");
                                    } else {
                                        professor.cadastrarAluno(jogador);
                                        JOptionPane.showMessageDialog(null, "Aluno cadastrado");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Problemas Técnicos em Cadastrar Aluno");
                                }
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 4) {
                                String pergunta = JOptionPane.showInputDialog(null, "Insira sua pergunta");
                                int id_professor = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Insira seu id de professor"));
                                String resposta_correta = JOptionPane.showInputDialog(null,
                                        "Insira a resposta correta");
                                String resposta_um = JOptionPane.showInputDialog(null,
                                        "Insira uma resposta alternativa incorreta");
                                String resposta_dois = JOptionPane.showInputDialog(null,
                                        "Insira uma resposta alternativa incorreta");
                                String resposta_tres = JOptionPane.showInputDialog(null,
                                        "Insira uma resposta alternativa incorreta");
                                int id_pergunta = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Insira o id da sua pergunta"));
                                Pergunta perguntas = new Pergunta(pergunta, id_professor);
                                Resposta resposta = new Resposta(resposta_correta, resposta_um, resposta_dois,
                                        resposta_tres, id_pergunta);
                                // Validando Perguntas e professor
                                try {
                                    if (dao.perguntaExiste(perguntas, resposta)) {
                                        JOptionPane.showMessageDialog(null, "Pergunta e respostas existentes");
                                    } else {
                                        professor.cadastrarPergunta(perguntas);
                                        JOptionPane.showMessageDialog(null, "Pergunta e respostas cadastradas");
                                    }
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Problemas Técnicos em Cadastrar Perguntas");
                                }
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 5) {
                                // dao.exibirPontuacao(true);
                                conta.setLogoutMenu(true);
                            } else if (opcoes == 6) {
                                conta.setLogoutMenu(true);
                                conta.setLogoutVerificacao(true);
                                conta.setLogoutConta(true);
                            } else {
                                System.out.println("Opção inválida");
                            }
                        }
                    } // Fim do while da Verificação
                } // Fim da seleção do Professor
                else if (opcao == 3) {
                    conta.setLogoutConta(true);
                    conta.setLogoutJogo();
                } else {
                    System.out.println("Opção inválida");
                }
            } // Fim do while da Conta
        } // Fim do while do Jogo
    }
}