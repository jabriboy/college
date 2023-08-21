public abstract class JanelaAbstrata implements JanelaImplementada {

    protected JanelaImplementada janela;

    public JanelaAbstrata(JanelaImplementada janela){
        this.janela = janela;
    }

    public JanelaAbstrata(){}
    
    @Override
    public void desenharJanela(String strJanela){
        System.out.print(strJanela);
    }

    @Override
    public void desenharBotao(String strBotao){
        System.out.print(strBotao);
    }

    public abstract void desenhar();
}
