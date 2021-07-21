import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        saida(" --------- CALCULADORA ---------");
        saida("\n 1 - Adição \n 2 - Subtração \n 3 - Divisão \n 4 - Multiplicação" );
        saida("\n Digite sua opção que você deseja calcular: ");

        Integer opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                saida("Você escolheu a opção número 1 \n");
                Double pnumeroAdicao = numeros(scanner);
                Double snumeroAdicao = numeros(scanner);
                Double resultadoAdicao = adicao(pnumeroAdicao,snumeroAdicao);
                saida("O resultado é: " + resultadoAdicao);
                break;

            case 2:
                saida("Você escolheu a opção número 2 \n");
                 Double pnumeroSubtracao = numeros(scanner);
                 Double snumeroSubtracao = numeros(scanner);
                 Double resultadoSubtracao = subtracao(pnumeroSubtracao, snumeroSubtracao);
                 saida("O resultado é: " + resultadoSubtracao);
                 break;

            case 3:
                saida("Você escolheu a opção número 3 \n");
                Double pnumeroMultiplicacao = numeros(scanner);
                Double snumeroMultiplicacao = numeros(scanner);
                Double resultadoMultiplicacao = multiplicacao(pnumeroMultiplicacao, snumeroMultiplicacao);
                saida("O resultado é: " + resultadoMultiplicacao);
                break;

            case 4:
                saida("Você escolheu a opção número 4 \n");
                Double pnumeroDivisao = numeros(scanner);
                Double snumeroDivisao = numeros(scanner);
                Double resultadoDivisao = divisao(pnumeroDivisao, snumeroDivisao);
                saida("O resultado é: " + resultadoDivisao);
                break;

            default:
                System.err.println("Opção inválida");
                System.exit(1);
            }


    }
    static void saida(String texto) {
        System.out.print(texto);
    }

    static Double numeros(Scanner scanner) {
        System.out.print("Informe o número: ");
        return scanner.nextDouble();
    }
    static Double adicao(Double pnumero, Double snumero) {
       return pnumero + snumero;
    }
    static Double subtracao(Double pnumero, Double snumero) {
       return pnumero - snumero;
    }
    static Double multiplicacao(Double pnumero, Double snumero) {
       return pnumero * snumero;
    }
     static Double divisao(Double pnumero, Double snumero) {
        return pnumero + snumero;
     }

}
