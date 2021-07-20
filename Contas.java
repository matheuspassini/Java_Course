/* Faça um programa que receba:

    O valor da conta de luz
    Conta de água
    Conta de telefone
    Escola do filho
    Fatura do cartão
    Gastos com supermercado

... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=". */

import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double total = 0.0;

        System.out.print("Digite o valor da conta de luz: R$");
        total+= scanner.nextDouble();

        System.out.print("Digite o valor da conta de água: R$");
        total+= scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: R$");
        total+= scanner.nextDouble();

        System.out.print("Digite o valor da mensalidade da escola: R$");
        total+= scanner.nextDouble();

        System.out.print("Digite o valor da conta do cartão de crédito: R$");
        total+= scanner.nextDouble();

        System.out.print("Digite o valor da conta de supermercado: R$");
        total+= scanner.nextDouble();

        System.out.println("O valor total da conta é de: R$" + total);






    }
}
