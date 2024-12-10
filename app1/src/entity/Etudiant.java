package entity;

import service.IPersonne;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {
    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    private String generateMatricule(){
        String mat;
        mat = "ET-" + nom.charAt(0) + prenom.charAt(0) + '#';
        return mat.toUpperCase();
    }

    @Override
    public void saisie() {
        saisieP();
        matricule = generateMatricule();
        do{
            System.out.println("Donner la moyenne");
            Scanner scanner = new Scanner(System.in);
            moyenne = scanner.nextDouble();
        }while(moyenne < 0 || moyenne > 20);
    }

    @Override
    public void affiche() {
        System.out.println("Matricule: " + matricule.toUpperCase());
        System.out.println("Nom: " + nom.toUpperCase());
        System.out.println("Prenom: " + prenom);
        System.out.println("Moyenne: " + moyenne);
    }
}
