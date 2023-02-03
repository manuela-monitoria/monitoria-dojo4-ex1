import java.util.ArrayList;
import java.util.Collections;

public class Sacola {
    private ArrayList<Integer> numeros;
    final int maximo = 75;

    public Sacola() {
        this.numeros = new ArrayList<>();

        for(int i = 1; i<=75;i++){
            this.numeros.add(i);
        }
    }

    public int sortearBola(){
        int bola;
        Collections.shuffle(numeros);
        bola = numeros.remove(0);
        return bola;
    }
    public ArrayList<Integer> getNumeros() {
        return numeros;
    }


    /*public void removerBolas(int posicao){
        this.numeros.remove(posicao);
    }*/

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }


    public int getMaximo() {
        return maximo;
    }

}
