/*
Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares
Depois os Ímpares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão,
cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenandoNumerosParesEImpares {
    public static void main(String[] args) {
        int entrada, num;
        Scanner leitor = new Scanner(System.in);
        entrada = leitor.nextInt();
        ArrayList<Integer> pares = new ArrayList();
        ArrayList<Integer> impares = new ArrayList();
        for (int i = 0; i < entrada; i++) {
            num = leitor.nextInt();
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
        Collections.sort(pares);
        pares.forEach(item -> System.out.println(item));
        Collections.sort(impares, Collections.reverseOrder());
        impares.forEach(item -> System.out.println(item));
    }
}
