import java.util.ArrayList;
import java.util.Random;

public class Cartela {

    private int[][] numeros;
    private ArrayList<Integer> numerosMarcados;
    private Random gerador = new Random();

    public Cartela() {
    	ArrayList<Integer> numerosSorteados = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {  	
            	numeros[i][j] = geradorNumero(numerosSorteados);
            		
                // TODO: 02/02/2023 Tratar ganhadores de linha e coluna
                /// TODO: 02/02/2023 Tratar numeros repetidos
            }
        }

    }
    
    public int geradorNumero(ArrayList<Integer> numerosSorteados) {
    	int numeroGerador;

        do {
        	numeroGerador = gerador.nextInt(75) + 1;
        } while(numerosSorteados.contains(numeroGerador));
        	
        numerosSorteados.add(numeroGerador);
        return numeroGerador;
    }

    public boolean marcarNumero(int numero) throws Exception {

        if (verificarNumeroNaCartela(numero)) {
            numerosMarcados.add(numero);
            return true;
        }
        return false;
    }

    public boolean verificarNumeroNaCartela(int numero) {

        boolean existe = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numero == numeros[i][j]) {
                    existe = true;
                    break;
                }
            }
        }

        return existe;
    }

    public boolean verificarLinha() {
        boolean completou = false;
        int marcou = 0;
        int totalLinhas = 0;
        //TODO = verificar as linhas de todas as colunas
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numerosMarcados.contains(numeros[j][i])) {
                    marcou++;
                }
                if (marcou == 5) {
                    completou = true;
                    totalLinhas++;
                    marcou = 0;
                }
            }	
        }
        System.out.println("Completou " + totalLinhas + " linhas.");
        return completou;
    }

    public boolean verificarColuna() {
        boolean completa = false;
        int marcou = 0;
        int totalColunas = 0;
        //TODO = verificar as colunas de todas as linhas
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numerosMarcados.contains(numeros[i][j])) {
                    marcou++;
                }

                if (marcou == 5) {
                    completa = true;
                    totalColunas++;
                    marcou = 0;
                }
            }        	
        }
        System.out.println("Completou " + totalColunas + " colunas.");
        return completa;
    }
}
