import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.MIN_VALUE;


public class Main {
    // ex1
    public static String bonjour() {
        String prenom = Outils.demande("Veuillez renseigner un prénom :");
        return "Bienvenue " + prenom;
    }

    //ex2
    public static int addition() {
        int nb1 = Outils.demandeInt("Veuillez renseigner un premier nombre : ");
        int nb2 = Outils.demandeInt("Veuillez renseigner un deuxième nombre : ");
        int addition = nb1 + nb2;
        return addition;
    }

    //ex3
    public static String profitOuPerte() {
        double pxFabrication = Outils.demandeInt("Veuillez renseigner le prix de fabrication : ");
        double pxVente = Outils.demandeInt("Veuillez renseigner le prix de vente : ");
        if (pxFabrication > pxVente) {
            double resultat = pxFabrication - pxVente;
            return "Perte de " + resultat;
        } else {
            double resultat = pxVente - pxFabrication;
            return "Profit de " + resultat;
        }
    }

    //ex4
    public static String trouverLePlusGrand() {
        int nb1 = Outils.demandeInt("Veuillez renseigner un premier nombre : ");
        int nb2 = Outils.demandeInt("Veuillez renseigner un deuxième nombre : ");
        int nb3 = Outils.demandeInt("Veuillez renseigner un troisième nombre : ");
        if (nb1 > nb2) {
            if (nb1 > nb3) {
                return "[" + nb1 + ", " + nb2 + ", " + nb3 + "] --> " + nb1;
            } else {
                return "[" + nb1 + ", " + nb2 + ", " + nb3 + "] --> " + nb3;
            }
        } else {
            if (nb2 > nb3) {
                return "[" + nb1 + ", " + nb2 + ", " + nb3 + "] --> " + nb2;
            } else {
                return "[" + nb1 + ", " + nb2 + ", " + nb3 + "] --> " + nb3;
            }
        }
    }

    //ex5
    public static String prof() {
        int nouvelleNote = 0;
        String appreciation = "";
        ArrayList<Integer> notes = new ArrayList<>();
        while (nouvelleNote != 99) {
            nouvelleNote = Outils.demandeInt("Veuillez renseigner une note comprise entre 0 et 20 " +
                    "(renseignez \"99\" quand vous n'avez plus de notes à renseigner) : ");
            notes.add(nouvelleNote);
        }
        for (int note = 0; note < notes.size(); note++) {
            if (notes.get(note) < 0 || notes.get(note) > 20 && notes.get(note) != 99) {
                appreciation += "Il y a une erreur de saisie pour cette note.";
            } else if (notes.get(note) < 5) {
                appreciation += notes.get(note) + " --> \"Catastrophique, il faut tout revoir\" \n";
            } else if (notes.get(note) < 11) {
                appreciation += notes.get(note) + " --> \"Insuffisant\" \n";
            } else if (notes.get(note) < 15) {
                appreciation += notes.get(note) + " --> \"Peut mieux faire\" \n";
            } else if (notes.get(note) < 18) {
                appreciation += notes.get(note) + " --> \"Bien\" \n";
            } else if (notes.get(note) < 20) {
                appreciation += notes.get(note) + " --> \"Excellent, bon travail\" \n";
            } else {
                appreciation += "";
            }
        }
        return Outils.afficher(appreciation);
    }

    //ex6
    public static String calculatrice() {
        double nb1 = Outils.demandeInt("Veuillez renseigner un premier nombre : ");
        String operateur = Outils.demande("Veuillez renseigner un opérateur parmis +,-,*,/ : ");
        double nb2 = Outils.demandeInt("Veuillez renseigner un deuxième nombre : ");
        if (operateur.equals("+")) {
            double addition = nb1 + nb2;
            return Outils.afficher(nb1 + " + " + nb2 + " = " + addition);
        } else if (operateur.equals("-")) {
            double soustraction = nb1 - nb2;
            return Outils.afficher(nb1 + " - " + nb2 + " = " + soustraction);
        } else if (operateur.equals("*")) {
            double multiplication = nb1 * nb2;
            return Outils.afficher(nb1 + " * " + nb2 + " = " + multiplication);
        } else if (operateur.equals("/")) {
            double division = nb1 / nb2;
            return Outils.afficher(nb1 + " / " + nb2 + " = " + division);
        } else {
            return Outils.afficher("Il y a une erreur de saisie au niveau de l'opérateur.");
        }
    }

    //ex7
    public static String somme() {
        StringBuilder affichage = new StringBuilder();
        int somme = 0;
        int nb = Outils.demandeInt("Veuillez renseigner un nombre : ");
        for (int i = 1; i < nb; i++) {
            somme += i;
            affichage.append(i);
            if (i != nb - 1) {
                affichage.append("+");
            }
        }
        return Outils.afficher(affichage + " = " + somme);
    }

    //ex8
    public static String escalier() {
        StringBuilder affichage = new StringBuilder();
        int nb = Outils.demandeInt("Veuillez renseigner un nombre : ");
        for (int i = 0; i < nb; i++) {
            for (int j = 0; j < i + 1; j++) {
                affichage.append("*");
            }
            affichage.append("\n");
        }
        return Outils.afficher(affichage + "");
    }

