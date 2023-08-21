package Entities;

public class Imovel {
    private Integer codigo;
    private String desc;

    public Imovel(){}

    public Imovel(Integer codigo, String desc){
        this.codigo = codigo;
        this.desc = desc;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
