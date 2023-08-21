public class Empregado {
    private String nome;
    private String endereco;
    private double valorHora;
    private double horasTrabalhadas;

    public Empregado(){}

    public Empregado(String nome, String endereco, double valorHora, double horasTrabalhadas){
        this.nome = nome;
        this.endereco = endereco;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void imprimirEmpregado(){
        System.out.println("Nome: "+getNome());
        System.out.println("Endereco: "+getEndereco());
        System.out.println("Valor hora: "+getValorHora());
        System.out.println("Horas trabalhadas: "+getHorasTrabalhadas());

    }

    public double calculaSalario(){
        double salario;
        salario = getHorasTrabalhadas() * getValorHora();
        return salario;
    }

    public void imprimirSalario(){
        System.out.println("Salario: R$"+calculaSalario());
    }
}
