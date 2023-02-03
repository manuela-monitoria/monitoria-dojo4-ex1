import java.util.ArrayList;
import java.util.Scanner;

public class CasaDeBingo
{
    private Sorteador sorteador;
    private ArrayList <Jogador> jogadores;
    public CasaDeBingo()
    {
        this.sorteador= new Sorteador();
        this.jogadores= new ArrayList<>();
    }
    public void registraJogadores()
    {
        Scanner teclado =new Scanner(System.in);
        int numeroDeJogadores;
        System.out.println("Informe o Numero de jogadores:");
        numeroDeJogadores=teclado.nextInt();

    }
}
