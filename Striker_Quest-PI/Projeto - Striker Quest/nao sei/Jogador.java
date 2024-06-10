package atores;

public class Jogador {
    public String nome;
    public Integer pontuacao;
    public Double altura;

    public void efetuarLogin(){
        System.out.println(""); // "Insira seu login" ou "Login efetuado"?
    }
    public void efetuarLogout(){
        System.out.println("Logout concluído, até logo..."); 
    }
    @Override
    public String toString() {
        return nome + " " + altura + " " + pontuacao + " "; 
    }

    
}

