import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite o nome");
//        String nome = scanner.next();

//        System.out.println("Digite o CPF");
//        while (!scanner.hasNextLong()) {
//            System.out.println("Entrada inválida. Digite um número inteiro para o CPF.");
//            scanner.next();
//        }
//        long numero = scanner.nextLong();

//        System.out.println("Digite o Telefone");
//        while (!scanner.hasNextInt()) {
//            System.out.println("Entrada inválida. Digite um número inteiro para o telefone.");
//            scanner.next();
//        }
//        int tel = scanner.nextInt();

//        System.out.println("Digite sua data de nascimento");
//        while (!scanner.hasNextInt()) {
//            System.out.println("Entrada inválida. Digite um número inteiro para a data de nascimento.");
//            scanner.next();
//        }
//        int nascimento = scanner.nextInt();

//        System.out.println("Digite sua data de agendamento");
//        while (!scanner.hasNextInt()) {
//            System.out.println("Entrada inválida. Digite um número inteiro para a data de agendamento.");
//            scanner.next();
//        }
//        int agendamento = scanner.nextInt();

//        System.out.println("Digite o período");
//        String periodo = scanner.next();

        Pessoa pessoa = new Pessoa("nome", 12, 12, 12, 12, "12");
        Pessoa pessoa2 = new Pessoa("nome", 12, 12, 12, 12, "12");
        Pessoa pessoa3 = new Pessoa("nome", 12, 12, 12, 12, "12");
        lista.add(String.valueOf(pessoa));
        lista.add(String.valueOf(pessoa2));
        lista.add(String.valueOf(pessoa3));
        System.out.println(lista);

    }
}