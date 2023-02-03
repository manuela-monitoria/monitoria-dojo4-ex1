import java.util.ArrayList;

public class Sorteador {
    private Sacola sacola;

    public Sorteador()
    {
        this.sacola = new Sacola();
    }
    public Integer sortear()
    {
        return sacola.sortearNumero();
    }
    public ArrayList sorteados()
    {
        return sacola.getSorteados();
    }

}
