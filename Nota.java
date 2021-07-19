import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        Double nota = s.nextDouble();
        

        if (nota >= 70) {
            System.out.println(" Passou de semestre! ");
        } else {
            System.out.println("Não passou de semestre");
        }


    }
}
