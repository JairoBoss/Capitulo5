package Ejercicio8;

public class TestPArk {
    public static void main(String[] args) {
        Park a = new Park("A",200,true,true,false,false);
        System.out.println(a.getNombre());
        System.out.println(a.getUbicacion());
        System.out.println(a.getPicnic());
        System.out.println(a.getTennis());
        System.out.println(a.getPatio());
        System.out.println(a.getPiscina());
    }
}
