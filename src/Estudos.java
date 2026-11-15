import java.util.Scanner;

public class Estudos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite suas anotações: ");
        String dados = scanner.nextLine();

        System.out.println("--- Dados recebidos--- ");
        System.out.println("Anotações:" + dados);

        scanner.close();
    }
}
