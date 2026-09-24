package org.example;

public class cenariosNotas {
    public static void main(String[] args){

    // 1- Crie variáveis para as notas de duas alunas.
    // Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
    //- a = 10, b = 3
    //- a1 = 3, b1 = 10
    //- a2 = 5, b2 = 5

        String aluna1 = "Ester";
        String aluna2 = "Anne";
        String aluna3 = "Gaby";
        String aluna4 = "Luana";
        String aluna5 = "Samanta";
        String aluna6 = "Bela";

        int a = 10;
        int b = 3;
        int a1 = 3;
        int b1 = 10;
        int a2 = 5;
        int b2 = 5;

    // 1º caso
        System.out.println("No curso de Inglês temos duas alunas: " + aluna1 + " e " + aluna2 + ". Podemos comparar as notas que ambas tiraram no último exame: \n");
        System.out.println("A primeira nota é " + a + " e a segunda nota é " + b);
        System.out.println("A primeira nota é maior do que a segunda? " + (a > b));
        System.out.println("A primeira nota é menor do que a segunda? " + (a < b));

        System.out.println("As Notas são iguais?  " + (a == b));
        System.out.println("As Notas são diferentes?  " + (a != b));

    // 2º caso
        System.out.println("\nJá no curso de Espanhol temos também duas alunas: " + aluna3 + " e " + aluna4 + ". Podemos também comparar as notas que elas tiraram no último exame: \n");
        System.out.println("A primeira nota é " + a1 + " e a segunda nota é " + b1);
        System.out.println("A primeira nota é maior do que a segunda? " + (a1 > b1));
        System.out.println("A primeira nota é menor do que a segunda? " + (a1 < b1));

        System.out.println("As Notas são iguais?  " + (a1 == b1));
        System.out.println("As Notas são diferentes?  " + (a1 != b1));

    // 3º caso
        System.out.println("\nPor fim, no curso de Francês temos duas alunas também: " + aluna5 + " e " + aluna6 + ". Podemos comparar suas notas no último exame: \n");
        System.out.println("A primeira nota é " + a2 + " e a segunda nota é " + b2);
        System.out.println("A primeira nota é maior do que a segunda? " + (a2 > b2));
        System.out.println("A primeira nota é menor do que a segunda? " + (a2 < b2));

        System.out.println("As Notas são iguais?  " + (a2 == b2));
        System.out.println("As Notas são diferentes?  " + (a2 != b2));

    }
}
