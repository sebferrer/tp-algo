package main.java;

import java.util.Scanner;

public class Exercice5 {

    /**
     * Exercice 5
     * Comprendre un code, l'indenter, le tester.
     * *
     * Que fait le programme suivant ?
     * A quelle condition l'instruction d'affichage de la chaîne "Racines complexes" s'exécutet-elle ?
     * *
     * Indentez le programme de façon habituelle pour que l'identification des blocs des conditionnels soit
     * possible à l'oeil nu. Effectuez les tests nécessaires.
     */
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double racine1;
        double racine2;
        double delta;

        System.out.println("Saisir 3 nombres réels :");

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a != 0) {  // l'equation n'est pas dégénérée
            delta = b * b - 4 * a * c;
            if (delta > 0) {
                racine1 = (-b + Math.sqrt(delta)) / 2 * a; // Math.sqrt renvoie la racine carrée d'un nombre
                racine2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("racine1 = " + racine1);
                System.out.println("racine2 = " + racine2);
            } else {
                if (delta == 0) {
                    System.out.println("Racine double : " + (-b / (2 * a)));
                } else {
                    System.out.println("Racines complexes");
                }
            }
        } else if (b != 0) {
            System.out.println("Une seule racine : " + (-c / b));
        } else if (c == 0) {
            System.out.println("Equation dégénérée");
        } else {
            System.out.println("Zero solution");
        }

    }

    /**
     * Ce programme calcule les racines d'un polynôme de second degré, quand c'est possible.
     *
     * On a déjà déterminé les cas de figures où delta est supérieur à 0 (2 racines),
     * et le cas où delta est nul (1 racine).
     * Donc le "else" signifie "tous les autres cas possibles",
     * c'est-à-dire quand delta est négatif, donc quand le résultat est complexe,
     * d'où l'affichage "résultat complexe"
     */

}
