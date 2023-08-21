public class Gerente extends Empregado {
    private String secretaria;
    private double bonus;

    public Gerente(){}

    public Gerente(String nome, String endereco, double valorHora, double horasTrabalhadas){
        super(nome, endereco, valorHora, horasTrabalhadas);
    }
    public Gerente(String nome, String endereco, double valorHora, double horasTrabalhadas, String secretaria, double bonus){
        super(nome, endereco, valorHora, horasTrabalhadas);
        this.secretaria = secretaria;
        this.bonus = bonus;
    }

    public String getSecretaria() {
        return secretaria;
    }
    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void imprimirGerente(){
        imprimirEmpregado();
        System.out.println("Secretaria: "+getSecretaria());
        System.out.println("Bonus: "+getBonus());
    }

    public void calcularSalarioGerente(){
        double salario = calculaSalario();
        salario += getBonus();
        System.out.println("Salario: "+salario);
    }
    
}
