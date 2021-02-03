package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercice4 {

    /**
     * Exercice 4
     * *
     * Ecrire un programme qui demande de taper un numéro de mois et affiche le nom du mois ('janvier' pour 1,
     * 'février' pour 2.... Le programme affichera sur le flot de sortie un message d’erreur si le nombre donné ne
     * correspond pas à un mois.
     */
    public static void main(String[] args) {

        /** **********************************************************
         * Solution moche
         */

        // Le nombre du mois
        int nombreMois;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le nombre du mois : ");
        nombreMois = scanner.nextInt();

        if (nombreMois == 1) {
            System.out.println("Janvier !");
        } else if (nombreMois == 2) {
            System.out.println("Février !");
        } else if (nombreMois == 3) {
            System.out.println("Mars !");
        } else if (nombreMois == 4) {
            System.out.println("Avril !");
        } else if (nombreMois == 5) {
            System.out.println("Mai !");
        } else if (nombreMois == 6) {
            System.out.println("Juin !");
        } else if (nombreMois == 7) {
            System.out.println("Juillet !");
        } else if (nombreMois == 8) {
            System.out.println("Aout !");
        } else if (nombreMois == 9) {
            System.out.println("Septembre !");
        } else if (nombreMois == 10) {
            System.out.println("Octobre !");
        } else if (nombreMois == 11) {
            System.out.println("Novembre !");
        } else if (nombreMois == 12) {
            System.out.println("Décembre !");
        } else {
            System.out.println("Hey, ça ne corresponds à aucun mois ça");
        }


        /** **********************************************************
         * Solution débutant
         */

        System.out.print("Veuillez saisir le nombre du mois : ");
        nombreMois = scanner.nextInt();

        // Le message correspondant au nombre du mois
        String message;

        switch (nombreMois) {
            case 1:
                message = "Janvier !";
                break;
            case 2:
                message = "Février !";
                break;
            case 3:
                message = "Mars !";
                break;
            case 4:
                message = "Avril !";
                break;
            case 5:
                message = "Mai !";
                break;
            case 6:
                message = "Juin !";
                break;
            case 7:
                message = "Juillet !";
                break;
            case 8:
                message = "Aout !";
                break;
            case 9:
                message = "Septembre !";
                break;
            case 10:
                message = "Octobre !";
                break;
            case 11:
                message = "Novembre !";
                break;
            case 12:
                message = "Décembre !";
                break;
            default:
                message = "Hey, ça ne corresponds à aucun mois ça";
                break;
        }

        System.out.println(message);

        /** **********************************************************
         * Solution propre (avancé)
         */

        Map<Integer, String> calendrier = new HashMap<Integer, String>() {{
            put(1, "Janvier");
            put(2, "Février");
            put(3, "Mars");
            put(4, "Avril");
            put(5, "Mai");
            put(6, "Juin");
            put(7, "Juillet");
            put(8, "Aout");
            put(9, "Septembre");
            put(10, "Octobre");
            put(11, "Novembre");
            put(12, "Décembre");
        }};

        System.out.print("Veuillez saisir le nombre du mois : ");
        nombreMois = scanner.nextInt();

        if (calendrier.containsKey(nombreMois)) {
            System.out.println(calendrier.get(nombreMois) + " !");
        } else {
            System.out.println("Hey, ça ne corresponds à aucun mois ça");
        }

    }

}
