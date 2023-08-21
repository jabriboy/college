public class JanelaDialogo extends JanelaAbstrata{

    public JanelaDialogo(JanelaImplementada janela){
        super(janela);
        this.janela = janela;
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela Dialogo");
        desenharBotao("Botao Dialogo");
        
    }
    
}
