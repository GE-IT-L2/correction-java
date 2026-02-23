package td2.exercice8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = scan.nextLine();

        boolean boucle = true;

        while (boucle) {
            System.out.print("\nchoisissez : \n1-Afficher la longueur de la chaîne. \n2-Vérifier si un mot ou une sous-chaîne est présent. \n3-Inverser la chaîne. \n4-Convertir la chaîne en majuscules ou minuscules. \n5- Extraire une sous-chaîne en fonction de deux indices. \n6-Remplacer un caractère spécifique par un autre. \n7- Vérifier si la chaîne est un palindrome. \n8- Diviser la chaîne en mots.  \n9- Compter les occurrences d'un caractère spécifique.\n10- Quitter le programme\n\nChoix : ");
        
        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("Longueur de la chaine : " + phrase.length());
                break;
            case 2 :
                System.out.println("Entrez un mot ou une sous-chaîne à vérifier : ");
                String mot = scan.next();

                if (phrase .contains(mot)) {
                    System.out.println(mot + "   est présent dans la phrase.");
                } else {
                    System.out.println(mot + " n'est pas présent dans la phrase.");
                }
                break;
            case 3 :
                String chaineInversee = new StringBuilder(phrase).reverse().toString();
                System.out.println("Chaine inversée : " + chaineInversee);
                break;
            case 4 :
                System.out.println("1- Convertir en majuscules \n2- Convertir en minuscules \nChoix : ");
                
                int choix = scan.nextInt();
                switch (choix) {
                    case 1:
                        System.out.println("Phrase en majuscules : " + phrase.toUpperCase());
                        break;
                    case 2:
                        System.out.println("Phrase en minuscules : " + phrase.toLowerCase());
                        break;
                    default:
                        System.out.println("Choix invalide.");
                }
                break;
            case 5 :
                System.out.println("Entrez les indices de début et de fin pour extraire la sous-chaîne : ");
                int debut = scan.nextInt();
                int fin = scan.nextInt();

                if (debut >= 0 && fin <= phrase.length() && debut < fin) {
                    String sousChaine = phrase.substring(debut, fin);
                    System.out.println("Sous-chaîne extraite : " + sousChaine);
                } else {
                    System.out.println("Indices invalides.");
                }
                break;
            case 6 :
                System.out.println("Entrez le caractère à remplacer : ");
                char aRemplacer = scan.next().charAt(0);
                System.out.println("Entrez le caractère de remplacement : ");
                char remplacement = scan.next().charAt(0);

                String phraseModifiee = phrase.replace(aRemplacer, remplacement);
                System.out.println("Phrase modifiée : " + phraseModifiee);
                break;
            case 7 :
                String[] mots = phrase.split(" ");
                System.out.println("Mots dans la phrase :");
                for (String motP : mots) {
                    System.out.println(motP + " est un palindrome : " + motP.equalsIgnoreCase(new StringBuilder(motP).reverse().toString()));
                }
                break;
            case 9 :
                System.out.println("Entrez le caractère à compter : ");
                char caractere = scan.next().charAt(0);

                int count = 0;
                for (int i = 0; i < phrase.length(); i++) {
                    if (phrase.charAt(i) == caractere) {
                        count++;
                    }
                }
                System.out.println("Le caractère '" + caractere + "' apparaît " + count + " fois dans la phrase.");
                break;
            case 8 :
                String[] motsDivises = phrase.split(" ");
                System.out.println("Mots dans la phrase :");
                for (String motD : motsDivises) {
                    System.out.println("mot : " + motD);
                }
                break;
            case 10 :
                boucle = false;
                System.out.println("fin du programme");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
        }
        scan.close();
    }
}