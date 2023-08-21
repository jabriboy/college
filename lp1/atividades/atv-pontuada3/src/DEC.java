public class DEC {
    Teclado tec;
    Mouse mouse;
    Impressora imp;
    
    public DEC(){}

    public void instanceTeclado(String tipo_conexao, String marca){
        Teclado tec = new Teclado(tipo_conexao, marca);
        this.tec = tec;
    }

    public void instanceMouse(String marca, String modelo, float tamanho, float peso){
        Mouse mouse = new Mouse(marca, modelo, tamanho, peso);
        this.mouse = mouse;
    }

    public void instanceImpressora(String cor, float voltagem, String tipo_impressao){
        Impressora imp = new Impressora(cor, voltagem, tipo_impressao);
        this.imp = imp;
    }

}
