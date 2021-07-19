public class Logico {
    public static void main(String[] args) {
        /*Boolean verdadeiro = true;
        System.out.println("VAriável verdadeira: " + verdadeiro);
        Boolean falso = false;
        System.out.println("VAriável falsa: " + falso);*/

        Integer idade = 18;
        Boolean CNH = idade >= 18;
        if (CNH) {
            System.out.println("Permitido CNH? " + " Sim, pode!");
        } else {
            System.out.println("Pode tirar CNH? Não pode tirar carteira");
        }


    }
}
