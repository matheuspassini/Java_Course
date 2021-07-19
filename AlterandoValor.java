import java.util.Scanner;

public class AlterandoValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valor = scanner.nextDouble();

        System.out.print("Digite o tipo de pagamento (1 - à vista / 2- à prazo): ");
        Integer tipo = scanner.nextInt();

        Double juros = 0.0;
        Boolean pagamentoVista = tipo.equals(1);
        if(!pagamentoVista) {
            juros = 10.0;
        }

        Double acrescimo = valor * juros / 100;
        Double total = acrescimo + valor;
        System.out.println(total);
        scanner.close();

    }

}
