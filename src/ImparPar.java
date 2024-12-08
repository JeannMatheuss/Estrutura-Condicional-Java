import java.util.*;
public class ImparPar {
    public static void main(String[] args) {
        
        int numero;
        Scanner numeroDigitado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = numeroDigitado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        }
        else {
            System.out.println("O número digitado é impar.");
        }
    }
}