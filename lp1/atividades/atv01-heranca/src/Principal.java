public class Principal {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente("gabriel", "rua 1", 30, 60, "secretaria 1", 1200);

        Empregado empregado = new Empregado("gabriel 2", "rua 2", 20, 60);

        System.out.println("GERENTE:");
        gerente.imprimirGerente();
        gerente.calcularSalarioGerente();
        
        System.out.println("");

        System.out.println("EMPREGADO:");
        empregado.imprimirEmpregado();
        empregado.imprimirSalario();
    }
}
