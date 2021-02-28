package Ejercicio9;

public class Factura {
    private Integer noFactura;
    private Integer saldo;
    private Integer dia;
    private Integer mes;
    private Integer año;

    public Factura(Integer factura, Integer saldo, Integer dia, Integer mes, Integer año) {
        if (factura < 1000) {
            this.noFactura = 0;
        } else {
            this.noFactura = factura;
        }
        this.saldo = saldo;
        if(dia < 1 || dia > 31){
            this.dia = 0;
        }else{
            this.dia = dia;
        }
        if(mes < 1 || mes > 12){
            this.mes = 0;
        }else{
            this.mes = mes;
        }
        if(año < 2011 || año > 2017){
            this.año = 0;
        }else{
            this.año = año;
        }
    }

    public Integer getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(Integer noFactura) {
        this.noFactura = noFactura;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }
}
