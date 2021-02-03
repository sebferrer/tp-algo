package main.java;

import java.util.Scanner;

public class Exercice6 {

    /**
     * Exercice 6 agence de voyage
     * *
     * Écrire un programme destiné à calculer le prix d'un voyage en fonction de ses participants et de la destination
     * (proche 'p', éloignée (e')). Le client renseigne le nombre de participants en précisant le nombre d'enfants et le
     * nombre d'adultes. Les tarifs sont établis selon le tableau suivant. Le tarif groupe s'applique à partir de 10
     * personnes et ne différencie pas les enfants des adultes. Le programme calcule le montant pour les 2 cas (tarif
     * groupe ou tarif individuel) et affiche le tarif le plus intéressant. Ne pas oublier de tester tous les cas :
     * préparer un tableau représentant tous les tests et leur résultat attendu avant de les effectuer.
     */
    public static void main(String[] args) {

        final int TARIF_ADULTE_INDIVIDUEL_PROCHE = 600;
        final int TARIF_ENFANT_INDIVIDUEL_PROCHE = 400;
        final int TARIF_ADULTE_INDIVIDUEL_ELOIGNE = 800;
        final int TARIF_ENFANT_INDIVIDUEL_ELOIGNE = 600;
        final int TARIF_GROUPE_PROCHE = 450;
        final int TARIF_GROUPE_ELOIGNE = 500;

        int nbAdultes;
        int nbEnfants;
        char destination; // Caractère, pour stocker 'p' ou 'e'

        int nbTotalVoyageurs;
        int tarifTotalIndividuel = 0;
        int tarifTotalGroupe = 0;
        int meilleurTarif = 0;
        // Valeur binaire. "VRAI" si le tarif de groupe a été appliqué, "FAUX" sinon.
        // On le met à "FAUX" par défaut, et on le passera à "VRAI" si besoin.
        boolean groupe = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue chez Air Glaciaire !");
        System.out.println("Avec combien d'adultes voyagez-vous ?");
        nbAdultes = scanner.nextInt();
        System.out.println("Avec combien d'enfants voyagez-vous ?");
        nbEnfants = scanner.nextInt();
        System.out.println("Votre destination est-elle proche ou éloignée ?" +
                "(saisir 'p' pour 'Proche', 'e' pour 'Eloignée");
        destination = scanner.next().charAt(0);

        System.out.println("Nombre d'adultes : " + nbAdultes);
        System.out.println("Nombre d'enfants : " + nbEnfants);
        System.out.println("Destination : " + destination);

        nbTotalVoyageurs = nbAdultes + nbEnfants;

        /**
         * Ecrire le code ici
         */

        if (groupe) {
            System.out.println("Le tarif de groupe a été appliqué");
            System.out.println("Tarif invidivuel:  " + tarifTotalIndividuel + "€");
            System.out.println("Tarif groupe:  " + tarifTotalGroupe + "€");
        } else {
            System.out.println("Le tarif individual a été appliqué");
            System.out.println("Tarif invidivuel:  " + tarifTotalIndividuel + "€");
        }

        System.out.println("Le meilleur tarif que nous pouvons vous proposer est de " + meilleurTarif + "€");
    }

    /*

    TIP : Total Individuel Proche
    TIE : Total Individuel Eloigne
    TGP : Total Groupe Provhe
    TGE : Total Groupe Eloigne

    Tableau explicatif d'un exemple, Destination proche à tarif individuel :
    ____________________________________________________________________________
   |  nbTotal | nbAdultes| nbEnfants| tarifTIP | tarifTIE | tarifTGP | tarifTGE |
   |----------|----------|----------|----------|----------|----------|----------|
   |          |          |          |          |          |          |          |
   |          |          |          |          |          |          |          |
   |    6     |    2     |    4     |   2800   |   4000   |          |          | nbTotal < 10 donc
   |          |          |          |          |          |          |          | c'esr le tarifTIP
   |          |          |          |          |          |          |          | qui apparaîtra
    ----------------------------------------------------------------------------

    Tableau explicatif d'un exemple, Destination proche à tarif de groupe :
    ____________________________________________________________________________
   |  nbTotal | nbAdultes| nbEnfants| tarifTIP | tarifTIE | tarifTGP | tarifTGE |
   |----------|----------|----------|----------|----------|----------|----------|
   |          |          |          |          |          |          |          | nbTotal >= 10 et
   |          |          |          |          |          |          |          | tarifTGP < tarifTIP
   |    10    |    4     |    6     |   4800   |   6800   |   4500   |   5000   | donc c'est
   |          |          |          |          |          |          |          | le tarifTGP
   |          |          |          |          |          |          |          | qui apparaîtra
    ----------------------------------------------------------------------------
    Si on avais eu tarifTIP < tarifTGP, c'est le tarifTIP qui serait apparu.

    Tableau explicatif d'un exemple, Destination éloignée à tarif individuel :
    ____________________________________________________________________________
   |  nbTotal | nbAdultes| nbEnfants| tarifTIP | tarifTIE | tarifTGP | tarifTGE |
   |----------|----------|----------|----------|----------|----------|----------|
   |          |          |          |          |          |          |          |
   |          |          |          |          |          |          |          |
   |    6     |    2     |    4     |   2800   |   4000   |          |          | nbTotal < 10 donc
   |          |          |          |          |          |          |          | c'est le tarifTIE
   |          |          |          |          |          |          |          | qui apparaîtra
    ----------------------------------------------------------------------------

    Tableau explicatif d'un exemple, Destination éloignée à tarif de groupe :
    ____________________________________________________________________________
   |  nbTotal | nbAdultes| nbEnfants| tarifTIP | tarifTIE | tarifTGP | tarifTGE |
   |----------|----------|----------|----------|----------|----------|----------|
   |          |          |          |          |          |          |          | nbTotal >= 10 et
   |          |          |          |          |          |          |          | tarifTGP < tarifTIP
   |    10    |    4     |    6     |   4800   |   6800   |   4500   |   5000   | donc c'est
   |          |          |          |          |          |          |          | le tarifTGE
   |          |          |          |          |          |          |          | qui apparaîtra
    ----------------------------------------------------------------------------
    Si on avais eu tarifTIP < tarifTGP, c'est le tarifTIP qui serait apparu.

*/

}
