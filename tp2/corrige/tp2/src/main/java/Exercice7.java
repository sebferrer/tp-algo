package main.java;

import java.util.Scanner;

public class Exercice7 {

    /**
     * Exercice 7 (*) Ordinaux abrégés en anglais
     * *
     * Dans cet exercice, nous nous intéressons aux ordinaux abrégés, où le nombre est écrit en chiffres.
     * Les premiers sont « 1st », « 2nd », « 3rd », « 4th », etc. (abréviations de « first, second, third, fourth, ... »).
     * Pour déterminer le suffixe, on regarde le dernier chiffre du nombre : si c’est 1, on ajoute le suffixe est -st ; si
     * c’est 2, le suffixe est -nd ; si c’est 3, le suffixe est -rd ; sinon le suffixe est -th.
     * Il y a une exception : si l’avant-dernier chiffre du nombre est 1, le suffixe est toujours -th.
     * Ecrire un programme qui lit un nombre, et qui affiche l’ordinal anglais abrégé
     * *
     * Rappel : le dernier chiffre d'un nombre val vaut exactement val % 10
     */
    public static void main(String[] args) {

        int val;
        String suffixe = "th"; // On met le suffixe à "th" par défaut

        System.out.println("Saisir un nombre :");

        Scanner scanner = new Scanner(System.in);

        val = scanner.nextInt();

        // Si l'avant-dernier chiffre est un, je laisse la valeur par défaut.
        // Sinon, on gère les 4 autres cas.
        if ((val / 10) % 10 != 1) {
            switch (val % 10) {
                case 1:
                    suffixe = "st";
                    break;
                case 2:
                    suffixe = "nd";
                    break;
                case 3:
                    suffixe = "rd";
                    break;
                default:
                    break;
            }
        }

        System.out.println(val + suffixe);
    }
}
