package Ejercicio8;

public class Park {
    private String nombre;
    private Integer ubicacion;
    private Boolean picnic;
    private Boolean tennis;
    private Boolean patio;
    private Boolean piscina;

    public Park(String nombre, Integer ubicacion, Boolean picnic, Boolean tennis, Boolean patio, Boolean piscina) {
        this.nombre = nombre;
        if (ubicacion > 400 || ubicacion < 0){
            System.out.println("Valor no valido");
            this.ubicacion = 0;
        }else{
            this.ubicacion = ubicacion;
        }
        this.picnic = picnic;
        this.tennis = tennis;
        this.patio = patio;
        this.piscina = piscina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getPicnic() {
        return picnic;
    }

    public void setPicnic(Boolean picnic) {
        this.picnic = picnic;
    }

    public Boolean getTennis() {
        return tennis;
    }

    public void setTennis(Boolean tennis) {
        this.tennis = tennis;
    }

    public Boolean getPatio() {
        return patio;
    }

    public void setPatio(Boolean patio) {
        this.patio = patio;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }
}
