public class App2 {
    
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[2];
        try{
            vetor[2] = 1;

        }
        catch (ArrayIndexOutOfBoundsException Error){
            System.err.println("Caught Error: "+Error.getMessage());
        }
    }
}
