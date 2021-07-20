import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        Integer dia = scanner.nextInt();
        String semana = "";

        switch (dia){
            case 1: semana = "Segunda-feira";
                break;
            case 2: semana = "Terça-feira";
                break;
            case 3: semana = "Quarta-feira";
                break;
            case 4: semana = "Quinta-feira";
                break;
            case 5: semana = "Sexta-feira";
                break;
            case 6: semana = "Sábado";
                break;
            case 7 : semana = "Domingo";
                break;
            default:
                System.err.println("Digite mês válido");
        }
        System.out.println("O dia selecionado foi: " + semana);
    }
}
