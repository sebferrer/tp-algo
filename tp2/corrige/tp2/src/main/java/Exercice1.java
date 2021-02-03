package main.java;

import java.util.Scanner;

public class Exercice1 {

    /**
     * Exercice 1
     * *
     * Ecrire un programme qui lit deux valeurs réelles a et b puis qui affiche sur le flot de sortie la solution de
     * l'équation ax+b=0. On envisagera tous les cas particuliers.
     */
    public static void main(String[] args) {

        // Les variables doivent être de type réel
        // puisque le résultat sera un nombre réel, pas forcément un entier
        double a;
        double b;
        double x;

        System.out.println("Equation : ax + b = 0");

        // Objet permettant de stocker la saisie d'un utilisateur dans une variable
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir a : ");
        a = scanner.nextDouble();
        System.out.println("a = " + a);
        System.out.print("Veuillez saisir b : ");
        b = scanner.nextDouble();
        System.out.println("b = " + b);

        if (a == 0) {
            // On ne peut pas diviser par 0
            System.out.println("Il n'y a pas de solution pour cette équation");
        } else {
            x = -b / a;
            // On affiche le résultat de l'équation
            System.out.println(a + "x" + " + " + b + " = 0");
            System.out.println("x = " + x);
        }

    }

}
