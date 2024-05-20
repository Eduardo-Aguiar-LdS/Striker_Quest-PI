import javax.swing.JOptionPane;
public class Striker {
    public static void main (String[]args){
        Conta conta = new Conta(false, false);
        //Iniciou o sistema
        while(conta.getLogoutJogo() == false){
            //Seleção de aluno ou professor
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Aluno\n2-Professor\n3-Sair do Jogo"));
            conta.setLogoutConta(false);
            //Seleção de opções
            if(opcao==1){
                while(conta.getLogoutConta()==false){
                int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Sair"));
                if(opcoes==1){
                    System.out.println("Aluno Iniciando Partida");
                }
                else if(opcoes==2){
                    conta.setLogoutConta(true);
                }else{
                System.out.println("Opcao inválida");
                }
                }
            } 
            else if(opcao==2){
                while(conta.getLogoutConta()==false){
                int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1-Jogar\n2-Sair"));
                if(opcoes==1){
                    System.out.println("Professor Iniciando Partida");
                }
                else if(opcoes==2){
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