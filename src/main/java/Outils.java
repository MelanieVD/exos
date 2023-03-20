import java.util.Random;
import java.util.Scanner;

public class Outils {
    public static String afficher(String message) {
        System.out.println(message);
        return message;
    }

    public static void afficher(int valeur) {
        afficher("" + valeur);
    }

    public static void afficher(double valeur) {
        afficher("" + valeur);
    }

    public static void afficher(boolean valeur) {
        afficher("" + valeur);
    }

    public static String demande() {
        Scanner scanner = new Scanner((System.in));
        return scanner.nextLine();
    }

    public static String demande(String message) {
        System.out.println(message);
        return demande();
    }

    public static int demandeInt(String message) {
        return Integer.parseInt(demande(message));
    }

    public static double demandeDouble(String message) {
        return Double.parseDouble(demande(message));
    }

    public static boolean demandeBoolean(String message) {
        String valeur = demande(message);
        if (valeur.equals("true") || valeur.equals("vrai")) {
            return true;
        } else if (valeur.equals("false") || valeur.equals("faux")) {
            return false;
        } else {
            return demandeBoolean(message);
        }
    }

        public static void afficher (String...messages){
//        System.out.println(Arrays.toString(messages));
            for (String message : messages) {
                System.out.print(message + " ");
            }
        }

        public static int randInt ( int maximum){
            return new Random().nextInt(maximum);
        }

        public static int randInt ( int min, int max){
            return new Random().nextInt(min, max);
        }


    public static void main(String[] args) {
//        String nom = demande("Quel est votre nom ?");
//        afficher("Bonjour "+nom+ " !");
//        int age = demandeInt("Quel est ton age ?");
//        afficher("Tu as "+age+" ans.");
//        double taille = demandeDouble("Quel est ta taille ?");
//        afficher("Tu mesures "+taille+" m.");
//        boolean genre = demandeBoolean("Es-tu une fille ?");
//        afficher(genre);
//        afficher("Salut,", "comment", "ça", "va ?");
//        afficher("Hello", "world");
//        for (int i = 0; i < 100 ; i++) {
//            System.out.println(randInt());
//        }

    }


}
