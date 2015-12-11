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
        Boolean valid = (jour>31) : false : ((jour>30) ? ((mois<8) ? ((mois%2==1) ? true : false) : ((mois%2==0) ? true : false)) : ((jour==29) ? ((mois==2) ? ((annee%100==0) ? ((annee%400==0) ? true : false) : ((annee%4==0) ? true : false)) : true) : true);
        String date = (valid==true) ? "valide" : "invalide";
        System.out.println("Cette date est " + date);
	}

}

