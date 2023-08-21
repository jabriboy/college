import java.time.LocalDate;

import Entities.Aluguel;
import Entities.Imovel;
import Services.ServicoGerarBoleto;
import Services.ServicoTaxaMarAzul;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate entrada = LocalDate.of(2020, 10, 1);
        LocalDate saida = LocalDate.of(2020, 10, 10);
        Aluguel aluguel = new Aluguel(new Imovel(001, "casa 4/4"), entrada, saida);
        
        ServicoGerarBoleto servicoGerarBoleto = new ServicoGerarBoleto(200.0, new ServicoTaxaMarAzul());

        servicoGerarBoleto.processarBoleto(aluguel);
    }
}
