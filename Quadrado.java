import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Double numero = q.nextDouble();
        Double quadrado = numero*numero;
        System.out.println("O quadrado do número é: " + quadrado);

    }
}
