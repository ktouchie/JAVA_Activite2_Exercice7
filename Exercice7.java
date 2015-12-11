import java.util.Scanner;
class Exercice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une annee:");
        int annee = sc.nextInt();
        System.out.println("Veuillez saisir un mois:");
        int mois = sc.nextInt();
        System.out.println("Veuillez saisir un jour:");
        int jour = sc.nextInt();
        Boolean valid = true;
        if (jour>31) {
            valid = false;
        } else if (jour>30) {
            if (mois<8) {
                if (mois%2==1) {
                    valid = true;
                } else {
                    valid = false;
                }
            } else {
                if (mois%2==1) {
                    valid = false;
                } else {
                    valid = true;
                }
            }
        } else if (jour==29) {
            if (mois==2) {
                if (annee%100==0) {
                    if (annee%400==0) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                } else {
                    if (annee%4==0) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                }
            } else {
                valid = true;
            }
        } else {
            valid = true;
        }
        
        String date = (valid==true) ? "valide" : "invalide";
        System.out.println("Cette date est " + date);
	}

}

