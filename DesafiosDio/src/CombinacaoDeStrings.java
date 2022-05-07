/*
Desafio
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string,
em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de
casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de
caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombinacaoDeStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strResult = new StringBuilder();
        String[] strArray;
        String readLine;
        int minLength;

        // Número de casos de testes.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCases = Integer.parseInt(st.nextToken());

        for (int i = 0; i < testCases; i++) {
            readLine = br.readLine();
            strArray = readLine.split(" ");

            minLength = Math.min(strArray[0].length(), strArray[1].length());

            for (int j = 0; j < minLength; j++) {
                strResult.append(strArray[0], j, j + 1).append(strArray[1], j, j + 1);
            }

            if (strArray[0].length() != strArray[1].length()) {
                if (strArray[0].length() < strArray[1].length()) {
                    strResult.append(strArray[1].substring(minLength));
                } else {
                    strResult.append(strArray[0].substring(minLength));
                }
            }

            System.out.println(strResult);

            strResult.delete(0, strResult.length());
        }
    }
}