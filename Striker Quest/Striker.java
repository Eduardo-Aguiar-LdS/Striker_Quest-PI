import javax.swing.JOptionPane;
public class Striker {
    public static void main (String[]args){
        //Criação de Objetos
        Conta conta = new Conta(false, false);
        //Iniciou o sistema
        while(conta.getLogoutJogo() == false){
            //Seleção de aluno ou professor
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Aluno\n2-Professor\n3-Sair do Jogo"));
            conta.setLogoutConta(false);
            //Seleção de opções do Aluno
            if(opcao==1){
                //verificar existência de Jogador
                //inserirNomeJogador()
                //inserirNomeTurma
                while(conta.getLogoutConta()==false){
                int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Exibir pontuação\n3-Sair"));
                if(opcoes==1){
                    System.out.println("Aluno Iniciando Partida");
                    //Jogo mostra pergunta
                    //Jogador escolhe a resposta
                    //Se 3 respostas erradas, jogo encerra
                    //exibirPontuação()
                    conta.setLogoutConta(true);
                }else if(opcoes==2){
                    //exibirPontuação()
                    conta.setLogoutConta(true);
                }else if(opcoes==3){
                    conta.setLogoutConta(true);
                }else{
                System.out.println("Opcao inválida");
                }
                }
            } //Seleção de opções do Professor
            else if(opcao==2){
                //verificar existência de Professor
                //inserirEmail()
                //inserirSenha()
                while(conta.getLogoutConta()==false){
                int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Cadastrar turma\n3-Cadastrar aluno\n4-Cadastrar pergunta\n5-Exibir pontuação\n6-Sair"));
                if(opcoes==1){
                    System.out.println("Professor Iniciando Partida");
                    //Jogo mostra pergunta
                    //Jogador escolhe a resposta
                    //Se 3 respostas erradas, jogo encerra
                    //exibirPontuação()
                }else if(opcoes==2){
                    //cadastrarTurma(nome_turma)
                    conta.setLogoutConta(true);
                }else if(opcoes==3){
                    //cadastrarAluno(nome_aluno, rg_jogador, nome_turma)
                    conta.setLogoutConta(true);
                }else if(opcoes==4){
                    //cadastrarPergunta(pergunta, resposta_correta, resposta1, resposta2, resposta3)
                    conta.setLogoutConta(true);
                }else if(opcoes==5){
                    //exibirPontuação()
                    conta.setLogoutConta(true);
                }else if(opcoes==6){
                    conta.setLogoutConta(true);
                }else{
                System.out.println("Opcao inválida");
                }
                }
            }
            else if(opcao==3){
                conta.setLogoutJogo();
            }
            else{
                System.out.println("Conta inválida");
            }
        }
    }
}