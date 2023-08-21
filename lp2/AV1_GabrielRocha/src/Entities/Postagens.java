package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Postagens {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;

    private ArrayList<Comentarios> comentarios = new ArrayList<>();

    public Postagens(){}

    public Postagens(Date momento, String titulo, String conteudo, Integer curtidas){
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public void addComentarios(Comentarios comentario){
        comentarios.add(comentario);
    }

    public void removeComentarios(Comentarios comentario){
        comentarios.remove(comentario);
    }

    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public Integer getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public String toString(){
        return ""+this.titulo+
        "\n"+this.curtidas+" curtidas - "+sdf.format(this.momento)+
        "\n"+this.conteudo+
        "\nComentarios:";
    }

    public void getComentarios(){
        comentarios.forEach(c -> System.out.println(c.toString()));
    }
}
