public class Tablero {
    public int Casillas = 0;
    public int pos;
    private Ficha[] fichas = new Ficha[4];

    public Tablero(int CasillasT){
        Casillas = CasillasT;
        fichas[0] = new Ficha("Rosado");
        fichas[1] = new Ficha("Morado");
        fichas[2] = new Ficha("Celeste");
        fichas[3] = new Ficha("Verde");
    }

    public void turno(){
        int indice = 0;
        System.out.println("El tablero tiene " + Casillas + " casillas\n");
            while(pos < Casillas){
                fichas[indice].avanzar();
                if(fichas[indice].posicion >= Casillas)
                {
                    System.out.println("\nSe acabo el juego, gano la ficha de color " + fichas[indice].color);
                    break;
                }
                else
                {
                    pos = fichas[indice].posicion;
                    if(indice == 3)
                        indice = 0;
                    else
                        indice = indice+1;
                    System.out.println("\nSigue la ficha " + fichas[indice].color);
                }
            }    
    }
}
