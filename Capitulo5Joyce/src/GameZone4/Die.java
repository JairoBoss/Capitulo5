package GameZone4;

public class Die {
    private Integer valor;

    public Die() {
        this.lanzar();
    }

    public void lanzar(){
        this.valor = (int)(Math.random() * 6 + 1);
    }

    public Integer getvalor() {
        return valor;
    }

    public void setvalor(Integer valor) {
        this.valor = valor;
    }


}
