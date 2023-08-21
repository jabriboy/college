package Program;

import java.util.Calendar;
import java.util.Date;
import Entities.Postagens;
import Entities.Comentarios;


public class Main {
    public static void main(String[] args) throws Exception {
        // Aluno: Gabriel Rocha
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 29);
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.MINUTE, 15);
        cal.set(Calendar.SECOND, 37);
        Date data1 = cal.getTime();

        Postagens postagen1 = new Postagens(data1, "bom dia", "Boa prova para todos", 12);

        Comentarios c1 = new Comentarios("vamos nos dar bem");
        Comentarios c2 = new Comentarios("Boa sorte para todos");

        postagen1.addComentarios(c1);
        postagen1.addComentarios(c2);

        System.out.println(postagen1.toString());
        postagen1.getComentarios();

        System.out.println("\n");

        cal.set(Calendar.DAY_OF_MONTH, 29);
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.HOUR, 8);
        cal.set(Calendar.MINUTE, 10);
        cal.set(Calendar.SECOND, 21);
        Date data2 = cal.getTime();

        Postagens postagen2 = new Postagens(data2, "viagem para paris", "eu estou adorando esse pais", 25);

        Comentarios c3 = new Comentarios("tenha uma boa viagem");
        Comentarios c4 = new Comentarios("uau, isso e incrivel");

        postagen2.addComentarios(c3);
        postagen2.addComentarios(c4);

        System.out.println(postagen2.toString());
        postagen2.getComentarios();
    }
}
