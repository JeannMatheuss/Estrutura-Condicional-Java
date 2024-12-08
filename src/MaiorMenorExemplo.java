import java.util.*;
public class MaiorMenorExemplo {
    public static void main(String[] args) {
        
        int A, B, MAIOR, MENOR;
        Scanner entrada_dado =new Scanner (System.in);
        System.out.println("Digite dois números interios: ");
        A = entrada_dado.nextInt();
        B = entrada_dado.nextInt();

        if (A > B){
            MAIOR = A;
            MENOR = B;
        }
        else {
            MAIOR = B;
            MENOR = A;
        }

        System.out.println("\nNumeros lidos: " + A + " e " + B);
        System.out.println("Maior: " + MAIOR);
        System.out.println("Menor: " + MENOR);
    }
}