    //ex9
    public static String pyramide() {
        StringBuilder affichage = new StringBuilder();
        int nb = Outils.demandeInt("Veuillez renseigner un nombre : ");
        for (int i = 0; i < nb; i++) {
            for (int j = 0; j <= i; j++) {
                affichage.append("*");
            }
            affichage.append("\n");
        }
        for (int i = nb - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                affichage.append("*");
            }
            affichage.append("\n");
        }
        return Outils.afficher(affichage + "");
    }

    //ex10
    public static String vraiPyramide() {
        StringBuilder affichage = new StringBuilder();
        int j = 0;
        int nb = Outils.demandeInt("Veuillez renseigner un nombre : ");
        for (int i = 0; i <= nb; i++, j = 0) {
            StringBuilder espaces = new StringBuilder();
            for (int k = 0; k <= nb - i; k++) {
                espaces.append(" ");
            }
            affichage.append(espaces);
            while (j != 2 * i - 1) {
                //(int j = 0; j <= i; j++) {
                affichage.append("*");
                j++;
            }
            affichage.append("\n");
        }
        return Outils.afficher(affichage + "");
    }

    //ex11
    public static String monnaieEuro() {
        StringBuilder affichage = new StringBuilder();
        double nb = Outils.demandeDouble("Veuillez renseigner un montant en euros : ");
        piece_billet(nb, affichage);
        return Outils.afficher(affichage + "");
    }

    public static int enlever_unite(int montant_100, int unite_100, String billet_ou_piece0, StringBuilder affichage) {
        int nb_unite = montant_100 / unite_100;
        if (nb_unite > 0) {
            if (unite_100 < 100) {
                double tmp = unite_100 / 100.0;
                affichage.append("Pièce " + tmp + "€ : " + nb_unite + "\n");
            } else {
                int tmp = unite_100 / 100;
                affichage.append(billet_ou_piece0 + " " + tmp + "€ : " + nb_unite + "\n");
            }
        }
        return montant_100 % unite_100;
    }

    public static String piece_billet(double montant, StringBuilder affichage) {

        int montant_100 = (int) (montant * 100);

        List<Integer> list = Arrays.asList(50000, 20000, 10000, 5000, 2000, 1000, 500);

        for (int i : list) {
            montant_100 = enlever_unite(montant_100, i, "Billet", affichage);
        }
        List<Integer> listb = Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1);

        for (int i : listb) {
            montant_100 = enlever_unite(montant_100, i, "Pièce", affichage);
        }
        return affichage + "";
    }

    //ex12
    public static String temperature() {
        Integer[] tableau = {2, -3, 4, 14, 49, 10, 8};
        List<Integer> list;
        int distanceDeZero = 0;
        int valeur;
        list = Arrays.asList(tableau);
        for (int i : list) {
            if (i < 0) {
                valeur = -i;
            } else {
                valeur = i;
            }
            int index = list.indexOf(i);
            if (index == 0) {
                distanceDeZero = valeur;
            } else if (valeur < distanceDeZero) {
                distanceDeZero = valeur;
            }
        }
        return Outils.afficher("La température la plus proche de 0°C est " + distanceDeZero + "°C.");
    }

    //ex13
    public static String tri() {
        int nombreMin = MIN_VALUE ;
        int modifLorsDeLaBoucle = MIN_VALUE ;
        ArrayList<Integer> aTrier = new ArrayList<>();
        Integer[] tableau = {-5, 95, 35, -65, -7, 89, 7};
        Collections.addAll(aTrier, tableau);
        ArrayList<Integer> trier = new ArrayList<>(aTrier);
        boolean modification = true;

        //
            for (int y = 0; y < tableau.length; y++) {
                for (int i : aTrier) {
                    int index = aTrier.indexOf(i);
                    if (index == 0) {
                        nombreMin = i;
                    } else {
                        nombreMin = i;
                    }
                }
                aTrier.remove(Integer.valueOf(nombreMin));
                if (y == 0) {
                    modifLorsDeLaBoucle = nombreMin;
                    trier.set(y, nombreMin);
                } else if (y == tableau.length) {
                    trier.set(y, nombreMin);
                    modification = false;
                }
                else if (modifLorsDeLaBoucle != nombreMin) {
                    trier.set(y, nombreMin);
                }
                nombreMin = MIN_VALUE;
            }
         return Outils.afficher(String.valueOf(trier));
    }


    public static void main(String[] args) {
        //ex1
        //bonjour();

        //ex2
        //addition();

        //ex3
        //profitOuPerte();

        //ex4
        //trouverLePlusGrand();

        //ex5
        //prof();

        //ex6
        //calculatrice();

        //ex7
        //somme();

        //ex8
        //escalier();

        //ex9
        //pyramide();

        //ex10
        //vraiPyramide(); A revoir

        //ex11
        //monnaieEuro();

        //ex12
        //temperature();

        //ex13
        tri();

        //ex14


    }
}
