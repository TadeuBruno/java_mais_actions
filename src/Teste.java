import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Pessoa pessoa = new Pessoa("nome", 12, 12, 12, 12, "12");
        Pessoa pessoa2 = new Pessoa("nome", 12, 12, 12, 12, "12");
        Pessoa pessoa3 = new Pessoa("nome", 12, 12, 12, 12, "12");
        lista.add(String.valueOf(pessoa));
        lista.add(String.valueOf(pessoa2));
        lista.add(String.valueOf(pessoa3));
        System.out.println(lista);
    }
}
