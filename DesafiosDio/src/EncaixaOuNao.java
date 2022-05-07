/*
Desafio
Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa
para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica
a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e
B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor,
confome exemplo abaixo.
 */

import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String entrada = sc.nextLine();
            String[] entra = entrada.split(" ");
            String A = entra[0];
            String B = entra[1];
            if (A.equals(B))
                System.out.println("encaixa");
            else {
                int tamA = A.length();
                int tamB = B.length();
                int aux = tamA - tamB;
                if (aux <= 0)
                    System.out.println("nao encaixa");
                else {
                    A = A.substring(aux, tamA);

                    if (A.equals(B))
                        System.out.println("encaixa");
                    else
                        System.out.println("nao encaixa");
                }
            }
        }
        sc.close();
    }
}