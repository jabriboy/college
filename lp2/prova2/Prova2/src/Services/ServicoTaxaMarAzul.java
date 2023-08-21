package Services;

public class ServicoTaxaMarAzul implements ServicoTaxa {

    public ServicoTaxaMarAzul(){}

    @Override
    public Double calculaTaxa(Double valorDiaria) {
        Double taxa = (valorDiaria * .02) + 15;

        return taxa;
    }
    
}
