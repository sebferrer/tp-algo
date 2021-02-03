package main.java;

import java.util.Scanner;

public class Exercice2 {

    /**
     * Exercice 2
     * *
     * Ecrire un programme qui calcule la moyenne de 3 valeurs et affiche le nombre de valeurs
     * supérieures à cette moyenne. Testez.
     */
    public static void main(String[] args) {

        // Les trois valeurs
        double val1;
        double val2;
        double val3;
        // La moyenne
        double moyenne = 0;
        // Nombre de valeurs supérieures à la moyenne
        int nbValsSup = 0;

        // Objet permettant de stocker la saisie d'un utilisateur dans une variable
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir la première valeur : ");
        val1 = scanner.nextDouble();

        /**
         * Ecrire le code ici
         */

        System.out.println("Moyenne = " + moyenne);
        System.out.println("Nombre de valeurs supérieures à cette moyenne : " + nbValsSup);

    }

}
