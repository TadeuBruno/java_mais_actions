import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = scanner.next();
        System.out.println("Digite o CPF");
        long numero = scanner.nextInt();
        System.out.println("Digite o Telefone");
        int tel = scanner.nextInt();
        System.out.println("Digite sua data de nascimento");
        int nascimento = scanner.nextInt();
        System.out.println("Digite sua data de agendamento");
        int agendamento = scanner.nextInt();
        System.out.println("Digite o período");
        String periodo = scanner.next();
        Pessoa pessoa = new Pessoa(nome, numero, tel, nascimento, agendamento, periodo);
        lista.add(String.valueOf(pessoa));
        System.out.println("Você quer adicionar mais um colaborador?");
        String adicionar = scanner.next();
        if(adicionar.equals("s")){

            System.out.println("Digite o nome");
            String nome2 = scanner.next();
            System.out.println("Digite o CPF");
            long numero2 = scanner.nextInt();
            System.out.println("Digite o Telefone");
            int tel2 = scanner.nextInt();
            System.out.println("Digite sua data de nascimento");
            int nascimento2 = scanner.nextInt();
            System.out.println("Digite sua data de agendamento");
            int agendamento2 = scanner.nextInt();
            System.out.println("Digite o período");
            String periodo2 = scanner.next();
            Pessoa pessoa2 = new Pessoa(nome, numero, tel, nascimento, agendamento, periodo);
            lista.add(String.valueOf(pessoa));
            System.out.println(lista);
        }else if (adicionar.equals("n")){
            System.out.println(lista);
        }else{
            System.out.println("Opção Inválida");
        }
    }
}