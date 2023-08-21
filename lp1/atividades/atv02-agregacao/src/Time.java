public class Time {
    private String nometime;
    private String tecnico;
    private Jogador[] jogadores;
    private int totalJogadores;

    public Time(){
        this.jogadores = new Jogador[12];
        totalJogadores = 0;
    }

    public void contrataJogador(Jogador jogador){
        this.jogadores[this.totalJogadores] = jogador;

        System.out.println("Nome: "+jogador.getNome());
        System.out.println("Idade: "+jogador.getIdade());
        System.out.println("Posicao: "+jogador.getPosicao());

        totalJogadores++;
    }

    public String getNometime() {
        return nometime;
    }
    public void setNometime(String nometime) {
        this.nometime = nometime;
    }

    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setJogadores(Jogador[] jogadores) {
        if(jogadores.length <= 12)
            this.jogadores = jogadores;
        else
            System.out.println("Número de jogadores acima do limite por time");
    }

    public int getTotalJogadores() {
        return totalJogadores;
    }
    public void setTotalJogadores(int totalJogadores) {
        if(totalJogadores <= 12)
            this.totalJogadores = totalJogadores;
        else
            System.out.println("Número máximos de jogadores acima do limite");
    }
    
}
