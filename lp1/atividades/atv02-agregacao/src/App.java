public class App {
    public static void main(String[] args) throws Exception {
        Jogador jog1 = new Jogador(21, "Gabriel", "MEI");
        Jogador jog2 = new Jogador(22, "Joao", "ZAG");
        Jogador jog3 = new Jogador(19, "Paulo", "ATA");
        Jogador jog4 = new Jogador(20, "Miguel", "PE");
        Jogador jog5 = new Jogador(20, "Marcelo", "PD");

        Time time1 = new Time();
        time1.setNometime("Salvador FC");
        time1.contrataJogador(jog1);
        time1.contrataJogador(jog2);
        time1.contrataJogador(jog3);
        time1.contrataJogador(jog4);
        time1.contrataJogador(jog5);

        System.out.println(time1.getTotalJogadores());
    }
}
