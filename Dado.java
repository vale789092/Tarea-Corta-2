import java.util.Random;

public class Dado{
    public int caras = 0;
    private Random rnd = new Random();

    public Dado(int numCaras){
        caras = numCaras;
    }

    public int lanzar(){
        return rnd.nextInt(caras)+1;
    }
}