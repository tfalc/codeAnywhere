package Basicos;/*Desafio
        Elabore um programa que possuas as características abaixo:

        Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
        Imprima os quatro grupos numéricos, sendo um valor por linha.
        Entrada
        A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato
        XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

        Saída
        Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas,
        e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio.
        Confira o exemplo abaixo:

        | Exemplos de entrada | Exemplos de saída |
        |---------------------|-------------------|
        | 000.000.000-00      |               000 |
        | .                   |               000 |
        | .                   |               000 |
        | .                   |                00 |
        | 320.025.102-01      |               320 |
        | .                   |               025 |
        | .                   |               102 |
        | .                   |                01 |

*/

import java.util.Locale;
import java.util.Scanner;

public class cpf {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
        String cpf = sc.nextLine();
        //continue a solucao
        String[] cpfParte = cpf.split("\\.|\\-");
        for (int i = 0; i < cpfParte.length; i++) {
            System.out.printf("%s\n", cpfParte[i]);
        }
    }
}