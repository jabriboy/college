package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluguel {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate entrada;
    private LocalDate saida;
    private Imovel imovel;
    
    public Aluguel(){}
    
    public Aluguel(Imovel imovel, LocalDate entrada, LocalDate saida){
        this.imovel = imovel;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public LocalDate getEntrada() {
        return entrada;
    }
    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
    public LocalDate getSaida() {
        return saida;
    }
    public void setSaida(LocalDate saida) {
        this.saida = saida;
    } 
}
