import java.util.ArrayList;

public class Jogador
{
    private String nome;
    private int numeroDeCartelas;
    private ArrayList<Cartela> cartelas;

     public Jogador(String nome,int numeroCartelas)
     {
         this.nome= nome;
         this.numeroDeCartelas=numeroCartelas;
         this.cartelas = new ArrayList<>();


         for (int i = 0; i<= numeroCartelas; i++){

             this.cartelas.add(new Cartela());

         }
     }
     public void checaCartela(Integer numero){

         for (Cartela c:cartelas) {
             if(c.estaPresente(numero)){

             }
         }

     }

}
