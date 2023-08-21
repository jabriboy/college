package Services;

public class ServicoTaxaParaiso implements ServicoTaxa {

    @Override
    public Double calculaTaxa(Double valorDiaria) {
        Double taxa = (valorDiaria * .05 + 10);

        return taxa;
    }
    
}
