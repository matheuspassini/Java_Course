import java.util.Scanner;

public class CalcularValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor do produto: ");
        Double valor = scanner.nextDouble();

        System.out.print("Digite valor do passado pelo cliente: ");
        Double valorPassado = scanner.nextDouble();

        Double resultado = valorPassado - valor;

        System.out.println("Valor Diferença: " + resultado);
    }
}
