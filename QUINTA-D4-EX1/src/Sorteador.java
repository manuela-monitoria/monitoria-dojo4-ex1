import java.util.ArrayList;
import java.util.Random;

public class Sorteador {
    Random gerador = new Random();
    private Sacola sacola;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Integer> numSorteados;
    public Sorteador(){
        this.jogadores = new ArrayList<>();
        this.numSorteados = new ArrayList<>();
        this.sacola = new Sacola();
    }

    public void pegarBola(){
        int bolaSorteada = sacola.sortearBola();
        numSorteados.add(bolaSorteada);
        System.out.println("Bola sorteada: " + bolaSorteada);
    }

    public int sortearBola(){
        ArrayList<Integer> sacolaTemp = sacola.getNumeros();
        int posicaoSacola = gerador.nextInt(sacolaTemp.size());
        sacola.removerBolas(posicaoSacola);
        return posicaoSacola;
    }


    public Sacola getSacola() {
        return sacola;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public ArrayList<Integer> getNumSorteados() {
        return numSorteados;
    }
}
