public class Ficha {
    public String color = "";
    public int posicion = 0;
    private Dado dado = new Dado(6);

    public Ficha(String Color){
        color = Color;
        posicion = 0;
    }

    public void avanzar(){
        int pasos = dado.lanzar();
        System.out.println("La ficha saco en el dado un " + pasos);
        posicion = posicion + pasos;
        System.out.println("La ficha color " + color + " avanza hasta la posicion " + posicion);
    }
}
