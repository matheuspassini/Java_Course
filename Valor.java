import java.util.Scanner;

public class Valor {
    public static void main(String[] args) {
        /*

        Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
        Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
        Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades,
        vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.
        Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você multiplica
        o subtotal pelo próprio percentual e divide tudo por 100.
        Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor total final e deverá ser apresentado no console.
        */
        System.out.print("Digite o valor do produto: ");
        Scanner p = new Scanner(System.in);
        Double valor = p.nextDouble();

        System.out.print("Digite o valor do quantidade do produto que deseja: ");
        Scanner q = new Scanner(System.in);
        Double quantidade = q.nextDouble();

        Double subtotal = valor * quantidade;

        if (quantidade > 10) {
            subtotal = 0.90 * subtotal;
            Double desconto = 0.10 * valor * quantidade;
            System.out.print("O total é de :" + subtotal + ", com R$" + desconto + " de desconto");
        } else {
            System.out.print("O total é de :" + subtotal);
        }

    }
}
