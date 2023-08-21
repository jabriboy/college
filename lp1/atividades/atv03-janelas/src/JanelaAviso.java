public class JanelaAviso extends JanelaAbstrata {

    public JanelaAviso(JanelaImplementada janela){
        super(janela);
        this.janela = janela;
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela Aviso");
        desenharBotao("Botao Aviso");
        
    }
    
}
