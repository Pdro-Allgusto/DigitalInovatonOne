/*
Desafio
Ramsay: "(...) você vence se conseguir adivinhar quem eu sou e por que estou torturando você."

Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá
fazer depois que Theon der sua resposta.

Theon pode dizer que seu algoz é alguma dentre N pessoas. Considere que as pessoas são numeradas de 1 a N.
Se Theon responder que seu algoz é a pessoa i, Ramsay irá atingi-lo Ti vezes.

Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a minimizar o número de vezes que
ele será atingido.

Entrada
A primeira linha contém um inteiro N (1 ≤ N ≤ 100). A segunda linha contém N inteiros T1, T2, ...,
TN (0 ≤ Ti ≤ 20).

Saída
Imprima uma linha contendo o número da pessoa que Theon deve dizer ser seu algoz.
Se existe mais de uma resposta possível, imprima a menor.
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ARespostaDeTheon {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // numeros de casos ( pessoas )
        int N = leitor.nextInt();
        Integer[] array =new Integer[N];
        // recebendo o valr de cada pessoa
        for (int i =0 ; i < N ; i++) {
            array[i] = leitor.nextInt();
        }
        // qual menor valor entre os informados
        int posMenor =  Collections.min(Arrays.asList(array));
        // qual pessoa é 1ª, 2ª , etc
        int getIndex = Arrays.asList(array).indexOf(posMenor);
        System.out.println(getIndex+1);
    }

}
