import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int valorInicial, valorFinal, resultado;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois valores inteiros");
        valorInicial = input.nextInt( );
        valorFinal= input.nextInt( );
        try{
            resultado = valorInicial / valorFinal;
            System.out.println("Resultado = " + resultado);
        }
        catch (ArithmeticException Error){
            System.err.println("Caught Error: "+Error.getMessage());
        }
    }
}
