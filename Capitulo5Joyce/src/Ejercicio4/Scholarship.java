package Ejercicio4;
import java.util.Scanner;
public class Scholarship {

    private Double promedio;
    private Integer actExtracurriculares;
    private Integer nActServicio;
    private static final String mensaje = "Candidato a beca";

    public Scholarship(double x, int y, int z){
        this.promedio = x;
        this.actExtracurriculares = y;
        this.nActServicio = z;
    }

    public String beca(){
        if ((this.promedio >= 3.8) && (this.actExtracurriculares >= 1) && (this.nActServicio >= 1)){
            return mensaje;
        }
        if ((this.promedio >= 3.4) && (this.actExtracurriculares >= 3) && (this.nActServicio >= 3)) {
            return mensaje;
        }
        if ((this.promedio < 3.4 && this.promedio >= 3.0) && (this.actExtracurriculares >= 2) && (this.nActServicio >= 3)){
            return mensaje;
        }if (this.promedio < 0 && this.promedio > 4.0){
            return "Ingresa un promedio valido";
        }else{
            return "No es candidato";
        }
    }





}
