import io.bretty.console.table.Alignment;
import io.bretty.console.table.Table;

public class main
{
    public static void main(String[] args) {
        Cartela c = new Cartela();

        Table table = Table.of(data, Alignment.LEFT, 10); // 10-character wide for each column
        System.out.println(table); // NOTICE: table.toString() is called implicitly





    }
}
