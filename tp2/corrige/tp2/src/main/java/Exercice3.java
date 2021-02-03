package main.java;

import java.util.Scanner;

public class Exercice3 {

    /**
     * Exercice 3
     * *
     * Ecrire un programme qui lit trois nombres et affiche le plus grand. Tester. Ajouter ensuite les instructions
     * pour afficher également le plus petit. Choisissez bien vos conditions. Testez.
     */
    public static void main(String[] args) {

        // Les trois valeurs
        double val1;
        double val2;
        double val3;
        // La plus grande valeur
        double valMax;
        // La plus petite valeur
        double valMin;

        // Objet permettant de stocker la saisie d'un utilisateur dans une variable
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir la première valeur : ");
        val1 = scanner.nextDouble();
        System.out.print("Veuillez saisir la deuxième valeur : ");
        val2 = scanner.nextDouble();
        System.out.print("Veuillez saisir la troisième valeur : ");
        val3 = scanner.nextDouble();

        // Calcul de la plus grande valeur

        valMax = val1;
        if (val2 > valMax) {
            valMax = val2;
        }
        if (val3 > valMax) {
            valMax = val3;
        }

        System.out.println("La plus grande valeur est " + valMax);

        // Calcul de la plus petite valeur

        valMin = val1;
        if (val2 < valMin) {
            valMin = val2;
        }
        if (val3 < valMin) {
            valMin = val3;
        }

        System.out.println("La plus petite valeur est " + valMin);

    }

}
