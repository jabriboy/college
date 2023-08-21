package Services;

import java.time.Period;

import Entities.Aluguel;

public class ServicoGerarBoleto {
    private Double valorDiaria;
    private ServicoTaxa servicoTaxa;

    public ServicoGerarBoleto(){}

    public ServicoGerarBoleto(Double valorDiaria, ServicoTaxa servicoTaxa){
        this.valorDiaria = valorDiaria;
        this.servicoTaxa = servicoTaxa;
    }

    public void processarBoleto(Aluguel aluguel){
        Period periodo = Period.between(aluguel.getEntrada(), aluguel.getSaida());
        int dias = periodo.getDays() + 1;

        Double valorTaxa = servicoTaxa.calculaTaxa(valorDiaria);

        Double valorTotal = (valorTaxa + valorDiaria) * dias;
        System.out.println(valorTotal);
    }   

    public Double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public ServicoTaxa getServicoTaxa() {
        return servicoTaxa;
    }
    public void setServicoTaxa(ServicoTaxa servicoTaxa) {
        this.servicoTaxa = servicoTaxa;
    }

}
