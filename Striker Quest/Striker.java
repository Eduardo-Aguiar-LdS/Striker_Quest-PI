import javax.swing.JOptionPane;
public class Striker {
    public static void main (String[]args){
        while(efetuarLogout()==False){
            int opcao = Integer.parseInt(JOptionPane.showInoutDialog("1-Aluno\n2-Professor"));
            if(opcao==1){
                int opcoes = Integer.parseInt(JOptionPane.showInoutDialog("1-Jogar\n2-Sair"));
                if(opcoes==1){
                    System.out.println("Iniciando Partida");
                }
                else if(opcoes==2){
                    efetuarLogout(True);
                }else{
                System.out.println("Seleção inválida");
                }
            }
            else if(opcao==2){
                int opcoes = Integer.parseInt(JOptionPane.showInoutDialog("1-Jogar\n2-Sair"));
                if(opcoes==1){
                    System.out.println("Iniciando Partida");
                }
                else if(opcoes==2){
                    efetuarLogout(True);
                }else{
                System.out.println("Seleção inválida");
                }
            }
            else{
                System.out.println("Seleção inválida");
            }
        }
    }
}
