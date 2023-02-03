import java.util.ArrayList;
import java.util.Collections;

public class Sacola {
    private ArrayList<Integer> numerosAsortear;
    private ArrayList<Integer> numerosSorteados;

    public Sacola(){
        this.numerosAsortear = new ArrayList<>();
        this.numerosSorteados = new ArrayList<>();
        preencherNumeros();
    }

    public boolean preencherNumeros(){
        for(int i = 1; i <= 75; i++){
            numerosAsortear.add(i);
        }
        Collections.shuffle(numerosAsortear);

        return true;
    }

    public Integer sortearNumero(){
        if(numerosAsortear.size() == 0){
            return null;
        }
        Integer numero = numerosAsortear.remove(0);
        numerosSorteados.add(numero);

        return numero;
    }

    public ArrayList getSorteados(){
        return numerosSorteados;
    }

}
