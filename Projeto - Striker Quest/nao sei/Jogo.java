import atores.*; 
import campo.*;
import questoes.*;

public class Jogo{
    public static void main (String[] args){
    
    class Jogador {
        public String nome;
        public Integer pontuacao;
        public Double altura;
    
        public Jogador(String nome, Integer pontuacao, Double altura) {
            this.nome = nome;
            this.pontuacao = pontuacao;
            this.altura = altura;
        }
    
        public void efetuarLogin(){
            System.out.println("Login efetuado para o jogador: " + nome);
        }
    
        public void efetuarLogout(){
            System.out.println("Logout concluído para o jogador: " + nome + ", até logo...");
        }
    
        @Override
        public String toString() {
            return nome + " " + altura + " " + pontuacao;
        }
    }
    
    class Goleiro {
        public Double tamanho;
    
        public Goleiro(Double tamanho) {
            this.tamanho = tamanho;
        }
    
        public void defender(){
            System.out.println("Goleiro defendeu!");
        }
    }
    
    
    class Bola {
        public String cor;
        public Double tamanho;
    
        public Bola(String cor, Double tamanho) {
            this.cor = cor;
            this.tamanho = tamanho;
        }
    
        public void modificarCor(String novaCor){
            cor = novaCor;
            System.out.println("Cor da bola modificada para: " + cor);
        }
    
        public void modificarTamanho(Double novoTamanho){
            tamanho = novoTamanho;
            System.out.println("Tamanho da bola modificado para: " + tamanho);
        }
    
        public void fazGol(){
            System.out.println("Gooool! Parabéns!!");
        }
    
        public void chutarBola(){
            System.out.println("Bola chutada!");
        }
    }
    
    class Torcida {
        public String cor;
    
        public Torcida(String cor) {
            this.cor = cor;
        }
    
        public void comemorar(){
            System.out.println("A torcida está comemorando!");
        }
    }
    
    
    class Trave {
        public Double altura;
        public Double largura;
    
        public Trave(Double altura, Double largura) {
            this.altura = altura;
            this.largura = largura;
        }
    
        public void modificarAltura(Double novaAltura){
            altura = novaAltura;
            System.out.println("Altura da trave modificada para: " + altura);
        }
    
        public void modificarLargura(Double novaLargura){
            largura = novaLargura;
            System.out.println("Largura da trave modificada para: " + largura);
        }
    }
    
    
    class Partida {
        public String nomePartida;
    
        public Partida(String nomePartida) {
            this.nomePartida = nomePartida;
        }
    
        public void iniciarPartida(){
            System.out.println("Partida " + nomePartida + " iniciada!");
        }
    
        public void finalizarPartida(){
            System.out.println("Partida " + nomePartida + " finalizada!");
        }
    }
    
    
    class Pergunta {
        public String nomePergunta;
    
        public Pergunta(String nomePergunta) {
            this.nomePergunta = nomePergunta;
        }
    
        public void manterPergunta(){
            System.out.println("Pergunta: " + nomePergunta);
        }
    }
    
    class Resposta {
        public String nomeResposta;
    
        public Resposta(String nomeResposta) {
            this.nomeResposta = nomeResposta;
        }
    
        public void manterResposta(){
            System.out.println("Resposta: " + nomeResposta);
        }
    
        public void responderJogo(){
            System.out.println("Respondendo a pergunta: " + nomeResposta);
        }
    
        public void validarResposta(){
            System.out.println("Validando resposta: " + nomeResposta);
        }
    }
    }
}