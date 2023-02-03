import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Jogador> jogadores = new ArrayList<>();
        Sacola sacola = new Sacola();
        Sorteador sorteador = new Sorteador();
        Jogador jogador1 = new Jogador("Manuela");
        jogadores.add(jogador1);
        jogador1.pegarCartela();
        
		int qtdGanhadores = 0;
    	do {

            int bola = sorteador.sortearBola(sacola);
            
            System.out.println(bola);
            
            for(Jogador jogador : jogadores) {
                if(jogador.completouCartela()) {
                	System.out.println("Jogador " + jogador.getNome() + " venceu.");
                	qtdGanhadores++;
                }
            }
            
    		
    	} while(qtdGanhadores == 0);
    	System.out.println("Partida chegou ao fim.");
    	
        

        
        
//        for (int i = 0; i<sacola.getNumeros().size();i++){
//            System.out.print(sacola.getNumeros().get(i)+ " ");
//        }
    }
}
