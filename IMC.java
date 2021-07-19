import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Digite o peso em quilogramas: ");
        Double peso = s1.nextDouble();
        Scanner s2= new Scanner(System.in);
        System.out.println("Digite a altura em metros: ");
        Double altura = s2.nextDouble();
        Double imc = peso / (altura*altura);

        System.out.println("O imc é de :" + imc);


    }
}









