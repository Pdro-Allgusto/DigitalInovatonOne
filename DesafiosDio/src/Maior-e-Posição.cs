/*Desafio
Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/
// Abaixo segue um exemplo de código que você pode ou não utilizar
using System;

class TESTE
{

    static void Main(string[] args)
    {
        int n;
        int maior = 0;
        int posicao = 0;
        int cont = 0;
        for (int i = 1; i <= 100; i++)
        {
            cont++;
            n = Convert.ToInt32(Console.ReadLine());
            if (n > maior)
            {
                maior = n;
                posicao = cont;
            }
        }
        Console.WriteLine(maior);
        Console.WriteLine(posicao);
    }
}