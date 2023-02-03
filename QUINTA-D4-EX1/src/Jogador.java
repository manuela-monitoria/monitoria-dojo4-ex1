import java.util.ArrayList;

public class Jogador {
    private String nome;

    private ArrayList<Cartela> cartelas;

    public Jogador(String nome){

        this.nome = nome;
        this.cartelas = new ArrayList<>();
    }

    public String getNome() {
    	return this.nome;
    }
    
    public void pegarCartela() throws Exception {

        if (cartelas.size() > 3)
            throw new Exception("Numero maximo de cartelas atingido");

        cartelas.add(new Cartela());
    }

    public void marcarNumeros(int numero) throws Exception {

        for (Cartela cartela: this.cartelas) {
            cartela.marcarNumero(numero);
        }
    }

    public void linhasCompletas() {
        for(Cartela cartela : cartelas) {
            cartela.verificarLinha();
            if(cartela.verificarLinha()) {
                System.out.println("Jogador " + this.nome + "completou uma linha na cartela");
            }
        }
    }

    public void colunasCompleta() {
        for(Cartela cartela : cartelas) {
            cartela.verificarColuna();
            if(cartela.verificarColuna()) {
                System.out.println("Jogador " + this.nome + "completou uma coluna na cartela");
            }
        }
    }
    
    public boolean completouCartela() {
    	boolean incompleta = false;
    	for(Cartela cartela: cartelas) {
    		for(int i = 0; i < 5; i++) {
    			if(!cartela.verificarLinha()) {
    				incompleta = true;
    				break;  				
    			}
    		}
    	}
    	
    	if(incompleta == true) {
    		return false;
    	} else {
    		return true;
    	}
    	
    }
}
