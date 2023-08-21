public class Jogador {
    private int idade;
    private String nome;
    private String posicao;

    public Jogador(){}

    public Jogador(int idade, String nome, String posicao){
        this.idade = idade;
        this.nome = nome;
        this.posicao = posicao;

    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
}
