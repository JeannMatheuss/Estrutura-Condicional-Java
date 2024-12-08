import java.util.*;
public class LerImprimir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um caractere do usuário
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        // Verificar o tipo do caractere usando código ASCII
        if (caractere >= '0' && caractere <= '9') {
            System.out.println("É um dígito (0-9).");
        } else if (caractere >= 'A' && caractere <= 'Z') {
            System.out.println("É uma letra maiúscula (A-Z).");
        } else if (caractere >= 'a' && caractere <= 'z') {
            System.out.println("É uma letra minúscula (a-z).");
        } else if (caractere == ' ') {
            System.out.println("É um espaço.");
        } else {
            System.out.println("É outro símbolo.");
        }

        scanner.close();
    }
}
