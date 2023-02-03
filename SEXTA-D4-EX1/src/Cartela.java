import java.util.ArrayList;
import java.util.Arrays;

public class Cartela {
    private String[][] numeros = new String[5][5];
    private ArrayList<Integer> marcados;

    public Cartela() {
        int linha = 0, coluna = 0;
        for (int i = 0; i < 25;) {
            int aleatorio = (int) (Math.random() * 75) + 1;
            if (estaPresente(aleatorio)) continue;
            i++;
            numeros[linha][coluna] = String.valueOf(aleatorio);
            coluna++;
            if (coluna == 5) { coluna = 0; linha++; }
        }
    }

    public boolean estaPresente(int n) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (String.valueOf(n).equals(numeros[i][j]))
                    return true;
        return false;
    }

}
