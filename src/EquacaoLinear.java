import java.util.*;
public class EquacaoLinear {
    public static void main(String[] args) {
        
        int a, b, c, d, e, f;
        Scanner numerosDigitados = new Scanner(System.in);
        int x, y;

        System.out.println("Coloque os números para os seguintes coeficientes");

        System.out.println("a: ");
        a = numerosDigitados.nextInt();

        System.out.println("b: ");
        b = numerosDigitados.nextInt();

        System.out.println("c: ");
        c = numerosDigitados.nextInt();

        System.out.println("d: ");
        d = numerosDigitados.nextInt();

        System.out.println("e: ");
        e = numerosDigitados.nextInt();

        System.out.println("f: ");
        f = numerosDigitados.nextInt();

        int determinante = (a * c) - (b * d);

        if (determinante == 0){
            System.out.println("O sistema não possui solução única");
        }
        else {
            x = ((c * e) - (b * f)) / ((a * e) - (b * d));    //ou dividido pela var determinante, pois sao iguais
            y = ((a * f) - (c * d)) / ((a * e) - (b * d));
    
            System.out.println("O valor de x é: " + x);
            System.out.println("O valor de y é: " + y);
        }

    }
}
