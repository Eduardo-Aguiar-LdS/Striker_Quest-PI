package com.mycompany.teste_bd;

import javax.swing.JOptionPane;

public class Striker {
    public static void main (String[]args) throws Exception{
        //Criação de Objetos
        Conta conta = new Conta(false, false, false);
        //Iniciou o sistema
        while(conta.getLogoutJogo() == false){
            //Seleção de aluno ou professor2
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Aluno\n2-Professor\n3-Sair do Jogo"));
            conta.setLogoutConta(false);
            //Seleção de opções do Aluno
            if(opcao==1){
                //verificar existência de Jogador
                String nome_jogador = JOptionPane.showInputDialog(null, "Insira o nome do Jogador");
                int id_turma = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a turma do Jogador"));
                conta.inserirNomeJogador(nome_jogador);
                conta.inserirNomeTurma(id_turma);
                while(conta.getLogoutConta()==false){
                while (conta.getLogoutMenu()){
                    int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Exibir pontuação\n3-Sair"));
                    if(opcoes==1){ //Jogar
                        System.out.println("Aluno Iniciando Partida");
                        //Jogo mostra pergunta
                        //Jogador escolhe a resposta
                        DAO dao = new DAO();
                        dao.exibirPontuacao(true);
                        conta.setLogoutMenu(true);
                    }else if(opcoes==2){ //Exibir pontuação
                        DAO dao = new DAO();
                        dao.exibirPontuacao(true);
                        conta.setLogoutMenu(true);
                    }else if(opcoes==3){ // Sair da conta
                        conta.setLogoutMenu(true);
                        conta.setLogoutConta(true);
                    }else{
                        System.out.println("Opcao inválida");}
                        }//Fim do While do menu
                }//Fim do while da conta
            } //Fim da seleção aluno
            
            
                else if(opcao==2){
                //verificar existência de Professor
                String email = JOptionPane.showInputDialog(null, "Insira seu email");
                String senha = JOptionPane.showInputDialog(null, "Insira sua senha");
                Professor professor = new Professor(email, senha);
                DAO dao = new DAO();
                //try{
                    if(dao.professorExiste(professor)){
                        JOptionPane.showMessageDialog(null,"Bem vindo!!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuário inválido!!");
                        }
                /*}catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Problemas Técnicos em Verificar Professor");
                        }*/
                while(conta.getLogoutConta()==false){
                int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Cadastrar turma\n3-Cadastrar aluno\n4-Cadastrar pergunta\n5-Exibir pontuação\n6-Sair"));
                if(opcoes==1){
                    System.out.println("Professor Iniciando Partida");
                    //Jogo mostra pergunta
                    //Jogador escolhe a resposta
                    //Se 3 respostas erradas, jogo encerra
                    dao.exibirPontuacao(true);
                }else if(opcoes==2){
                    //Entrada de dados da turma
                    String nome_turma = JOptionPane.showInputDialog(null, "Insira o nome da turma");
                    int id_professor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu id"));
                    Turma turma = new Turma(nome_turma, id_professor);
                    //Validando turma
                    try{
                        
                        if(dao.turmaExiste(turma)){
                            JOptionPane.showMessageDialog(null,"Turma existente");
                        }else{
                            professor.cadastrarTurma(turma);
                            JOptionPane.showMessageDialog(null, "Turma cadastrada");
                            }
                    }catch(Exception e){
                            JOptionPane.showMessageDialog(null,"Problemas Técnicos em Cadastrar Turma");
                    }
                    conta.setLogoutConta(true);
                }else if(opcoes==3){
                    String nome_jogador = JOptionPane.showInputDialog(null, "Insira o nome do Jogador");
                    String rg = JOptionPane.showInputDialog(null, "Insira o RG do Jogador");
                    int id_turma = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a turma do Jogador"));
                    Jogador jogador = new Jogador(nome_jogador, rg, id_turma);
                    professor.cadastrarAluno(jogador);
                    conta.setLogoutConta(true);
                }else if(opcoes==4){
                    //cadastrarPergunta(pergunta, resposta_correta, resposta1, resposta2, resposta3)
                    conta.setLogoutConta(true);
                }else if(opcoes==5){
                    dao.exibirPontuacao(true);
                    conta.setLogoutConta(true);
                }else if(opcoes==6){
                    conta.setLogoutConta(true);
                }else{
                System.out.println("Opção inválida");
                }
                }
            }
            else if(opcao==3){
                conta.setLogoutJogo();
            }
            else{
                System.out.println("Opção inválida");
            }
        }
    }
}
