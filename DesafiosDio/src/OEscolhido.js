/*
Desafio
As aulas do Prof. Xavier estão dando o que falar até no exterior, pois ele ensina Algorítmos de um 
jeito diferente aos seus alunos. Uma universidade dos EUA, que soube sobre o método do Prof. Xavier, 
quer selecionar um aluno para um intercâmbio no país. Para isso, ele possuem uma lista de inscrição 
com o número de cada aluno e sua nota. 

Para ajudá-los a encontrarem o melhor aluno que ganhará o intercâmbio, você deve desenvolver um programa.
 Só tem um detalhe, se a nota mais alta não for maior ou igual a 8, você deverá imprimir “Minimum note 
 not reached”.

Entrada
O arquivo contém primeiro a quantidade de alunos (3 <= n <= 100) existentes e em seguida, os n alunos 
contendo o número da matrícula (0 < m < 1000000) de cada um, seguido da respectiva nota 
(0 <= nota <= 10.0, com 1 casa decimal).

Obs.: as notas não serão repetidas. Ou seja, não tem chance de ter dois alunos com a mesma nota.

Saída
Você deve imprimir o número do estudante que obteve a maior pontuação ou "Minimum note not reached" 
(sem aspas) caso nenhum estudante tenha tirado uma nota maior ou igual a 8.
*/
let n = gets();
let matricula;
let notaMaior = 0;
for (let i = 0; i < n; i++) {
    line = gets();
    line = line.split(" ")
    if (parseFloat(line[1]) >= notaMaior) {
        matricula = line[0];
        notaMaior = parseFloat(line[1]);
    }

}
if (notaMaior >= 8) {
    print(matricula)
} else {
    print("Minimum note not reached");
}