import java.util.Scanner;

public class PrimeiroMetodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        vetores(cursos);

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = verificarPosicao(posicaoCursoEscolhido, cursos);

        if (!posicaoValida) {
            invalido();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        vetores(formasPagamento);

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        Boolean valida = verificarPosicao(posicaoFormaPagamentoEscolhida, formasPagamento);

        if (!posicaoValida) {
            invalido();
        }


        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }
    static void vetores(String[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }
    static void invalido() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }
    static Boolean verificarPosicao(Integer posicao, String[] vetor) {
        Boolean valida = posicao >= 0 && posicao < vetor.length;
        return valida;
    }
}